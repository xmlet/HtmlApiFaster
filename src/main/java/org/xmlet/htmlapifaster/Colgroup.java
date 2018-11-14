package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Colgroup<Z extends Element> implements GlobalAttributes<Colgroup<Z>, Z>, ColgroupAll0<Colgroup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Colgroup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementColgroup(this);
   }

   public Colgroup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementColgroup(this);
   }

   protected Colgroup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementColgroup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentColgroup(this);
      return this.parent;
   }

   public final Colgroup<Z> dynamic(Consumer<Colgroup<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Colgroup<Z> of(Consumer<Colgroup<Z>> consumer) {
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
      return "colgroup";
   }

   public final Colgroup<Z> self() {
      return this;
   }

   public final Colgroup<Z> attrSpan(Long attrSpan) {
      this.visitor.visitAttributeSpan(attrSpan.toString());
      return this;
   }
}
