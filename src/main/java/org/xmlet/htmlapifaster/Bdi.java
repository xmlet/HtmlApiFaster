package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Bdi<Z extends Element> implements GlobalAttributes<Bdi<Z>, Z>, PhrasingContentChoice<Bdi<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Bdi(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBdi(this);
   }

   public Bdi(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBdi(this);
   }

   protected Bdi(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBdi(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBdi(this);
      return this.parent;
   }

   public final Bdi<Z> async(BiConsumer<Runnable, Bdi<Z>> var1) {
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
      return "bdi";
   }

   public final Bdi<Z> self() {
      return this;
   }
}
