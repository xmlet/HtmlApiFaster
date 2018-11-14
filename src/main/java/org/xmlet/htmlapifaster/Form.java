package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Form<Z extends Element> implements GlobalAttributes<Form<Z>, Z>, FlowContentChoice<Form<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Form(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementForm(this);
   }

   public Form(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementForm(this);
   }

   protected Form(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementForm(this);
      }

   }

   public Z __() {
      this.visitor.visitParentForm(this);
      return this.parent;
   }

   public final Form<Z> dynamic(Consumer<Form<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Form<Z> of(Consumer<Form<Z>> consumer) {
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
      return "form";
   }

   public final Form<Z> self() {
      return this;
   }

   public final Form<Z> attrAcceptCharset(String attrAcceptCharset) {
      this.visitor.visitAttributeAcceptCharset(attrAcceptCharset);
      return this;
   }

   public final Form<Z> attrAction(String attrAction) {
      this.visitor.visitAttributeAction(attrAction);
      return this;
   }

   public final Form<Z> attrAutocomplete(EnumAutocompleteType attrAutocomplete) {
      this.visitor.visitAttributeAutocomplete(attrAutocomplete.getValue());
      return this;
   }

   public final Form<Z> attrEnctype(EnumEnctypeType attrEnctype) {
      this.visitor.visitAttributeEnctype(attrEnctype.getValue());
      return this;
   }

   public final Form<Z> attrMethod(EnumMethodType attrMethod) {
      this.visitor.visitAttributeMethod(attrMethod.getValue());
      return this;
   }

   public final Form<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Form<Z> attrNovalidate(Boolean attrNovalidate) {
      this.visitor.visitAttributeNovalidate(attrNovalidate.toString());
      return this;
   }

   public final Form<Z> attrTarget(String attrTarget) {
      this.visitor.visitAttributeTarget(attrTarget);
      return this;
   }
}
