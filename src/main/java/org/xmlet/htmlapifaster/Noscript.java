package org.xmlet.htmlapifaster;

public final class Noscript<Z extends Element> implements GlobalAttributes<Noscript<Z>, Z>, TransparentContentChoice<Noscript<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Noscript(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNoscript(this);
   }

   public Noscript(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNoscript(this);
   }

   protected Noscript(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNoscript(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNoscript(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "noscript";
   }

   public final Noscript<Z> self() {
      return this;
   }
}
