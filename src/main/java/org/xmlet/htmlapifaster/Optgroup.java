package org.xmlet.htmlapifaster;

public final class Optgroup<Z extends Element> implements GlobalAttributes<Optgroup<Z>, Z>, OptgroupAll0<Optgroup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Optgroup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOptgroup(this);
   }

   public Optgroup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOptgroup(this);
   }

   protected Optgroup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOptgroup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOptgroup(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "optgroup";
   }

   public final Optgroup<Z> self() {
      return this;
   }

   public final Optgroup<Z> attrDisabled(Boolean attrDisabled) {
      this.visitor.visitAttributeDisabled(attrDisabled.toString());
      return this;
   }

   public final Optgroup<Z> attrLabel(String attrLabel) {
      this.visitor.visitAttributeLabel(attrLabel);
      return this;
   }
}
