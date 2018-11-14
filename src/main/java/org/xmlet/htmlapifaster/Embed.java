package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Embed<Z extends Element> implements GlobalAttributes<Embed<Z>, Z>, TextGroup<Embed<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Embed(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementEmbed(this);
   }

   public Embed(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementEmbed(this);
   }

   protected Embed(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementEmbed(this);
      }

   }

   public Z __() {
      this.visitor.visitParentEmbed(this);
      return this.parent;
   }

   public final Embed<Z> dynamic(Consumer<Embed<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Embed<Z> of(Consumer<Embed<Z>> consumer) {
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
      return "embed";
   }

   public final Embed<Z> self() {
      return this;
   }

   public final Embed<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Embed<Z> attrType(String attrType) {
      this.visitor.visitAttributeType(attrType);
      return this;
   }

   public final Embed<Z> attrWidth(String attrWidth) {
      this.visitor.visitAttributeWidth(attrWidth);
      return this;
   }

   public final Embed<Z> attrHeight(String attrHeight) {
      this.visitor.visitAttributeHeight(attrHeight);
      return this;
   }
}
