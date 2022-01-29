package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Nav<Z extends Element> implements GlobalAttributes<Nav<Z>, Z>, MainLessFlowContentChoice<Nav<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Nav(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNav(this);
   }

   public Nav(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNav(this);
   }

   protected Nav(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNav(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNav(this);
      return this.parent;
   }

   public final Nav<Z> async(BiConsumer<Runnable, Nav<Z>> var1) {
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
      return "nav";
   }

   public final Nav<Z> self() {
      return this;
   }
}
