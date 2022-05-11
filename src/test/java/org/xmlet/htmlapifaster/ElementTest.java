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
import org.xmlet.htmlapifaster.async.SupplierMemoize;
import org.xmlet.htmlapifaster.async.Thenable;

import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
            
            BiConsumer<Table<Body<Html<Element>>>, Observable<String>> cons =
                    (elem, obs) -> obs.subscribe(s -> elem.thead().tr().text(s));
            
            final Table<Body<Html<Element>>> table = new Html<>(visitor)
                    .body()
                    .table();
            
            doNothing().when(visitor).visitAsync(supplierArgumentCaptor.capture(), eq(cons), eq(stringObservable));
            
            table.async(stringObservable, cons);
            
            assertEquals(table, supplierArgumentCaptor.getValue().get());
        }
        
        @Test
        void given_parameters_when_async_then_thenable_passes_correct_reference_when_calling_async() {
            
            ArgumentCaptor<SupplierMemoize> supplierArgumentCaptor = ArgumentCaptor.forClass(SupplierMemoize.class);
            final Observable<String> stringObservable = Observable.fromArray("1", "2", "3");
            final Observable<Integer> integerObservable = Observable.fromArray(1, 2, 3);
            
            BiConsumer<Table<Body<Html<Element>>>, Observable<String>> cons =
                    (elem, obs) -> obs.subscribe(s -> elem.thead().tr().text(s));
            
            BiConsumer<Table<Body<Html<Element>>>, Observable<Integer>> consBody =
                    (elem,obs) -> obs.subscribe(elem::text);
            
            final Thenable<Table<Body<Html<Element>>>> thenable = new Html<>(visitor)
                    .body()
                    .table()
                    .async(stringObservable, cons);
            
            doNothing().when(visitor).visitAsync(supplierArgumentCaptor.capture(), eq(consBody), eq(integerObservable));
            
            thenable.async(integerObservable, consBody);
            
            assertTrue(supplierArgumentCaptor.getValue().get().getClass().isAssignableFrom(Table.class));
        }
        
        @Test
        void given_parameters_when_calling_then_thenable_passes_correct_reference_when_calling_async() {
            
            ArgumentCaptor<SupplierMemoize> supplierArgumentCaptor = ArgumentCaptor.forClass(SupplierMemoize.class);
            final Observable<String> stringObservable = Observable.fromArray("1", "2", "3");
            
            BiConsumer<Table<Body<Html<Element>>>, Observable<String>> cons =
                    (elem, obs) -> obs.subscribe(s -> elem.thead().tr().text(s));
            
            Function<Table<Body<Html<Element>>>,Html<Element>> bodyCont = elem -> elem.__().__();
    
            final Thenable<Table<Body<Html<Element>>>> thenable = new Html<>(visitor)
                    .body()
                    .table()
                    .async(stringObservable, cons);
    
            doNothing().when(visitor).visitThen(supplierArgumentCaptor.capture());
            
            thenable.then(bodyCont);
            
            assertTrue(supplierArgumentCaptor.getValue().get().getClass().isAssignableFrom(Html.class));
        }
    }
    
    @Test
    void test_async_view() {
        Observable<String> titles = Observable
                .fromArray("542", "22", "3333", "42", "541241");
    
        Observable<Long> items = Observable
                .intervalRange(1, 5, 0, 10, TimeUnit.MILLISECONDS);
    
        final Thenable<Element> thenable = new Html<>(visitor)
                .head()
                .title()
                .text("This is test for the async")
                .__()
                .__()
                .body()
                .div()
                .p()
                .text("Creating table from reactive models")
                .__()
                .__()
                .div()
                .table()
                .thead()
                .async(items,
                        (thead, itemsObs) -> itemsObs.subscribe(nr -> thead.tr().text(nr).__()))
                .then(thead -> thead.__().__().table().thead())
                .async(titles,
                        (thead, titlesObs) -> titlesObs.subscribe(s -> thead.tr().text(s).__()))
                .then(table -> table.__()
                        .__()
                        .div().p().text("This is after the tables")
                        .__()
                        .__()
                        .__()
                        .__()
                        .__());
        
        assertNotNull(thenable);
    }
}
