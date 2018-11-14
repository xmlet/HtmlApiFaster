package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Div<Z extends Element> implements GlobalAttributes<Div<Z>, Z>, DivChoice0<Div<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Div(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDiv(this);
   }

   public Div(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDiv(this);
   }

   protected Div(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDiv(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDiv(this);
      return this.parent;
   }

   public final Div<Z> dynamic(Consumer<Div<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Div<Z> of(Consumer<Div<Z>> consumer) {
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
      return "div";
   }

   public final Div<Z> self() {
      return this;
   }
}
