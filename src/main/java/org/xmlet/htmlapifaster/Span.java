package org.xmlet.htmlapifaster;

public final class Span<Z extends Element> implements GlobalAttributes<Span<Z>, Z>, PhrasingContentChoice<Span<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Span(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSpan(this);
   }

   public Span(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSpan(this);
   }

   protected Span(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSpan(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSpan(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "span";
   }

   public final Span<Z> self() {
      return this;
   }
}
