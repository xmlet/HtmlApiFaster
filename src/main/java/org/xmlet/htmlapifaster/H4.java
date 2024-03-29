package org.xmlet.htmlapifaster;

public final class H4<Z extends Element> implements GlobalAttributes<H4<Z>, Z>, PhrasingContentChoice<H4<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public H4(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementH4(this);
   }

   public H4(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementH4(this);
   }

   protected H4(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementH4(this);
      }

   }

   public Z __() {
      this.visitor.visitParentH4(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "h4";
   }

   public final H4<Z> self() {
      return this;
   }
}
