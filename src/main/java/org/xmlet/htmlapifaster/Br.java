package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Br<Z extends Element> implements GlobalAttributes<Br<Z>, Z>, TextGroup<Br<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Br(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBr(this);
   }

   public Br(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBr(this);
   }

   protected Br(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBr(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBr(this);
      return this.parent;
   }

   public final Br<Z> dynamic(Consumer<Br<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Br<Z> of(Consumer<Br<Z>> consumer) {
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
      return "br";
   }

   public final Br<Z> self() {
      return this;
   }
}
