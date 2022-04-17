package org.xmlet.htmlapifaster;

public final class Small<Z extends Element> implements GlobalAttributes<Small<Z>, Z>, PhrasingContentChoice<Small<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Small(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSmall(this);
   }

   public Small(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSmall(this);
   }

   protected Small(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSmall(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSmall(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "small";
   }

   public final Small<Z> self() {
      return this;
   }
}
