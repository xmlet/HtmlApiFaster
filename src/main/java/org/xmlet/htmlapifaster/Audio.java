package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Audio<Z extends Element> implements GlobalAttributes<Audio<Z>, Z>, AudioChoice0<Audio<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Audio(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAudio(this);
   }

   public Audio(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAudio(this);
   }

   protected Audio(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAudio(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAudio(this);
      return this.parent;
   }

   public final Audio<Z> dynamic(Consumer<Audio<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Audio<Z> of(Consumer<Audio<Z>> consumer) {
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
      return "audio";
   }

   public final Audio<Z> self() {
      return this;
   }

   public final Audio<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Audio<Z> attrCrossorigin(EnumCrossoriginCrossOriginType attrCrossorigin) {
      this.visitor.visitAttributeCrossorigin(attrCrossorigin.getValue());
      return this;
   }

   public final Audio<Z> attrPreload(String attrPreload) {
      this.visitor.visitAttributePreload(attrPreload);
      return this;
   }

   public final Audio<Z> attrAutoplay(String attrAutoplay) {
      this.visitor.visitAttributeAutoplay(attrAutoplay);
      return this;
   }

   public final Audio<Z> attrLoop(Boolean attrLoop) {
      this.visitor.visitAttributeLoop(attrLoop.toString());
      return this;
   }

   public final Audio<Z> attrMuted(Boolean attrMuted) {
      this.visitor.visitAttributeMuted(attrMuted.toString());
      return this;
   }

   public final Audio<Z> attrControls(String attrControls) {
      this.visitor.visitAttributeControls(attrControls);
      return this;
   }
}
