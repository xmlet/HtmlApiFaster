package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Wbr<Z extends Element> implements GlobalAttributes<Wbr<Z>, Z>, TextGroup<Wbr<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Wbr(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementWbr(this);
   }

   public Wbr(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementWbr(this);
   }

   protected Wbr(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementWbr(this);
      }

   }

   public Z __() {
      this.visitor.visitParentWbr(this);
      return this.parent;
   }

   public final Wbr<Z> dynamic(Consumer<Wbr<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Wbr<Z> of(Consumer<Wbr<Z>> consumer) {
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
      return "wbr";
   }

   public final Wbr<Z> self() {
      return this;
   }
}
