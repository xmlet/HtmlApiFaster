package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Link<Z extends Element> implements GlobalAttributes<Link<Z>, Z>, TextGroup<Link<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Link(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementLink(this);
   }

   public Link(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementLink(this);
   }

   protected Link(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementLink(this);
      }

   }

   public Z __() {
      this.visitor.visitParentLink(this);
      return this.parent;
   }

   public final Link<Z> dynamic(Consumer<Link<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Link<Z> of(Consumer<Link<Z>> consumer) {
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
      return "link";
   }

   public final Link<Z> self() {
      return this;
   }

   public final Link<Z> attrHref(String attrHref) {
      this.visitor.visitAttributeHref(attrHref);
      return this;
   }

   public final Link<Z> attrCrossorigin(EnumCrossoriginCrossOriginType attrCrossorigin) {
      this.visitor.visitAttributeCrossorigin(attrCrossorigin.getValue());
      return this;
   }

   public final Link<Z> attrRel(EnumRelType attrRel) {
      this.visitor.visitAttributeRel(attrRel.getValue());
      return this;
   }

   public final Link<Z> attrRev(EnumRevType attrRev) {
      this.visitor.visitAttributeRev(attrRev.getValue());
      return this;
   }

   public final Link<Z> attrMedia(EnumMediaType attrMedia) {
      this.visitor.visitAttributeMedia(attrMedia.getValue());
      return this;
   }

   public final Link<Z> attrNonce(String attrNonce) {
      this.visitor.visitAttributeNonce(attrNonce);
      return this;
   }

   public final Link<Z> attrHreflang(String attrHreflang) {
      this.visitor.visitAttributeHreflang(attrHreflang);
      return this;
   }

   public final Link<Z> attrType(EnumTypeContentType attrType) {
      this.visitor.visitAttributeType(attrType.getValue());
      return this;
   }

   public final Link<Z> attrReferrerpolicy(String attrReferrerpolicy) {
      this.visitor.visitAttributeReferrerpolicy(attrReferrerpolicy);
      return this;
   }

   public final Link<Z> attrSizes(String attrSizes) {
      AttrSizesString.validateRestrictions(attrSizes);
      this.visitor.visitAttributeSizes(attrSizes);
      return this;
   }
}
