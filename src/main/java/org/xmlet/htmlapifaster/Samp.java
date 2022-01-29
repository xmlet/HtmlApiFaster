package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Samp<Z extends Element> implements GlobalAttributes<Samp<Z>, Z>, PhrasingContentChoice<Samp<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Samp(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSamp(this);
   }

   public Samp(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSamp(this);
   }

   protected Samp(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSamp(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSamp(this);
      return this.parent;
   }

   public final Samp<Z> async(BiConsumer<Runnable, Samp<Z>> var1) {
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
      return "samp";
   }

   public final Samp<Z> self() {
      return this;
   }
}
