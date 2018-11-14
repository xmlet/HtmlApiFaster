package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class I<Z extends Element> implements GlobalAttributes<I<Z>, Z>, PhrasingContentChoice<I<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public I(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementI(this);
   }

   public I(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementI(this);
   }

   protected I(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementI(this);
      }

   }

   public Z __() {
      this.visitor.visitParentI(this);
      return this.parent;
   }

   public final I<Z> dynamic(Consumer<I<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final I<Z> of(Consumer<I<Z>> consumer) {
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
      return "i";
   }

   public final I<Z> self() {
      return this;
   }
}
