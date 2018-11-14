package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Main<Z extends Element> implements GlobalAttributes<Main<Z>, Z>, FlowContentChoice<Main<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Main(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMain(this);
   }

   public Main(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMain(this);
   }

   protected Main(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMain(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMain(this);
      return this.parent;
   }

   public final Main<Z> dynamic(Consumer<Main<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Main<Z> of(Consumer<Main<Z>> consumer) {
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
      return "main";
   }

   public final Main<Z> self() {
      return this;
   }
}
