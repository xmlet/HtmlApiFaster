package org.xmlet.htmlapifaster;

public final class Summary<Z extends Element> implements GlobalAttributes<Summary<Z>, Z>, PhrasingContentChoice<Summary<Z>, Z>, HeadingContentAll11<Summary<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Summary(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSummary(this);
   }

   public Summary(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSummary(this);
   }

   protected Summary(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSummary(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSummary(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "summary";
   }

   public final Summary<Z> self() {
      return this;
   }
}
