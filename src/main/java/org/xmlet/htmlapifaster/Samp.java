package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

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

   public final Samp<Z> dynamic(Consumer<Samp<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Samp<Z> of(Consumer<Samp<Z>> consumer) {
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
      return "samp";
   }

   public final Samp<Z> self() {
      return this;
   }
}
