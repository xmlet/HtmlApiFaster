package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Meta<Z extends Element> implements GlobalAttributes<Meta<Z>, Z>, TextGroup<Meta<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Meta(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMeta(this);
   }

   public Meta(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMeta(this);
   }

   protected Meta(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMeta(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMeta(this);
      return this.parent;
   }

   public final Meta<Z> dynamic(Consumer<Meta<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Meta<Z> of(Consumer<Meta<Z>> consumer) {
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
      return "meta";
   }

   public final Meta<Z> self() {
      return this;
   }

   public final Meta<Z> attrCharset(String attrCharset) {
      this.visitor.visitAttributeCharset(attrCharset);
      return this;
   }

   public final Meta<Z> attrContent(String attrContent) {
      this.visitor.visitAttributeContent(attrContent);
      return this;
   }

   public final Meta<Z> attrHttpEquiv(EnumHttpEquivType attrHttpEquiv) {
      this.visitor.visitAttributeHttpEquiv(attrHttpEquiv.getValue());
      return this;
   }

   public final Meta<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }
}
