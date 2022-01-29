package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Td<Z extends Element> implements GlobalAttributes<Td<Z>, Z>, FlowContentChoice<Td<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Td(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTd(this);
   }

   public Td(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTd(this);
   }

   protected Td(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTd(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTd(this);
      return this.parent;
   }

   public final Td<Z> async(BiConsumer<Runnable, Td<Z>> var1) {
      this.visitor.visitOpenAsync();
      ElementVisitor var10001 = this.visitor;
      this.visitor.getClass();
      var1.accept(var10001::visitCloseAsync, this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "td";
   }

   public final Td<Z> self() {
      return this;
   }

   public final Td<Z> attrHeaders(String attrHeaders) {
      this.visitor.visitAttributeHeaders(attrHeaders);
      return this;
   }

   public final Td<Z> attrRowspan(Integer attrRowspan) {
      this.visitor.visitAttributeRowspan(attrRowspan.toString());
      return this;
   }

   public final Td<Z> attrColspan(Integer attrColspan) {
      this.visitor.visitAttributeColspan(attrColspan.toString());
      return this;
   }

   public final Td<Z> attrCell(String attrCell) {
      this.visitor.visitAttributeCell(attrCell);
      return this;
   }
}
