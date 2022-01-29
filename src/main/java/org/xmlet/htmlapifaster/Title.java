package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Title<Z extends Element> implements GlobalAttributes<Title<Z>, Z>, TextGroup<Title<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Title(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTitle(this);
   }

   public Title(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTitle(this);
   }

   protected Title(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTitle(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTitle(this);
      return this.parent;
   }

   public final Title<Z> async(BiConsumer<Runnable, Title<Z>> var1) {
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
      return "title";
   }

   public final Title<Z> self() {
      return this;
   }
}
