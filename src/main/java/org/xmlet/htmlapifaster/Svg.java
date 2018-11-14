package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Svg<Z extends Element> implements GlobalAttributes<Svg<Z>, Z>, TextGroup<Svg<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Svg(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSvg(this);
   }

   public Svg(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSvg(this);
   }

   protected Svg(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSvg(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSvg(this);
      return this.parent;
   }

   public final Svg<Z> dynamic(Consumer<Svg<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Svg<Z> of(Consumer<Svg<Z>> consumer) {
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
      return "svg";
   }

   public final Svg<Z> self() {
      return this;
   }

   public final Svg<Z> attrX(Long attrX) {
      this.visitor.visitAttributeX(attrX.toString());
      return this;
   }

   public final Svg<Z> attrY(Long attrY) {
      this.visitor.visitAttributeY(attrY.toString());
      return this;
   }

   public final Svg<Z> attrWidth(Long attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth.toString());
      return this;
   }

   public final Svg<Z> attrHeight(Long attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight.toString());
      return this;
   }
}
