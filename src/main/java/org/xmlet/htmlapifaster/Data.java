package org.xmlet.htmlapifaster;

public final class Data<Z extends Element> implements GlobalAttributes<Data<Z>, Z>, PhrasingContentChoice<Data<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Data(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementData(this);
   }

   public Data(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementData(this);
   }

   protected Data(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementData(this);
      }

   }

   public Z __() {
      this.visitor.visitParentData(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "data";
   }

   public final Data<Z> self() {
      return this;
   }

   public final Data<Z> attrValue(String attrValue) {
      this.visitor.visitAttributeValue(attrValue);
      return this;
   }
}
