package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Meter<Z extends Element> implements GlobalAttributes<Meter<Z>, Z>, PhrasingContentWithoutMeterChoice<Meter<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Meter(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMeter(this);
   }

   public Meter(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMeter(this);
   }

   protected Meter(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMeter(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMeter(this);
      return this.parent;
   }

   public final Meter<Z> dynamic(Consumer<Meter<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Meter<Z> of(Consumer<Meter<Z>> consumer) {
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
      return "meter";
   }

   public final Meter<Z> self() {
      return this;
   }

   public final Meter<Z> attrValue(Double attrValue) {
      this.visitor.visitAttributeValue(attrValue.toString());
      return this;
   }

   public final Meter<Z> attrMin(Double attrMin) {
      this.visitor.visitAttributeMin(attrMin.toString());
      return this;
   }

   public final Meter<Z> attrMax(Double attrMax) {
      this.visitor.visitAttributeMax(attrMax.toString());
      return this;
   }

   public final Meter<Z> attrLow(Double attrLow) {
      this.visitor.visitAttributeLow(attrLow.toString());
      return this;
   }

   public final Meter<Z> attrHigh(Double attrHigh) {
      this.visitor.visitAttributeHigh(attrHigh.toString());
      return this;
   }

   public final Meter<Z> attrOptimum(Double attrOptimum) {
      this.visitor.visitAttributeOptimum(attrOptimum.toString());
      return this;
   }
}
