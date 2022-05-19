package org.xmlet.htmlapifaster.async;

import org.xmlet.htmlapifaster.Element;

import java.util.function.Supplier;

public class SupplierMemoize<T extends Element> implements Supplier<T> {
    
    private final Supplier<T> insider;
    private T value = null;
    
    public SupplierMemoize(Supplier<T> insider) {
        this.insider = insider;
    }
    
    @Override
    public T get() {
        if(value == null) {
            value = insider.get();
        }
        return value;
    }
}
