package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Canvas<Z extends Element> implements GlobalAttributes<Canvas<Z>, Z>, TransparentContentChoice<Canvas<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Canvas(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCanvas(this);
   }

   public Canvas(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCanvas(this);
   }

   protected Canvas(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCanvas(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCanvas(this);
      return this.parent;
   }

   public final Canvas<Z> async(BiConsumer<Runnable, Canvas<Z>> var1) {
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
      return "canvas";
   }

   public final Canvas<Z> self() {
      return this;
   }

   public final Canvas<Z> attrWidth(Long attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth.toString());
      return this;
   }

   public final Canvas<Z> attrHeight(Long attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight.toString());
      return this;
   }
}
