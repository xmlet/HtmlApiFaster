package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Source<Z extends Element> implements GlobalAttributes<Source<Z>, Z>, TextGroup<Source<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Source(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSource(this);
   }

   public Source(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSource(this);
   }

   protected Source(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSource(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSource(this);
      return this.parent;
   }

   public final Source<Z> dynamic(Consumer<Source<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Source<Z> of(Consumer<Source<Z>> consumer) {
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
      return "source";
   }

   public final Source<Z> self() {
      return this;
   }

   public final Source<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Source<Z> attrSrcSet(String attrSrcSet) {
      this.visitor.visitAttributeSrcSet(attrSrcSet);
      return this;
   }

   public final Source<Z> attrSizes(String attrSizes) {
      AttrSizesString.validateRestrictions(attrSizes);
      this.visitor.visitAttributeSizes(attrSizes);
      return this;
   }

   public final Source<Z> attrType(String attrType) {
      this.visitor.visitAttributeType(attrType);
      return this;
   }

   public final Source<Z> attrMedia(String attrMedia) {
      this.visitor.visitAttributeMedia(attrMedia);
      return this;
   }
}
