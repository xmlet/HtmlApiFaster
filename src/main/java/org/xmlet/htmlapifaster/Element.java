package org.xmlet.htmlapifaster;

import org.xmlet.htmlapifaster.async.AsyncElement;
import org.xmlet.htmlapifaster.async.AwaitConsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface Element<T extends Element, Z extends Element> extends AsyncElement<T> {
   T self();

   ElementVisitor getVisitor();

   String getName();

   Z __();

   Z getParent();

   /**
    * Executes an async operation on a certain model
    * @param asyncAction The async action to be executed on a element and model
    * @return The processed element
    * @param <M> Generic type fo the received model
    */
   @Override
   default <M> T await(AwaitConsumer<T,M> asyncAction) {
      final T self = self();
      this.getVisitor().visitAwait(self, asyncAction);
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
