package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class H3<Z extends Element> implements GlobalAttributes<H3<Z>, Z>, PhrasingContentChoice<H3<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public H3(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementH3(this);
   }

   public H3(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementH3(this);
   }

   protected H3(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementH3(this);
      }

   }

   public Z __() {
      this.visitor.visitParentH3(this);
      return this.parent;
   }

   public final H3<Z> dynamic(Consumer<H3<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final H3<Z> of(Consumer<H3<Z>> consumer) {
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
      return "h3";
   }

   public final H3<Z> self() {
      return this;
   }
}
