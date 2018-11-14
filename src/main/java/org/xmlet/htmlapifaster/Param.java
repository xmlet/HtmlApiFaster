package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Param<Z extends Element> implements GlobalAttributes<Param<Z>, Z>, TextGroup<Param<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Param(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementParam(this);
   }

   public Param(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementParam(this);
   }

   protected Param(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementParam(this);
      }

   }

   public Z __() {
      this.visitor.visitParentParam(this);
      return this.parent;
   }

   public final Param<Z> dynamic(Consumer<Param<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Param<Z> of(Consumer<Param<Z>> consumer) {
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
      return "param";
   }

   public final Param<Z> self() {
      return this;
   }

   public final Param<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }

   public final Param<Z> attrValue(String attrValue) {
      this.visitor.visitAttributeValue(attrValue);
      return this;
   }
}
