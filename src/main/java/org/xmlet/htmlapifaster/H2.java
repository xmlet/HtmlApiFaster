package org.xmlet.htmlapifaster;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class H2<Z extends Element> implements GlobalAttributes<H2<Z>, Z>, PhrasingContentChoice<H2<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public H2(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementH2(this);
   }

   public H2(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementH2(this);
   }

   protected H2(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementH2(this);
      }

   }

   public Z __() {
      this.visitor.visitParentH2(this);
      return this.parent;
   }

   public final H2<Z> dynamic(Consumer<H2<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final H2<Z> async(BiConsumer<Runnable, H2<Z>> var1) {
      this.visitor.visitOpenAsync();
      ElementVisitor var10001 = this.visitor;
      this.visitor.getClass();
      var1.accept(var10001::visitCloseAsync, this);
      return this;
   }

   public final H2<Z> of(Consumer<H2<Z>> consumer) {
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
      return "h2";
   }

   public final H2<Z> self() {
      return this;
   }
}
