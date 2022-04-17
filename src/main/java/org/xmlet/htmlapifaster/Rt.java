package org.xmlet.htmlapifaster;

public final class Rt<Z extends Element> implements GlobalAttributes<Rt<Z>, Z>, PhrasingContentChoice<Rt<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Rt(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRt(this);
   }

   public Rt(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRt(this);
   }

   protected Rt(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRt(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRt(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "rt";
   }

   public final Rt<Z> self() {
      return this;
   }
}
