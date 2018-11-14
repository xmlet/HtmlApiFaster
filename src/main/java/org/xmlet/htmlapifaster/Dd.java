package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Dd<Z extends Element> implements GlobalAttributes<Dd<Z>, Z>, FlowContentChoice<Dd<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Dd(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDd(this);
   }

   public Dd(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDd(this);
   }

   protected Dd(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDd(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDd(this);
      return this.parent;
   }

   public final Dd<Z> dynamic(Consumer<Dd<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Dd<Z> of(Consumer<Dd<Z>> consumer) {
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
      return "dd";
   }

   public final Dd<Z> self() {
      return this;
   }
}
