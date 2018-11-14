package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Details<Z extends Element> implements GlobalAttributes<Details<Z>, Z>, TextGroup<Details<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Details(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDetails(this);
   }

   public Details(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDetails(this);
   }

   protected Details(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDetails(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDetails(this);
      return this.parent;
   }

   public final Details<Z> dynamic(Consumer<Details<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Details<Z> of(Consumer<Details<Z>> consumer) {
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
      return "details";
   }

   public final Details<Z> self() {
      return this;
   }

   public DetailsSummary<Z> summary(String summary) {
      ((Summary)(new Summary(this, this.visitor, true)).text(summary)).__();
      return new DetailsSummary(this.parent, this.visitor, true);
   }

   public final Details<Z> attrOpen(Boolean attrOpen) {
      this.visitor.visitAttributeOpen(attrOpen.toString());
      return this;
   }
}
