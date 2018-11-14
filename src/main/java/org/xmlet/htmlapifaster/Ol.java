package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Ol<Z extends Element> implements GlobalAttributes<Ol<Z>, Z>, OlAll0<Ol<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Ol(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOl(this);
   }

   public Ol(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOl(this);
   }

   protected Ol(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOl(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOl(this);
      return this.parent;
   }

   public final Ol<Z> dynamic(Consumer<Ol<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Ol<Z> of(Consumer<Ol<Z>> consumer) {
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
      return "ol";
   }

   public final Ol<Z> self() {
      return this;
   }

   public final Ol<Z> attrType(EnumTypeOlType attrType) {
      this.visitor.visitAttributeType(attrType.getValue());
      return this;
   }

   public final Ol<Z> attrStart(Integer attrStart) {
      this.visitor.visitAttributeStart(attrStart.toString());
      return this;
   }

   public final Ol<Z> attrReversed(Boolean attrReversed) {
      this.visitor.visitAttributeReversed(attrReversed.toString());
      return this;
   }
}
