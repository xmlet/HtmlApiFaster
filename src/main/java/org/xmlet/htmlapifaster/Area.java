package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Area<Z extends Element> implements GlobalAttributes<Area<Z>, Z>, TextGroup<Area<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Area(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementArea(this);
   }

   public Area(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementArea(this);
   }

   protected Area(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementArea(this);
      }

   }

   public Z __() {
      this.visitor.visitParentArea(this);
      return this.parent;
   }

   public final Area<Z> dynamic(Consumer<Area<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Area<Z> of(Consumer<Area<Z>> consumer) {
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
      return "area";
   }

   public final Area<Z> self() {
      return this;
   }

   public final Area<Z> attrAlt(String attrAlt) {
      this.visitor.visitAttributeAlt(attrAlt);
      return this;
   }

   public final Area<Z> attrCoords(String attrCoords) {
      this.visitor.visitAttributeCoords(attrCoords);
      return this;
   }

   public final Area<Z> attrDownload(String attrDownload) {
      this.visitor.visitAttributeDownload(attrDownload);
      return this;
   }

   public final Area<Z> attrHref(String attrHref) {
      this.visitor.visitAttributeHref(attrHref);
      return this;
   }

   public final Area<Z> attrHreflang(String attrHreflang) {
      this.visitor.visitAttributeHreflang(attrHreflang);
      return this;
   }

   public final Area<Z> attrRel(EnumRelType attrRel) {
      this.visitor.visitAttributeRel(attrRel.getValue());
      return this;
   }

   public final Area<Z> attrShape(EnumShapeType attrShape) {
      this.visitor.visitAttributeShape(attrShape.getValue());
      return this;
   }

   public final Area<Z> attrTarget(String attrTarget) {
      this.visitor.visitAttributeTarget(attrTarget);
      return this;
   }

   public final Area<Z> attrType(String attrType) {
      this.visitor.visitAttributeType(attrType);
      return this;
   }

   public final Area<Z> attrReferrerpolicy(String attrReferrerpolicy) {
      this.visitor.visitAttributeReferrerpolicy(attrReferrerpolicy);
      return this;
   }
}
