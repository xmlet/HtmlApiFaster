package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Label<Z extends Element> implements GlobalAttributes<Label<Z>, Z>, PhrasingContentChoice<Label<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Label(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementLabel(this);
   }

   public Label(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementLabel(this);
   }

   protected Label(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementLabel(this);
      }

   }

   public Z __() {
      this.visitor.visitParentLabel(this);
      return this.parent;
   }

   public final Label<Z> dynamic(Consumer<Label<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Label<Z> of(Consumer<Label<Z>> consumer) {
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
      return "label";
   }

   public final Label<Z> self() {
      return this;
   }

   public final Label<Z> attrFor(String attrFor) {
      this.visitor.visitAttributeFor(attrFor);
      return this;
   }
}
