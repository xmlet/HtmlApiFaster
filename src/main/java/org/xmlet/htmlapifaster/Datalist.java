package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Datalist<Z extends Element> implements GlobalAttributes<Datalist<Z>, Z>, DatalistChoice0<Datalist<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Datalist(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDatalist(this);
   }

   public Datalist(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDatalist(this);
   }

   protected Datalist(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDatalist(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDatalist(this);
      return this.parent;
   }

   public final Datalist<Z> dynamic(Consumer<Datalist<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Datalist<Z> of(Consumer<Datalist<Z>> consumer) {
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
      return "datalist";
   }

   public final Datalist<Z> self() {
      return this;
   }
}
