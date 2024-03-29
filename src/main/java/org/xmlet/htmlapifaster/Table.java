package org.xmlet.htmlapifaster;

public final class Table<Z extends Element> implements GlobalAttributes<Table<Z>, Z>, TableChoice0<Table<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Table(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTable(this);
   }

   public Table(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTable(this);
   }

   protected Table(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTable(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTable(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "table";
   }

   public final Table<Z> self() {
      return this;
   }

   public final Table<Z> attrBorder(EnumBorderType attrBorder) {
      this.visitor.visitAttributeBorder(attrBorder.getValue());
      return this;
   }
}
