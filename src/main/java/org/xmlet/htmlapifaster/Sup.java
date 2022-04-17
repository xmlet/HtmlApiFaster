package org.xmlet.htmlapifaster;

public final class Sup<Z extends Element> implements GlobalAttributes<Sup<Z>, Z>, PhrasingContentChoice<Sup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Sup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSup(this);
   }

   public Sup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSup(this);
   }

   protected Sup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSup(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "sup";
   }

   public final Sup<Z> self() {
      return this;
   }
}
