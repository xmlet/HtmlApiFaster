package org.xmlet.htmlapifaster;

public final class B<Z extends Element> implements GlobalAttributes<B<Z>, Z>, PhrasingContentChoice<B<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public B(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementB(this);
   }

   public B(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementB(this);
   }

   protected B(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementB(this);
      }

   }

   public Z __() {
      this.visitor.visitParentB(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "b";
   }

   public final B<Z> self() {
      return this;
   }
}
