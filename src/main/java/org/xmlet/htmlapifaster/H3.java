package org.xmlet.htmlapifaster;

public final class H3<Z extends Element> implements GlobalAttributes<H3<Z>, Z>, PhrasingContentChoice<H3<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public H3(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementH3(this);
   }

   public H3(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementH3(this);
   }

   protected H3(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementH3(this);
      }

   }

   public Z __() {
      this.visitor.visitParentH3(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "h3";
   }

   public final H3<Z> self() {
      return this;
   }
}
