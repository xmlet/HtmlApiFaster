package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Button<Z extends Element> implements GlobalAttributes<Button<Z>, Z>, PhrasingContentChoice<Button<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Button(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementButton(this);
   }

   public Button(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementButton(this);
   }

   protected Button(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementButton(this);
      }

   }

   public Z __() {
      this.visitor.visitParentButton(this);
      return this.parent;
   }

   public final Button<Z> dynamic(Consumer<Button<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Button<Z> of(Consumer<Button<Z>> consumer) {
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
      return "button";
   }

   public final Button<Z> self() {
      return this;
   }

   public final Button<Z> attrAutofocus(Boolean attrAutofocus) {
      this.visitor.visitAttributeAutofocus(attrAutofocus.toString());
      return this;
   }

   public final Button<Z> attrDisabled(Boolean attrDisabled) {
      this.visitor.visitAttributeDisabled(attrDisabled.toString());
      return this;
   }

   public final Button<Z> attrForm(String attrForm) {
      this.visitor.visitAttributeForm(attrForm);
      return this;
   }

   public final Button<Z> attrFormaction(String attrFormaction) {
      this.visitor.visitAttributeFormaction(attrFormaction);
      return this;
   }

   public final Button<Z> attrFormenctype(EnumFormenctypeEnctypeType attrFormenctype) {
      this.visitor.visitAttributeFormenctype(attrFormenctype.getValue());
      return this;
   }

   public final Button<Z> attrFormmethod(EnumFormmethodMethodType attrFormmethod) {
      this.visitor.visitAttributeFormmethod(attrFormmethod.getValue());
      return this;
   }

   public final Button<Z> attrFormnovalidate(Boolean attrFormnovalidate) {
      this.visitor.visitAttributeFormnovalidate(attrFormnovalidate.toString());
      return this;
   }

   public final Button<Z> attrFormtarget(String attrFormtarget) {
      this.visitor.visitAttributeFormtarget(attrFormtarget);
      return this;
   }

   public final Button<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Button<Z> attrValue(String attrValue) {
      this.visitor.visitAttributeValue(attrValue);
      return this;
   }

   public final Button<Z> attrType(EnumTypeButtonType attrType) {
      this.visitor.visitAttributeType(attrType.getValue());
      return this;
   }
}
