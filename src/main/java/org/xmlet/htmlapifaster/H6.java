package org.xmlet.htmlapifaster;

public final class H6<Z extends Element> implements GlobalAttributes<H6<Z>, Z>, PhrasingContentChoice<H6<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public H6(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementH6(this);
   }

   public H6(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementH6(this);
   }

   protected H6(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementH6(this);
      }

   }

   public Z __() {
      this.visitor.visitParentH6(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "h6";
   }

   public final H6<Z> self() {
      return this;
   }
}
