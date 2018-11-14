package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Col<Z extends Element> implements GlobalAttributes<Col<Z>, Z>, TextGroup<Col<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Col(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCol(this);
   }

   public Col(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCol(this);
   }

   protected Col(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCol(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCol(this);
      return this.parent;
   }

   public final Col<Z> dynamic(Consumer<Col<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Col<Z> of(Consumer<Col<Z>> consumer) {
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
      return "col";
   }

   public final Col<Z> self() {
      return this;
   }

   public final Col<Z> attrSpan(Long attrSpan) {
      this.visitor.visitAttributeSpan(attrSpan.toString());
      return this;
   }
}
