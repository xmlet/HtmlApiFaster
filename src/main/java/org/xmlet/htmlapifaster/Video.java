package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Video<Z extends Element> implements GlobalAttributes<Video<Z>, Z>, VideoChoice0<Video<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Video(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementVideo(this);
   }

   public Video(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementVideo(this);
   }

   protected Video(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementVideo(this);
      }

   }

   public Z __() {
      this.visitor.visitParentVideo(this);
      return this.parent;
   }

   public final Video<Z> dynamic(Consumer<Video<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Video<Z> of(Consumer<Video<Z>> consumer) {
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
      return "video";
   }

   public final Video<Z> self() {
      return this;
   }

   public final Video<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Video<Z> attrCrossorigin(EnumCrossoriginCrossOriginType attrCrossorigin) {
      this.visitor.visitAttributeCrossorigin(attrCrossorigin.getValue());
      return this;
   }

   public final Video<Z> attrPoster(String attrPoster) {
      this.visitor.visitAttributePoster(attrPoster);
      return this;
   }

   public final Video<Z> attrPreload(String attrPreload) {
      this.visitor.visitAttributePreload(attrPreload);
      return this;
   }

   public final Video<Z> attrAutoplay(String attrAutoplay) {
      this.visitor.visitAttributeAutoplay(attrAutoplay);
      return this;
   }

   public final Video<Z> attrLoop(Boolean attrLoop) {
      this.visitor.visitAttributeLoop(attrLoop.toString());
      return this;
   }

   public final Video<Z> attrMuted(Boolean attrMuted) {
      this.visitor.visitAttributeMuted(attrMuted.toString());
      return this;
   }

   public final Video<Z> attrControls(String attrControls) {
      this.visitor.visitAttributeControls(attrControls);
      return this;
   }

   public final Video<Z> attrWidth(Long attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth.toString());
      return this;
   }

   public final Video<Z> attrHeight(Long attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight.toString());
      return this;
   }
}
