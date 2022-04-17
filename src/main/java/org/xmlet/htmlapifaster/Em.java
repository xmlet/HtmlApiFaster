package org.xmlet.htmlapifaster;

public final class Em<Z extends Element> implements GlobalAttributes<Em<Z>, Z>, PhrasingContentChoice<Em<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Em(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementEm(this);
   }

   public Em(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementEm(this);
   }

   protected Em(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementEm(this);
      }

   }

   public Z __() {
      this.visitor.visitParentEm(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "em";
   }

   public final Em<Z> self() {
      return this;
   }
}
