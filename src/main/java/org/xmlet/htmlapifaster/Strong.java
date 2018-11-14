package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Strong<Z extends Element> implements GlobalAttributes<Strong<Z>, Z>, PhrasingContentChoice<Strong<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Strong(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementStrong(this);
   }

   public Strong(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementStrong(this);
   }

   protected Strong(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementStrong(this);
      }

   }

   public Z __() {
      this.visitor.visitParentStrong(this);
      return this.parent;
   }

   public final Strong<Z> dynamic(Consumer<Strong<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Strong<Z> of(Consumer<Strong<Z>> consumer) {
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
      return "strong";
   }

   public final Strong<Z> self() {
      return this;
   }
}
