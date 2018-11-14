package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class S<Z extends Element> implements GlobalAttributes<S<Z>, Z>, PhrasingContentChoice<S<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public S(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementS(this);
   }

   public S(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementS(this);
   }

   protected S(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementS(this);
      }

   }

   public Z __() {
      this.visitor.visitParentS(this);
      return this.parent;
   }

   public final S<Z> dynamic(Consumer<S<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final S<Z> of(Consumer<S<Z>> consumer) {
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
      return "s";
   }

   public final S<Z> self() {
      return this;
   }
}
