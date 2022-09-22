package org.xmlet.htmlapifaster.async;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.Element;
import org.xmlet.htmlapifaster.ElementVisitor;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class ThenableImpl<E extends Element, I> implements Thenable<E>{
    
    private final ElementVisitor visitor;
    private final SupplierMemoize<E> next;
    private final Publisher<I> pipeline;
    
    public ThenableImpl(ElementVisitor visitor, SupplierMemoize<E> next, Publisher<I> pipeline) {
        this.visitor = visitor;
        this.next = next;
        this.pipeline = pipeline;
    }
    
    @Override
    public <T> Thenable<E> async(Publisher<T> obs, BiConsumer<E, Publisher<T>> asyncAction) {
        visitor.visitAsync(this.next,asyncAction, obs);
        return new ThenableImpl<>(visitor,
                this.next,
                obs);
    }
    
    @Override
    public <R extends Element> Thenable<R> then(Function<E, R> cont) {
        final SupplierMemoize<R> nextElem = new SupplierMemoize<>(() -> cont.apply(this.next.get()));
        visitor.visitThen(nextElem);
        return new ThenableImpl<>(visitor, nextElem, this.pipeline);
    }
}
