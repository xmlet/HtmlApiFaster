package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

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

   public final Thead<Z> async(BiConsumer<Runnable, Thead<Z>> var1) {
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
