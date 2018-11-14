package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Var<Z extends Element> implements GlobalAttributes<Var<Z>, Z>, PhrasingContentChoice<Var<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Var(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementVar(this);
   }

   public Var(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementVar(this);
   }

   protected Var(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementVar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentVar(this);
      return this.parent;
   }

   public final Var<Z> dynamic(Consumer<Var<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Var<Z> of(Consumer<Var<Z>> consumer) {
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
      return "var";
   }

   public final Var<Z> self() {
      return this;
   }
}
