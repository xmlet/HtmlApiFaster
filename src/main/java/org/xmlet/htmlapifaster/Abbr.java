package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Abbr<Z extends Element> implements GlobalAttributes<Abbr<Z>, Z>, PhrasingContentChoice<Abbr<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Abbr(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAbbr(this);
   }

   public Abbr(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAbbr(this);
   }

   protected Abbr(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAbbr(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAbbr(this);
      return this.parent;
   }

   public final Abbr<Z> dynamic(Consumer<Abbr<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Abbr<Z> of(Consumer<Abbr<Z>> consumer) {
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
      return "abbr";
   }

   public final Abbr<Z> self() {
      return this;
   }
}
