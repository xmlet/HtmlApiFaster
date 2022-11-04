package org.xmlet.htmlapifaster;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.async.AsyncElement;
import org.xmlet.htmlapifaster.async.OnPublisherCompletion;
import org.xmlet.htmlapifaster.async.PublisherOnCompleteHandlerProxy;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static org.xmlet.htmlapifaster.async.PublisherOnCompleteHandlerProxy.proxyPublisher;

public interface Element<T extends Element, Z extends Element> extends AsyncElement<T> {
   T self();

   ElementVisitor getVisitor();

   String getName();

   Z __();

   Z getParent();

   default <E> T async(Publisher<E> obs, BiConsumer<T, Publisher<E>> asyncAction) {
      final T self = self();
      PublisherOnCompleteHandlerProxy.PublisherOnCompleteHandler<E> proxy = proxyPublisher(obs);
      final OnPublisherCompletion publisherCompletion = this.getVisitor().visitAsync(self, asyncAction, proxy);
      proxy.addOnCompleteHandler(publisherCompletion);
      return self;
   }

   /**
    * @param consumer The continuation that consumes the element and a model.
    * @return The same element that is passed to the consumer, corresponding to this element, i.e. self.
    * @param <U> The type of the model.
    */
   default <U> T dynamic(BiConsumer<T, U> consumer) {
      T self = this.self();
      this.getVisitor().visitDynamic(self, consumer);
      return self;
   }

   default T of(Consumer<T> consumer) {
      T self = this.self();
      consumer.accept(self);
      return self;
   }

   default CustomElement<T> custom(String name) {
      return new CustomElement(this.self(), name);
   }
}
