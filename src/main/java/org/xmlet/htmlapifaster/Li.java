package org.xmlet.htmlapifaster;

public final class Li<Z extends Element> implements GlobalAttributes<Li<Z>, Z>, FlowContentChoice<Li<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Li(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementLi(this);
   }

   public Li(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementLi(this);
   }

   protected Li(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementLi(this);
      }

   }

   public Z __() {
      this.visitor.visitParentLi(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "li";
   }

   public final Li<Z> self() {
      return this;
   }

   public final Li<Z> attrValue(Integer attrValue) {
      this.visitor.visitAttributeValue(attrValue.toString());
      return this;
   }
}
