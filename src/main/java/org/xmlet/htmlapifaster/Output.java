package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Output<Z extends Element> implements GlobalAttributes<Output<Z>, Z>, PhrasingContentChoice<Output<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Output(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOutput(this);
   }

   public Output(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOutput(this);
   }

   protected Output(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOutput(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOutput(this);
      return this.parent;
   }

   public final Output<Z> dynamic(Consumer<Output<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Output<Z> of(Consumer<Output<Z>> consumer) {
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
      return "output";
   }

   public final Output<Z> self() {
      return this;
   }

   public final Output<Z> attrFor(String attrFor) {
      this.visitor.visitAttributeFor(attrFor);
      return this;
   }

   public final Output<Z> attrForm(String attrForm) {
      this.visitor.visitAttributeForm(attrForm);
      return this;
   }

   public final Output<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }
}
