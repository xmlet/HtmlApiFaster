package org.xmlet.htmlapifaster;

public final class Hr<Z extends Element> implements GlobalAttributes<Hr<Z>, Z>, TextGroup<Hr<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Hr(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementHr(this);
   }

   public Hr(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementHr(this);
   }

   protected Hr(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementHr(this);
      }

   }

   public Z __() {
      this.visitor.visitParentHr(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "hr";
   }

   public final Hr<Z> self() {
      return this;
   }
}
