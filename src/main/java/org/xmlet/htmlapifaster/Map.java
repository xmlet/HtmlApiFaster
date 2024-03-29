package org.xmlet.htmlapifaster;

public final class Map<Z extends Element> implements GlobalAttributes<Map<Z>, Z>, TransparentContentChoice<Map<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Map(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMap(this);
   }

   public Map(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMap(this);
   }

   protected Map(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMap(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMap(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "map";
   }

   public final Map<Z> self() {
      return this;
   }

   public final Map<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }
}
