package org.xmlet.htmlapifaster;

import io.reactivex.rxjava3.core.Observable;
import org.xmlet.htmlapifaster.async.SupplierMemoize;
import org.xmlet.htmlapifaster.async.Thenable;
import org.xmlet.htmlapifaster.async.ThenableImpl;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface Element<T extends Element, Z extends Element> {
   T self();

   ElementVisitor getVisitor();

   String getName();

   Z __();

   Z getParent();
   
   default <E, O extends Observable<E>> Thenable<T> async(O obs, BiConsumer<T, O> asyncAction) {
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
