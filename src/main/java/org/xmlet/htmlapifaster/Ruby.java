package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Ruby<Z extends Element> implements GlobalAttributes<Ruby<Z>, Z>, RubyChoice0<Ruby<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Ruby(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRuby(this);
   }

   public Ruby(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRuby(this);
   }

   protected Ruby(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRuby(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRuby(this);
      return this.parent;
   }

   public final Ruby<Z> dynamic(Consumer<Ruby<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Ruby<Z> of(Consumer<Ruby<Z>> consumer) {
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
      return "ruby";
   }

   public final Ruby<Z> self() {
      return this;
   }
}
