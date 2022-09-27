package org.xmlet.htmlapifaster.async;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.Element;
import org.xmlet.htmlapifaster.ElementVisitor;

import java.util.function.BiConsumer;
import java.util.function.Function;

import static org.xmlet.htmlapifaster.async.PublisherOnCompleteHandlerProxy.proxyPublisher;

public class ThenableImpl<E extends Element> implements Thenable<E>{
    
    private final ElementVisitor visitor;
    private final SupplierMemoize<E> next;
    public ThenableImpl(ElementVisitor visitor, SupplierMemoize<E> next) {
        this.visitor = visitor;
        this.next = next;
    }
    
    @Override
    public <T> Thenable<E> async(Publisher<T> obs, BiConsumer<E, Publisher<T>> asyncAction) {
        PublisherOnCompleteHandlerProxy.PublisherOnCompleteHandler<T> proxy = proxyPublisher(obs);
        final OnPublisherCompletion publisherCompletion = visitor.visitAsync(this.next, asyncAction, proxy);
        proxy.addOnCompleteHandler(publisherCompletion);
        return new ThenableImpl<>(visitor, this.next);
    }
    
    @Override
    public <R extends Element> Thenable<R> then(Function<E, R> cont) {
        final SupplierMemoize<R> nextElem = new SupplierMemoize<>(() -> cont.apply(this.next.get()));
        visitor.visitThen(nextElem);
        return new ThenableImpl<>(visitor, nextElem);
    }
}
