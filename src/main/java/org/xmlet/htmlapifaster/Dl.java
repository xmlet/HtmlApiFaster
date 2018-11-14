package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Dl<Z extends Element> implements GlobalAttributes<Dl<Z>, Z>, DlAll0<Dl<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Dl(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDl(this);
   }

   public Dl(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDl(this);
   }

   protected Dl(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDl(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDl(this);
      return this.parent;
   }

   public final Dl<Z> dynamic(Consumer<Dl<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Dl<Z> of(Consumer<Dl<Z>> consumer) {
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
      return "dl";
   }

   public final Dl<Z> self() {
      return this;
   }
}
