package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Aside<Z extends Element> implements GlobalAttributes<Aside<Z>, Z>, MainLessFlowContentChoice<Aside<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Aside(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAside(this);
   }

   public Aside(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAside(this);
   }

   protected Aside(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAside(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAside(this);
      return this.parent;
   }

   public final Aside<Z> dynamic(Consumer<Aside<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Aside<Z> of(Consumer<Aside<Z>> consumer) {
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
      return "aside";
   }

   public final Aside<Z> self() {
      return this;
   }
}
