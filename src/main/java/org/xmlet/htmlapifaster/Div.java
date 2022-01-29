package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Div<Z extends Element> implements GlobalAttributes<Div<Z>, Z>, DivChoice0<Div<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Div(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDiv(this);
   }

   public Div(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDiv(this);
   }

   protected Div(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDiv(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDiv(this);
      return this.parent;
   }

   public final Div<Z> async(BiConsumer<Runnable, Div<Z>> var1) {
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
      return "div";
   }

   public final Div<Z> self() {
      return this;
   }
}
