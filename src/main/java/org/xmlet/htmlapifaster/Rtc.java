package org.xmlet.htmlapifaster;

public final class Rtc<Z extends Element> implements GlobalAttributes<Rtc<Z>, Z>, RtcChoice0<Rtc<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Rtc(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRtc(this);
   }

   public Rtc(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRtc(this);
   }

   protected Rtc(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRtc(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRtc(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "rtc";
   }

   public final Rtc<Z> self() {
      return this;
   }
}
