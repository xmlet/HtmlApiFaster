package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

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

   public final Audio<Z> async(BiConsumer<Runnable, Audio<Z>> var1) {
      this.visitor.visitOpenAsync();
      ElementVisitor var10001 = this.visitor;
      this.visitor.getClass();
      var1.accept(var10001::visitCloseAsync, this);
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
