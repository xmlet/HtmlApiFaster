package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;

public final class Code<Z extends Element> implements GlobalAttributes<Code<Z>, Z>, PhrasingContentChoice<Code<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Code(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCode(this);
   }

   public Code(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCode(this);
   }

   protected Code(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCode(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCode(this);
      return this.parent;
   }

   public final Code<Z> async(BiConsumer<Runnable, Code<Z>> var1) {
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
      return "code";
   }

   public final Code<Z> self() {
      return this;
   }
}
