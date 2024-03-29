package org.xmlet.htmlapifaster;

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
