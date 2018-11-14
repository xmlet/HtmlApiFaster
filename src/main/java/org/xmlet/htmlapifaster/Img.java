package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Img<Z extends Element> implements GlobalAttributes<Img<Z>, Z>, TextGroup<Img<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Img(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementImg(this);
   }

   public Img(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementImg(this);
   }

   protected Img(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementImg(this);
      }

   }

   public Z __() {
      this.visitor.visitParentImg(this);
      return this.parent;
   }

   public final Img<Z> dynamic(Consumer<Img<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Img<Z> of(Consumer<Img<Z>> consumer) {
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
      return "img";
   }

   public final Img<Z> self() {
      return this;
   }

   public final Img<Z> attrAlt(String attrAlt) {
      this.visitor.visitAttributeAlt(attrAlt);
      return this;
   }

   public final Img<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Img<Z> attrSrcset(String attrSrcset) {
      this.visitor.visitAttributeSrcset(attrSrcset);
      return this;
   }

   public final Img<Z> attrSizes(String attrSizes) {
      AttrSizesString.validateRestrictions(attrSizes);
      this.visitor.visitAttributeSizes(attrSizes);
      return this;
   }

   public final Img<Z> attrCrossorigin(EnumCrossoriginCrossOriginType attrCrossorigin) {
      this.visitor.visitAttributeCrossorigin(attrCrossorigin.getValue());
      return this;
   }

   public final Img<Z> attrUsemap(String attrUsemap) {
      this.visitor.visitAttributeUsemap(attrUsemap);
      return this;
   }

   public final Img<Z> attrIsmap(Boolean attrIsmap) {
      this.visitor.visitAttributeIsmap(attrIsmap.toString());
      return this;
   }

   public final Img<Z> attrWidth(Long attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth.toString());
      return this;
   }

   public final Img<Z> attrHeight(Long attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight.toString());
      return this;
   }

   public final Img<Z> attrReferrerpolicy(String attrReferrerpolicy) {
      this.visitor.visitAttributeReferrerpolicy(attrReferrerpolicy);
      return this;
   }

   public final Img<Z> attrLongdesc(String attrLongdesc) {
      this.visitor.visitAttributeLongdesc(attrLongdesc);
      return this;
   }
}
