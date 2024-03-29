package org.xmlet.htmlapifaster;

public final class Sub<Z extends Element> implements GlobalAttributes<Sub<Z>, Z>, PhrasingContentChoice<Sub<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Sub(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSub(this);
   }

   public Sub(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSub(this);
   }

   protected Sub(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSub(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSub(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "sub";
   }

   public final Sub<Z> self() {
      return this;
   }
}
