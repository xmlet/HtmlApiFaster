package org.xmlet.htmlapifaster;

public final class Br<Z extends Element> implements GlobalAttributes<Br<Z>, Z>, TextGroup<Br<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Br(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBr(this);
   }

   public Br(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBr(this);
   }

   protected Br(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBr(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBr(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "br";
   }

   public final Br<Z> self() {
      return this;
   }
}
