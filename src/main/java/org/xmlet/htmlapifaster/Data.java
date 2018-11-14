package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Data<Z extends Element> implements GlobalAttributes<Data<Z>, Z>, PhrasingContentChoice<Data<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Data(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementData(this);
   }

   public Data(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementData(this);
   }

   protected Data(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementData(this);
      }

   }

   public Z __() {
      this.visitor.visitParentData(this);
      return this.parent;
   }

   public final Data<Z> dynamic(Consumer<Data<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Data<Z> of(Consumer<Data<Z>> consumer) {
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
      return "data";
   }

   public final Data<Z> self() {
      return this;
   }

   public final Data<Z> attrValue(String attrValue) {
      this.visitor.visitAttributeValue(attrValue);
      return this;
   }
}
