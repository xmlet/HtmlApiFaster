package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Figcaption<Z extends Element> implements GlobalAttributes<Figcaption<Z>, Z>, FlowContentChoice<Figcaption<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Figcaption(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFigcaption(this);
   }

   public Figcaption(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFigcaption(this);
   }

   protected Figcaption(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFigcaption(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFigcaption(this);
      return this.parent;
   }

   public final Figcaption<Z> dynamic(Consumer<Figcaption<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Figcaption<Z> of(Consumer<Figcaption<Z>> consumer) {
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
      return "figcaption";
   }

   public final Figcaption<Z> self() {
      return this;
   }
}
