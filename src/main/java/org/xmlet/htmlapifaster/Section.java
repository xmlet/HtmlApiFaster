package org.xmlet.htmlapifaster;

public final class Section<Z extends Element> implements GlobalAttributes<Section<Z>, Z>, FlowContentChoice<Section<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Section(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSection(this);
   }

   public Section(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSection(this);
   }

   protected Section(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSection(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSection(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "section";
   }

   public final Section<Z> self() {
      return this;
   }
}
