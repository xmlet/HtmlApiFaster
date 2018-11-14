package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Option<Z extends Element> implements GlobalAttributes<Option<Z>, Z>, TextGroup<Option<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Option(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOption(this);
   }

   public Option(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOption(this);
   }

   protected Option(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOption(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOption(this);
      return this.parent;
   }

   public final Option<Z> dynamic(Consumer<Option<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Option<Z> of(Consumer<Option<Z>> consumer) {
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
      return "option";
   }

   public final Option<Z> self() {
      return this;
   }

   public final Option<Z> attrDisabled(Boolean attrDisabled) {
      this.visitor.visitAttributeDisabled(attrDisabled.toString());
      return this;
   }

   public final Option<Z> attrSelected(Boolean attrSelected) {
      this.visitor.visitAttributeSelected(attrSelected.toString());
      return this;
   }

   public final Option<Z> attrLabel(String attrLabel) {
      this.visitor.visitAttributeLabel(attrLabel);
      return this;
   }

   public final Option<Z> attrValue(String attrValue) {
      this.visitor.visitAttributeValue(attrValue);
      return this;
   }
}
