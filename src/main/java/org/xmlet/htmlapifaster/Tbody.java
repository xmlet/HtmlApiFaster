package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Tbody<Z extends Element> implements GlobalAttributes<Tbody<Z>, Z>, TbodyAll0<Tbody<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Tbody(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTbody(this);
   }

   public Tbody(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTbody(this);
   }

   protected Tbody(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTbody(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTbody(this);
      return this.parent;
   }

   public final Tbody<Z> dynamic(Consumer<Tbody<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Tbody<Z> of(Consumer<Tbody<Z>> consumer) {
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
      return "tbody";
   }

   public final Tbody<Z> self() {
      return this;
   }

   public final Tbody<Z> attrRowgroup(String attrRowgroup) {
      this.visitor.visitAttributeRowgroup(attrRowgroup);
      return this;
   }
}
