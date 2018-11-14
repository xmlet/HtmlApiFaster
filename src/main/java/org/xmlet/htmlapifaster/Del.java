package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Del<Z extends Element> implements GlobalAttributes<Del<Z>, Z>, TransparentContentChoice<Del<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Del(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDel(this);
   }

   public Del(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDel(this);
   }

   protected Del(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDel(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDel(this);
      return this.parent;
   }

   public final Del<Z> dynamic(Consumer<Del<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Del<Z> of(Consumer<Del<Z>> consumer) {
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
      return "del";
   }

   public final Del<Z> self() {
      return this;
   }

   public final Del<Z> attrCite(String attrCite) {
      this.visitor.visitAttributeCite(attrCite);
      return this;
   }

   public final Del<Z> attrDatetime(String attrDatetime) {
      this.visitor.visitAttributeDatetime(attrDatetime);
      return this;
   }
}
