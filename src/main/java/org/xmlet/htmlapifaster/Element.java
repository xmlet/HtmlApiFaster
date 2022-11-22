package org.xmlet.htmlapifaster;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.async.AsyncElement;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public interface Element<T extends Element, Z extends Element> extends AsyncElement<T> {
   T self();

   ElementVisitor getVisitor();

   String getName();

   Z __();

   Z getParent();

   default <M,E> T await(Class<E> clazz, Function<M, Publisher<E>> objectMapper, BiConsumer<T, Publisher<E>> asyncAction) {
      final T self = self();
      this.getVisitor().visitAwait(self, clazz, asyncAction, objectMapper);
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
