package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class H1<Z extends Element> implements GlobalAttributes<H1<Z>, Z>, PhrasingContentChoice<H1<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public H1(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementH1(this);
   }

   public H1(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementH1(this);
   }

   protected H1(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementH1(this);
      }

   }

   public Z __() {
      this.visitor.visitParentH1(this);
      return this.parent;
   }

   public final H1<Z> async(BiConsumer<Runnable, H1<Z>> var1) {
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
      return "h1";
   }

   public final H1<Z> self() {
      return this;
   }
}
