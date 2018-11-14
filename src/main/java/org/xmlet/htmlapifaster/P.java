package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class P<Z extends Element> implements GlobalAttributes<P<Z>, Z>, PhrasingContentChoice<P<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public P(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementP(this);
   }

   public P(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementP(this);
   }

   protected P(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementP(this);
      }

   }

   public Z __() {
      this.visitor.visitParentP(this);
      return this.parent;
   }

   public final P<Z> dynamic(Consumer<P<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final P<Z> of(Consumer<P<Z>> consumer) {
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
      return "p";
   }

   public final P<Z> self() {
      return this;
   }
}
