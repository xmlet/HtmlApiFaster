package org.xmlet.htmlapifaster;

public final class Bdo<Z extends Element> implements GlobalAttributes<Bdo<Z>, Z>, PhrasingContentChoice<Bdo<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Bdo(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBdo(this);
   }

   public Bdo(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBdo(this);
   }

   protected Bdo(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBdo(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBdo(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "bdo";
   }

   public final Bdo<Z> self() {
      return this;
   }
}
