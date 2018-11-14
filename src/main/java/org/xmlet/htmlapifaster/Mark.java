package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Mark<Z extends Element> implements GlobalAttributes<Mark<Z>, Z>, PhrasingContentChoice<Mark<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Mark(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMark(this);
   }

   public Mark(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMark(this);
   }

   protected Mark(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMark(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMark(this);
      return this.parent;
   }

   public final Mark<Z> dynamic(Consumer<Mark<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Mark<Z> of(Consumer<Mark<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "mark";
   }

   public final Mark<Z> self() {
      return this;
   }
}
