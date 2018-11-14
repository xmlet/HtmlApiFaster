package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Math<Z extends Element> implements GlobalAttributes<Math<Z>, Z>, TextGroup<Math<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Math(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMath(this);
   }

   public Math(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMath(this);
   }

   protected Math(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMath(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMath(this);
      return this.parent;
   }

   public final Math<Z> dynamic(Consumer<Math<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Math<Z> of(Consumer<Math<Z>> consumer) {
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
      return "math";
   }

   public final Math<Z> self() {
      return this;
   }

   public final Math<Z> attrDisplay(EnumDisplayType attrDisplay) {
      this.visitor.visitAttributeDisplay(attrDisplay.getValue());
      return this;
   }

   public final Math<Z> attrMaxwidth(Long attrMaxwidth) {
      this.visitor.visitAttributeMaxwidth(attrMaxwidth.toString());
      return this;
   }

   public final Math<Z> attrOverflow(EnumOverflowType attrOverflow) {
      this.visitor.visitAttributeOverflow(attrOverflow.getValue());
      return this;
   }

   public final Math<Z> attrAltimg(String attrAltimg) {
      this.visitor.visitAttributeAltimg(attrAltimg);
      return this;
   }

   public final Math<Z> attrAltimgWidth(Long attrAltimgWidth) {
      this.visitor.visitAttributeAltimgWidth(attrAltimgWidth.toString());
      return this;
   }

   public final Math<Z> attrAltimgHeigth(Long attrAltimgHeigth) {
      this.visitor.visitAttributeAltimgHeigth(attrAltimgHeigth.toString());
      return this;
   }

   public final Math<Z> attrAltimgValign(Long attrAltimgValign) {
      this.visitor.visitAttributeAltimgValign(attrAltimgValign.toString());
      return this;
   }

   public final Math<Z> attrAlttext(String attrAlttext) {
      this.visitor.visitAttributeAlttext(attrAlttext);
      return this;
   }

   public final Math<Z> attrCdgroup(String attrCdgroup) {
      this.visitor.visitAttributeCdgroup(attrCdgroup);
      return this;
   }
}
