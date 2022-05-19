package org.xmlet.htmlapifaster.async;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.xmlet.htmlapifaster.Body;
import org.xmlet.htmlapifaster.Element;
import org.xmlet.htmlapifaster.ElementVisitor;
import org.xmlet.htmlapifaster.Html;
import org.xmlet.htmlapifaster.Table;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
class SupplierMemoizeTest {
    
    @Mock
    private ElementVisitor visitor;
    
    @Test
    void given_supplier_on_get_when_value_is_null_calls_supplier() {
    
        Table<Body<Html<Element>>> table = new Html<>(visitor)
                .body()
                .table();
        
        final Supplier<Table<Body<Html<Element>>>> tableSupplier = spy(new MockSupplier<>(table));
        final SupplierMemoize<Table<Body<Html<Element>>>> memoize = new SupplierMemoize<>(tableSupplier);
    
    
        final Table<Body<Html<Element>>> actual = memoize.get();
        
        assertEquals(table, actual);
        verify(tableSupplier, times(1)).get();
    }
    
    @Test
    void given_supplier_on_get_when_value_is_not_null_does_not_call_supplier() {
    
        Table<Body<Html<Element>>> table = new Html<>(visitor)
                .body()
                .table();
        
        final Supplier<Table<Body<Html<Element>>>> tableSupplier = spy(new MockSupplier<>(table));
        final SupplierMemoize<Table<Body<Html<Element>>>> memoize = new SupplierMemoize<>(tableSupplier);
        
        
        final Table<Body<Html<Element>>> actual = memoize.get();
        assertEquals(table, actual);
        final Table<Body<Html<Element>>> secondActual = memoize.get();
        assertEquals(table, secondActual);
        
        verify(tableSupplier, times(1)).get();
    }
    
    
    
    private class MockSupplier<T extends Element> implements Supplier<T> {
    
        private final T elem;
    
        private MockSupplier(T elem) {
            this.elem = elem;
        }
    
        @Override
        public T get() {
            return elem;
        }
    }
}
