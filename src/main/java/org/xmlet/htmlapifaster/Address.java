package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Address<Z extends Element> implements GlobalAttributes<Address<Z>, Z>, FlowContentChoice<Address<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Address(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAddress(this);
   }

   public Address(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAddress(this);
   }

   protected Address(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAddress(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAddress(this);
      return this.parent;
   }

   public final Address<Z> dynamic(Consumer<Address<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Address<Z> of(Consumer<Address<Z>> consumer) {
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
      return "address";
   }

   public final Address<Z> self() {
      return this;
   }
}
