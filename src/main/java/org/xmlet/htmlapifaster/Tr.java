package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Tr<Z extends Element> implements GlobalAttributes<Tr<Z>, Z>, TrAll0<Tr<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Tr(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTr(this);
   }

   public Tr(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTr(this);
   }

   protected Tr(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTr(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTr(this);
      return this.parent;
   }

   public final Tr<Z> dynamic(Consumer<Tr<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Tr<Z> of(Consumer<Tr<Z>> consumer) {
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
      return "tr";
   }

   public final Tr<Z> self() {
      return this;
   }

   public final Tr<Z> attrRow(Long attrRow) {
      this.visitor.visitAttributeRow(attrRow.toString());
      return this;
   }
}
