package org.xmlet.htmlapifaster;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.async.AsyncElement;
import org.xmlet.htmlapifaster.async.SupplierMemoize;
import org.xmlet.htmlapifaster.async.Thenable;
import org.xmlet.htmlapifaster.async.ThenableImpl;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface Element<T extends Element, Z extends Element> extends AsyncElement<T> {
   T self();

   ElementVisitor getVisitor();

   String getName();

   Z __();

   Z getParent();

   default <E> Thenable<T> async(Publisher<E> obs, BiConsumer<T, Publisher<E>> asyncAction) {
      this.getVisitor().visitAsync(this::self, asyncAction, obs);
      return new ThenableImpl<>(this.getVisitor(),
              new SupplierMemoize<>(this::self),
              obs);
   }

   default T dynamic(Consumer<T> consumer) {
      T self = this.self();
      ElementVisitor visitor = this.getVisitor();
      visitor.visitOpenDynamic();
      consumer.accept(self);
      visitor.visitCloseDynamic();
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
