package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Textarea<Z extends Element> implements GlobalAttributes<Textarea<Z>, Z>, TextGroup<Textarea<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Textarea(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTextarea(this);
   }

   public Textarea(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTextarea(this);
   }

   protected Textarea(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTextarea(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTextarea(this);
      return this.parent;
   }

   public final Textarea<Z> dynamic(Consumer<Textarea<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Textarea<Z> of(Consumer<Textarea<Z>> consumer) {
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
      return "textarea";
   }

   public final Textarea<Z> self() {
      return this;
   }

   public final Textarea<Z> attrAutoComplete(String attrAutoComplete) {
      this.visitor.visitAttributeAutoComplete(attrAutoComplete);
      return this;
   }

   public final Textarea<Z> attrAutofocus(Boolean attrAutofocus) {
      this.visitor.visitAttributeAutofocus(attrAutofocus.toString());
      return this;
   }

   public final Textarea<Z> attrCols(Long attrCols) {
      this.visitor.visitAttributeCols(attrCols.toString());
      return this;
   }

   public final Textarea<Z> attrDirName(String attrDirName) {
      this.visitor.visitAttributeDirName(attrDirName);
      return this;
   }

   public final Textarea<Z> attrDisabled(Boolean attrDisabled) {
      this.visitor.visitAttributeDisabled(attrDisabled.toString());
      return this;
   }

   public final Textarea<Z> attrForm(String attrForm) {
      this.visitor.visitAttributeForm(attrForm);
      return this;
   }

   public final Textarea<Z> attrMaxlength(Long attrMaxlength) {
      this.visitor.visitAttributeMaxlength(attrMaxlength.toString());
      return this;
   }

   public final Textarea<Z> attrMinlength(Long attrMinlength) {
      this.visitor.visitAttributeMinlength(attrMinlength.toString());
      return this;
   }

   public final Textarea<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Textarea<Z> attrPlaceholder(String attrPlaceholder) {
      this.visitor.visitAttributePlaceholder(attrPlaceholder);
      return this;
   }

   public final Textarea<Z> attrReadonly(Boolean attrReadonly) {
      this.visitor.visitAttributeReadonly(attrReadonly.toString());
      return this;
   }

   public final Textarea<Z> attrRequired(Boolean attrRequired) {
      this.visitor.visitAttributeRequired(attrRequired.toString());
      return this;
   }

   public final Textarea<Z> attrRows(Long attrRows) {
      this.visitor.visitAttributeRows(attrRows.toString());
      return this;
   }

   public final Textarea<Z> attrWrap(EnumWrapType attrWrap) {
      this.visitor.visitAttributeWrap(attrWrap.getValue());
      return this;
   }
}
