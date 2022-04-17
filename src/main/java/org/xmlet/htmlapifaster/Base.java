package org.xmlet.htmlapifaster;

public final class Base<Z extends Element> implements GlobalAttributes<Base<Z>, Z>, TextGroup<Base<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Base(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBase(this);
   }

   public Base(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBase(this);
   }

   protected Base(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBase(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBase(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "base";
   }

   public final Base<Z> self() {
      return this;
   }

   public final Base<Z> attrHref(String attrHref) {
      this.visitor.visitAttributeHref(attrHref);
      return this;
   }

   public final Base<Z> attrTarget(String attrTarget) {
      this.visitor.visitAttributeTarget(attrTarget);
      return this;
   }
}
