package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Rb<Z extends Element> implements GlobalAttributes<Rb<Z>, Z>, PhrasingContentChoice<Rb<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Rb(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRb(this);
   }

   public Rb(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRb(this);
   }

   protected Rb(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRb(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRb(this);
      return this.parent;
   }

   public final Rb<Z> dynamic(Consumer<Rb<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Rb<Z> of(Consumer<Rb<Z>> consumer) {
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
      return "rb";
   }

   public final Rb<Z> self() {
      return this;
   }
}
