package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Legend<Z extends Element> implements GlobalAttributes<Legend<Z>, Z>, HeadingContentAll2<Legend<Z>, Z>, PhrasingContentChoice<Legend<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Legend(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementLegend(this);
   }

   public Legend(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementLegend(this);
   }

   protected Legend(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementLegend(this);
      }

   }

   public Z __() {
      this.visitor.visitParentLegend(this);
      return this.parent;
   }

   public final Legend<Z> dynamic(Consumer<Legend<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Legend<Z> of(Consumer<Legend<Z>> consumer) {
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
      return "legend";
   }

   public final Legend<Z> self() {
      return this;
   }
}
