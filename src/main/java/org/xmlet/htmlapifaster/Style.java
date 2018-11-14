package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Style<Z extends Element> implements GlobalAttributes<Style<Z>, Z>, TextGroup<Style<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Style(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementStyle(this);
   }

   public Style(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementStyle(this);
   }

   protected Style(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementStyle(this);
      }

   }

   public Z __() {
      this.visitor.visitParentStyle(this);
      return this.parent;
   }

   public final Style<Z> dynamic(Consumer<Style<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Style<Z> of(Consumer<Style<Z>> consumer) {
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
      return "style";
   }

   public final Style<Z> self() {
      return this;
   }

   public final Style<Z> attrMedia(EnumMediaType attrMedia) {
      this.visitor.visitAttributeMedia(attrMedia.getValue());
      return this;
   }

   public final Style<Z> attrNonce(String attrNonce) {
      this.visitor.visitAttributeNonce(attrNonce);
      return this;
   }

   public final Style<Z> attrType(EnumTypeContentType attrType) {
      this.visitor.visitAttributeType(attrType.getValue());
      return this;
   }
}
