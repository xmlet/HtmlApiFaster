package org.xmlet.htmlapifaster;

public final class Time<Z extends Element> implements GlobalAttributes<Time<Z>, Z>, PhrasingContentChoice<Time<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Time(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTime(this);
   }

   public Time(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTime(this);
   }

   protected Time(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTime(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTime(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "time";
   }

   public final Time<Z> self() {
      return this;
   }

   public final Time<Z> attrDatetime(String attrDatetime) {
      this.visitor.visitAttributeDatetime(attrDatetime);
      return this;
   }
}
