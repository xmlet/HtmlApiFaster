package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Object<Z extends Element> implements GlobalAttributes<Object<Z>, Z>, ObjectChoice0<Object<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Object(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementObject(this);
   }

   public Object(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementObject(this);
   }

   protected Object(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementObject(this);
      }

   }

   public Z __() {
      this.visitor.visitParentObject(this);
      return this.parent;
   }

   public final Object<Z> dynamic(Consumer<Object<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Object<Z> of(Consumer<Object<Z>> consumer) {
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
      return "object";
   }

   public final Object<Z> self() {
      return this;
   }

   public final Object<Z> attrData(String attrData) {
      this.visitor.visitAttributeData(attrData);
      return this;
   }

   public final Object<Z> attrType(String attrType) {
      this.visitor.visitAttributeType(attrType);
      return this;
   }

   public final Object<Z> attrTypemustmatch(Boolean attrTypemustmatch) {
      this.visitor.visitAttributeTypemustmatch(attrTypemustmatch.toString());
      return this;
   }

   public final Object<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Object<Z> attrForm(String attrForm) {
      this.visitor.visitAttributeForm(attrForm);
      return this;
   }

   public final Object<Z> attrWidth(String attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth);
      return this;
   }

   public final Object<Z> attrHeight(String attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight);
      return this;
   }
}
