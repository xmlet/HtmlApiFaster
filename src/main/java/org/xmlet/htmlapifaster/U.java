package org.xmlet.htmlapifaster;

public final class U<Z extends Element> implements GlobalAttributes<U<Z>, Z>, PhrasingContentChoice<U<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public U(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementU(this);
   }

   public U(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementU(this);
   }

   protected U(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementU(this);
      }

   }

   public Z __() {
      this.visitor.visitParentU(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "u";
   }

   public final U<Z> self() {
      return this;
   }
}
