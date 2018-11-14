package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class A<Z extends Element> implements GlobalAttributes<A<Z>, Z>, TransparentContentWithoutAAll1<A<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public A(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementA(this);
   }

   public A(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementA(this);
   }

   protected A(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementA(this);
      }

   }

   public Z __() {
      this.visitor.visitParentA(this);
      return this.parent;
   }

   public final A<Z> dynamic(Consumer<A<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final A<Z> of(Consumer<A<Z>> consumer) {
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
      return "a";
   }

   public final A<Z> self() {
      return this;
   }

   public final A<Z> attrHref(String attrHref) {
      this.visitor.visitAttributeHref(attrHref);
      return this;
   }

   public final A<Z> attrTarget(String attrTarget) {
      this.visitor.visitAttributeTarget(attrTarget);
      return this;
   }

   public final A<Z> attrDownload(String attrDownload) {
      this.visitor.visitAttributeDownload(attrDownload);
      return this;
   }

   public final A<Z> attrRel(EnumRelType attrRel) {
      this.visitor.visitAttributeRel(attrRel.getValue());
      return this;
   }

   public final A<Z> attrRev(EnumRevType attrRev) {
      this.visitor.visitAttributeRev(attrRev.getValue());
      return this;
   }

   public final A<Z> attrHreflang(String attrHreflang) {
      this.visitor.visitAttributeHreflang(attrHreflang);
      return this;
   }

   public final A<Z> attrType(EnumTypeSimpleContentType attrType) {
      this.visitor.visitAttributeType(attrType.getValue());
      return this;
   }

   public final A<Z> attrReferrerpolicy(String attrReferrerpolicy) {
      this.visitor.visitAttributeReferrerpolicy(attrReferrerpolicy);
      return this;
   }
}
