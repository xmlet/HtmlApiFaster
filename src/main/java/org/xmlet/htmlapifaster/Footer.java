package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Footer<Z extends Element> implements GlobalAttributes<Footer<Z>, Z>, FlowContentChoice<Footer<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Footer(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFooter(this);
   }

   public Footer(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFooter(this);
   }

   protected Footer(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFooter(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFooter(this);
      return this.parent;
   }

   public final Footer<Z> dynamic(Consumer<Footer<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Footer<Z> of(Consumer<Footer<Z>> consumer) {
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
      return "footer";
   }

   public final Footer<Z> self() {
      return this;
   }
}
