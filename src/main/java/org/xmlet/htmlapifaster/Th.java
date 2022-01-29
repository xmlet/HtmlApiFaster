package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Th<Z extends Element> implements GlobalAttributes<Th<Z>, Z>, AltFlowContentChoice<Th<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Th(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTh(this);
   }

   public Th(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTh(this);
   }

   protected Th(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTh(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTh(this);
      return this.parent;
   }

   public final Th<Z> async(BiConsumer<Runnable, Th<Z>> var1) {
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
      return "th";
   }

   public final Th<Z> self() {
      return this;
   }

   public final Th<Z> attrHeaders(String attrHeaders) {
      this.visitor.visitAttributeHeaders(attrHeaders);
      return this;
   }

   public final Th<Z> attrRowspan(Integer attrRowspan) {
      this.visitor.visitAttributeRowspan(attrRowspan.toString());
      return this;
   }

   public final Th<Z> attrColspan(Integer attrColspan) {
      this.visitor.visitAttributeColspan(attrColspan.toString());
      return this;
   }

   public final Th<Z> attrColumnheader(String attrColumnheader) {
      this.visitor.visitAttributeColumnheader(attrColumnheader);
      return this;
   }

   public final Th<Z> attrRowheader(String attrRowheader) {
      this.visitor.visitAttributeRowheader(attrRowheader);
      return this;
   }

   public final Th<Z> attrAbbr(String attrAbbr) {
      this.visitor.visitAttributeAbbr(attrAbbr);
      return this;
   }

   public final Th<Z> attrScope(EnumScopeType attrScope) {
      this.visitor.visitAttributeScope(attrScope.getValue());
      return this;
   }
}
