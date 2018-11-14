package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Ins<Z extends Element> implements GlobalAttributes<Ins<Z>, Z>, TransparentContentChoice<Ins<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Ins(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementIns(this);
   }

   public Ins(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementIns(this);
   }

   protected Ins(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementIns(this);
      }

   }

   public Z __() {
      this.visitor.visitParentIns(this);
      return this.parent;
   }

   public final Ins<Z> dynamic(Consumer<Ins<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Ins<Z> of(Consumer<Ins<Z>> consumer) {
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
      return "ins";
   }

   public final Ins<Z> self() {
      return this;
   }

   public final Ins<Z> attrCite(String attrCite) {
      this.visitor.visitAttributeCite(attrCite);
      return this;
   }

   public final Ins<Z> attrDatetime(String attrDatetime) {
      this.visitor.visitAttributeDatetime(attrDatetime);
      return this;
   }
}
