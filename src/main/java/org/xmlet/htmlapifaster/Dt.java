package org.xmlet.htmlapifaster;

public final class Dt<Z extends Element> implements GlobalAttributes<Dt<Z>, Z>, AltFlowContentChoice<Dt<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Dt(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDt(this);
   }

   public Dt(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDt(this);
   }

   protected Dt(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDt(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDt(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "dt";
   }

   public final Dt<Z> self() {
      return this;
   }
}
