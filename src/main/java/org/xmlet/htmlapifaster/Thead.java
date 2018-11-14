package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Thead<Z extends Element> implements GlobalAttributes<Thead<Z>, Z>, TheadAll0<Thead<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Thead(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementThead(this);
   }

   public Thead(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementThead(this);
   }

   protected Thead(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementThead(this);
      }

   }

   public Z __() {
      this.visitor.visitParentThead(this);
      return this.parent;
   }

   public final Thead<Z> dynamic(Consumer<Thead<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Thead<Z> of(Consumer<Thead<Z>> consumer) {
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
      return "thead";
   }

   public final Thead<Z> self() {
      return this;
   }

   public final Thead<Z> attrRowgroup(String attrRowgroup) {
      this.visitor.visitAttributeRowgroup(attrRowgroup);
      return this;
   }
}
