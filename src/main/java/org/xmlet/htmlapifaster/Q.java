package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Q<Z extends Element> implements GlobalAttributes<Q<Z>, Z>, PhrasingContentChoice<Q<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Q(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementQ(this);
   }

   public Q(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementQ(this);
   }

   protected Q(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementQ(this);
      }

   }

   public Z __() {
      this.visitor.visitParentQ(this);
      return this.parent;
   }

   public final Q<Z> dynamic(Consumer<Q<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Q<Z> of(Consumer<Q<Z>> consumer) {
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
      return "q";
   }

   public final Q<Z> self() {
      return this;
   }

   public final Q<Z> attrCite(String attrCite) {
      this.visitor.visitAttributeCite(attrCite);
      return this;
   }
}
