package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Rp<Z extends Element> implements GlobalAttributes<Rp<Z>, Z>, PhrasingContentChoice<Rp<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Rp(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRp(this);
   }

   public Rp(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRp(this);
   }

   protected Rp(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRp(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRp(this);
      return this.parent;
   }

   public final Rp<Z> dynamic(Consumer<Rp<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Rp<Z> of(Consumer<Rp<Z>> consumer) {
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
      return "rp";
   }

   public final Rp<Z> self() {
      return this;
   }
}
