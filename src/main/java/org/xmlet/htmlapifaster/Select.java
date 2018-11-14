package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Select<Z extends Element> implements GlobalAttributes<Select<Z>, Z>, SelectAll0<Select<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Select(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSelect(this);
   }

   public Select(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSelect(this);
   }

   protected Select(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSelect(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSelect(this);
      return this.parent;
   }

   public final Select<Z> dynamic(Consumer<Select<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Select<Z> of(Consumer<Select<Z>> consumer) {
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
      return "select";
   }

   public final Select<Z> self() {
      return this;
   }

   public final Select<Z> attrAutoComplete(String attrAutoComplete) {
      this.visitor.visitAttributeAutoComplete(attrAutoComplete);
      return this;
   }

   public final Select<Z> attrAutofocus(Boolean attrAutofocus) {
      this.visitor.visitAttributeAutofocus(attrAutofocus.toString());
      return this;
   }

   public final Select<Z> attrDisabled(Boolean attrDisabled) {
      this.visitor.visitAttributeDisabled(attrDisabled.toString());
      return this;
   }

   public final Select<Z> attrForm(String attrForm) {
      this.visitor.visitAttributeForm(attrForm);
      return this;
   }

   public final Select<Z> attrMultiple(Boolean attrMultiple) {
      this.visitor.visitAttributeMultiple(attrMultiple.toString());
      return this;
   }

   public final Select<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Select<Z> attrSize(Long attrSize) {
      this.visitor.visitAttributeSize(attrSize.toString());
      return this;
   }
}
