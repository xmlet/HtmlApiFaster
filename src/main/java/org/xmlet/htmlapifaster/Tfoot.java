package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Tfoot<Z extends Element> implements GlobalAttributes<Tfoot<Z>, Z>, TfootAll0<Tfoot<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Tfoot(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTfoot(this);
   }

   public Tfoot(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTfoot(this);
   }

   protected Tfoot(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTfoot(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTfoot(this);
      return this.parent;
   }

   public final Tfoot<Z> dynamic(Consumer<Tfoot<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Tfoot<Z> of(Consumer<Tfoot<Z>> consumer) {
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
      return "tfoot";
   }

   public final Tfoot<Z> self() {
      return this;
   }

   public final Tfoot<Z> attrRowgroup(String attrRowgroup) {
      this.visitor.visitAttributeRowgroup(attrRowgroup);
      return this;
   }
}
