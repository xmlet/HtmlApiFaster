package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public interface Element<T extends Element, Z extends Element> {
   T self();

   ElementVisitor getVisitor();

   String getName();

   Z __();

   Z getParent();

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
