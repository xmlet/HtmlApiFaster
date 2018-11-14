package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Input<Z extends Element> implements GlobalAttributes<Input<Z>, Z>, TextGroup<Input<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Input(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementInput(this);
   }

   public Input(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementInput(this);
   }

   protected Input(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementInput(this);
      }

   }

   public Z __() {
      this.visitor.visitParentInput(this);
      return this.parent;
   }

   public final Input<Z> dynamic(Consumer<Input<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Input<Z> of(Consumer<Input<Z>> consumer) {
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
      return "input";
   }

   public final Input<Z> self() {
      return this;
   }

   public final Input<Z> attrType(EnumTypeInputType attrType) {
      this.visitor.visitAttributeType(attrType.getValue());
      return this;
   }

   public final Input<Z> attrAccept(String attrAccept) {
      this.visitor.visitAttributeAccept(attrAccept);
      return this;
   }

   public final Input<Z> attrAlt(String attrAlt) {
      this.visitor.visitAttributeAlt(attrAlt);
      return this;
   }

   public final Input<Z> attrAutocomplete(EnumAutocompleteType attrAutocomplete) {
      this.visitor.visitAttributeAutocomplete(attrAutocomplete.getValue());
      return this;
   }

   public final Input<Z> attrChecked(Boolean attrChecked) {
      this.visitor.visitAttributeChecked(attrChecked.toString());
      return this;
   }

   public final Input<Z> attrDirname(String attrDirname) {
      this.visitor.visitAttributeDirname(attrDirname);
      return this;
   }

   public final Input<Z> attrDisabled(Boolean attrDisabled) {
      this.visitor.visitAttributeDisabled(attrDisabled.toString());
      return this;
   }

   public final Input<Z> attrForm(String attrForm) {
      this.visitor.visitAttributeForm(attrForm);
      return this;
   }

   public final Input<Z> attrFormaction(String attrFormaction) {
      this.visitor.visitAttributeFormaction(attrFormaction);
      return this;
   }

   public final Input<Z> attrFormenctype(EnumFormenctypeEnctypeType attrFormenctype) {
      this.visitor.visitAttributeFormenctype(attrFormenctype.getValue());
      return this;
   }

   public final Input<Z> attrFormmethod(EnumFormmethodMethodType attrFormmethod) {
      this.visitor.visitAttributeFormmethod(attrFormmethod.getValue());
      return this;
   }

   public final Input<Z> attrFormnovalidate(Boolean attrFormnovalidate) {
      this.visitor.visitAttributeFormnovalidate(attrFormnovalidate.toString());
      return this;
   }

   public final Input<Z> attrFormtarget(EnumFormtargetBrowsingContext attrFormtarget) {
      this.visitor.visitAttributeFormtarget(attrFormtarget.getValue());
      return this;
   }

   public final Input<Z> attrHeight(Long attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight.toString());
      return this;
   }

   public final Input<Z> attrList(String attrList) {
      this.visitor.visitAttributeList(attrList);
      return this;
   }

   public final Input<Z> attrMax(String attrMax) {
      this.visitor.visitAttributeMax(attrMax);
      return this;
   }

   public final Input<Z> attrMaxlength(Long attrMaxlength) {
      this.visitor.visitAttributeMaxlength(attrMaxlength.toString());
      return this;
   }

   public final Input<Z> attrMin(String attrMin) {
      this.visitor.visitAttributeMin(attrMin);
      return this;
   }

   public final Input<Z> attrMinlength(Long attrMinlength) {
      this.visitor.visitAttributeMinlength(attrMinlength.toString());
      return this;
   }

   public final Input<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Input<Z> attrMultiple(Boolean attrMultiple) {
      this.visitor.visitAttributeMultiple(attrMultiple.toString());
      return this;
   }

   public final Input<Z> attrPattern(String attrPattern) {
      this.visitor.visitAttributePattern(attrPattern);
      return this;
   }

   public final Input<Z> attrPlaceholder(String attrPlaceholder) {
      this.visitor.visitAttributePlaceholder(attrPlaceholder);
      return this;
   }

   public final Input<Z> attrReadonly(Boolean attrReadonly) {
      this.visitor.visitAttributeReadonly(attrReadonly.toString());
      return this;
   }

   public final Input<Z> attrRequired(Boolean attrRequired) {
      this.visitor.visitAttributeRequired(attrRequired.toString());
      return this;
   }

   public final Input<Z> attrSize(Long attrSize) {
      this.visitor.visitAttributeSize(attrSize.toString());
      return this;
   }

   public final Input<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Input<Z> attrStep(String attrStep) {
      this.visitor.visitAttributeStep(attrStep);
      return this;
   }

   public final Input<Z> attrWidth(Long attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth.toString());
      return this;
   }

   public final Input<Z> attrValue(String attrValue) {
      this.visitor.visitAttributeValue(attrValue);
      return this;
   }
}
