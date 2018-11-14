package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Section<Z extends Element> implements GlobalAttributes<Section<Z>, Z>, FlowContentChoice<Section<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Section(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSection(this);
   }

   public Section(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSection(this);
   }

   protected Section(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSection(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSection(this);
      return this.parent;
   }

   public final Section<Z> dynamic(Consumer<Section<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Section<Z> of(Consumer<Section<Z>> consumer) {
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
      return "section";
   }

   public final Section<Z> self() {
      return this;
   }
}
