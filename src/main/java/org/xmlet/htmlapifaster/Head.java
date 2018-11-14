package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Head<Z extends Element> implements GlobalAttributes<Head<Z>, Z>, MetadataContentAll1<Head<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Head(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementHead(this);
   }

   public Head(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementHead(this);
   }

   protected Head(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementHead(this);
      }

   }

   public Z __() {
      this.visitor.visitParentHead(this);
      return this.parent;
   }

   public final Head<Z> dynamic(Consumer<Head<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Head<Z> of(Consumer<Head<Z>> consumer) {
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
      return "head";
   }

   public final Head<Z> self() {
      return this;
   }
}
