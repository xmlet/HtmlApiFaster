package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class H5<Z extends Element> implements GlobalAttributes<H5<Z>, Z>, PhrasingContentChoice<H5<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public H5(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementH5(this);
   }

   public H5(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementH5(this);
   }

   protected H5(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementH5(this);
      }

   }

   public Z __() {
      this.visitor.visitParentH5(this);
      return this.parent;
   }

   public final H5<Z> dynamic(Consumer<H5<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final H5<Z> of(Consumer<H5<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "h5";
   }

   public final H5<Z> self() {
      return this;
   }
}
