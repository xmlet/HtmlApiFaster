package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Caption<Z extends Element> implements GlobalAttributes<Caption<Z>, Z>, FlowContentChoice<Caption<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Caption(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCaption(this);
   }

   public Caption(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCaption(this);
   }

   protected Caption(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCaption(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCaption(this);
      return this.parent;
   }

   public final Caption<Z> async(BiConsumer<Runnable, Caption<Z>> var1) {
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
      return "caption";
   }

   public final Caption<Z> self() {
      return this;
   }
}
