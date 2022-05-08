package org.xmlet.htmlapifaster;


import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.xmlet.htmlapifaster.async.Continuation;
import org.xmlet.htmlapifaster.async.SupplierMemoize;
import org.xmlet.htmlapifaster.async.Thenable;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doNothing;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
class ElementTest {
    
    @Mock
    private ElementVisitor visitor;
    
    @DisplayName("When calling async")
    @Nested
    class AsyncMethodTest {
        
        @Test
        void given_parameters_when_async_then_visitor_receives_correct_reference() {
            
            ArgumentCaptor<Supplier> supplierArgumentCaptor = ArgumentCaptor.forClass(Supplier.class);
            final Observable<String> stringObservable = Observable.fromArray("1", "2", "3");
            
            Consumer<Table<Body<Html<Element>>>> cons = elem -> stringObservable.subscribe(s -> elem.thead().tr().text(s));
            
            Continuation<Table<Body<Html<Element>>>, Body<Html<Element>>> cont = Table::__;
            
            final Table<Body<Html<Element>>> table = new Html<>(visitor)
                    .body()
                    .table();
            
            doNothing().when(visitor).visitAsync(supplierArgumentCaptor.capture(), eq(cons), eq(stringObservable));
            
            table.async(stringObservable, cons, cont);
            
            assertEquals(table, supplierArgumentCaptor.getValue().get());
        }
        
        @Test
        void given_parameters_when_async_then_thenable_passes_correct_reference_when_calling_async() {
            
            ArgumentCaptor<SupplierMemoize> supplierArgumentCaptor = ArgumentCaptor.forClass(SupplierMemoize.class);
            final Observable<String> stringObservable = Observable.fromArray("1", "2", "3");
            final Observable<Integer> integerObservable = Observable.fromArray(1, 2, 3);
            
            Consumer<Table<Body<Html<Element>>>> cons = elem -> stringObservable.subscribe(s -> elem.thead().tr().text(s));
            Continuation<Table<Body<Html<Element>>>, Body<Html<Element>>> cont = Table::__;
            
            Consumer<Body<Html<Element>>> consBody = elem -> integerObservable.subscribe(elem::text);
            Continuation<Body<Html<Element>>,Html<Element>> bodyCont = Body::__;
            
            final Thenable<Body<Html<Element>>> thenable = new Html<>(visitor)
                    .body()
                    .table()
                    .async(stringObservable, cons, cont);
            
            doNothing().when(visitor).visitAsync(supplierArgumentCaptor.capture(), eq(consBody), eq(integerObservable));
            
            thenable.async(integerObservable, consBody, bodyCont);
            
            assertTrue(supplierArgumentCaptor.getValue().get().getClass().isAssignableFrom(Body.class));
        }
        
        @Test
        void given_parameters_when_calling_then_thenable_passes_correct_reference_when_calling_async() {
            
            ArgumentCaptor<SupplierMemoize> supplierArgumentCaptor = ArgumentCaptor.forClass(SupplierMemoize.class);
            final Observable<String> stringObservable = Observable.fromArray("1", "2", "3");
            
            Consumer<Table<Body<Html<Element>>>> cons = elem -> stringObservable.subscribe(s -> elem.thead().tr().text(s));
            Continuation<Table<Body<Html<Element>>>, Body<Html<Element>>> cont = Table::__;
            
            Function<Body<Html<Element>>,Html<Element>> bodyCont = Body::__;
            
            final Thenable<Body<Html<Element>>> thenable = new Html<>(visitor)
                    .body()
                    .table()
                    .async(stringObservable, cons, cont);
            
            doNothing().when(visitor).visitThen(supplierArgumentCaptor.capture());
            
            thenable.then(bodyCont);
            
            assertTrue(supplierArgumentCaptor.getValue().get().getClass().isAssignableFrom(Html.class));
        }
    }
}
