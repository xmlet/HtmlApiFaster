package org.xmlet.htmlapifaster.async;

import io.reactivex.rxjava3.core.Observable;
import org.xmlet.htmlapifaster.Element;
import org.xmlet.htmlapifaster.ElementVisitor;

import java.util.function.Consumer;
import java.util.function.Function;

public class ThenableImpl<E extends Element, I> implements Thenable<E>{
    
    private final ElementVisitor visitorCache;
    private final SupplierMemoize<E> next;
    private final Observable<I> pipeline;
    
    public ThenableImpl(ElementVisitor visitorCache, SupplierMemoize<E> next, Observable<I> pipeline) {
        this.visitorCache = visitorCache;
        this.next = next;
        this.pipeline = pipeline;
    }
    
    @Override
    public <R extends Element, T, O extends Observable<T>> Thenable<R> async(O obs, Consumer<E> asyncAction, Continuation<E,R> continuation) {
        visitorCache.visitAsync(this.next,asyncAction, obs);
        return new ThenableImpl<>(visitorCache,
                new SupplierMemoize<>(() -> continuation.onContinue(this.next.get())),
                obs);
    }
    
    @Override
    public <R extends Element> Thenable<R> then(Function<E, R> cont) {
        final SupplierMemoize<R> nextElem = new SupplierMemoize<>(() -> cont.apply(this.next.get()));
        visitorCache.visitThen(nextElem);
        return new ThenableImpl<>(visitorCache, nextElem, this.pipeline);
    }
}
