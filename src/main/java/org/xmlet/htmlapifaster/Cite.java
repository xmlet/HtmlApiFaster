package org.xmlet.htmlapifaster;

public final class Cite<Z extends Element> implements GlobalAttributes<Cite<Z>, Z>, PhrasingContentChoice<Cite<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Cite(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCite(this);
   }

   public Cite(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCite(this);
   }

   protected Cite(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCite(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCite(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "cite";
   }

   public final Cite<Z> self() {
      return this;
   }
}
