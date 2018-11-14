package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Dialog<Z extends Element> implements GlobalAttributes<Dialog<Z>, Z>, FlowContentChoice<Dialog<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Dialog(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDialog(this);
   }

   public Dialog(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDialog(this);
   }

   protected Dialog(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDialog(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDialog(this);
      return this.parent;
   }

   public final Dialog<Z> dynamic(Consumer<Dialog<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Dialog<Z> of(Consumer<Dialog<Z>> consumer) {
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
      return "dialog";
   }

   public final Dialog<Z> self() {
      return this;
   }

   public final Dialog<Z> attrOpen(Boolean attrOpen) {
      this.visitor.visitAttributeOpen(attrOpen.toString());
      return this;
   }
}
