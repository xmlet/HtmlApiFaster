package org.xmlet.htmlapifaster.async;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.Element;
import org.xmlet.htmlapifaster.ElementVisitor;

import java.util.function.BiConsumer;
import java.util.function.Function;

import static org.xmlet.htmlapifaster.async.PublisherOnCompleteHandlerProxy.proxyPublisher;

public class ThenableImpl<E extends Element> implements AsyncElement<E>{
    
    private final ElementVisitor visitor;
    private final SupplierMemoize<E> next;
    public ThenableImpl(ElementVisitor visitor, SupplierMemoize<E> next) {
        this.visitor = visitor;
        this.next = next;
    }
    
    @Override
    public <T> E async(Publisher<T> obs, BiConsumer<E, Publisher<T>> asyncAction) {
        PublisherOnCompleteHandlerProxy.PublisherOnCompleteHandler<T> proxy = proxyPublisher(obs);
        final OnPublisherCompletion publisherCompletion = visitor.visitAsync(this.next.get(), asyncAction, proxy);
        proxy.addOnCompleteHandler(publisherCompletion);
//        return new ThenableImpl<>(visitor, this.next);
        return this.next.get();
    }
}
