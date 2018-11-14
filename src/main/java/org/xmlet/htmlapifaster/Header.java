package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Header<Z extends Element> implements GlobalAttributes<Header<Z>, Z>, FlowContentChoice<Header<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Header(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementHeader(this);
   }

   public Header(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementHeader(this);
   }

   protected Header(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementHeader(this);
      }

   }

   public Z __() {
      this.visitor.visitParentHeader(this);
      return this.parent;
   }

   public final Header<Z> dynamic(Consumer<Header<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Header<Z> of(Consumer<Header<Z>> consumer) {
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
      return "header";
   }

   public final Header<Z> self() {
      return this;
   }
}
