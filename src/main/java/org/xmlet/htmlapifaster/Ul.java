package org.xmlet.htmlapifaster;

public final class Ul<Z extends Element> implements GlobalAttributes<Ul<Z>, Z>, UlAll0<Ul<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Ul(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementUl(this);
   }

   public Ul(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementUl(this);
   }

   protected Ul(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementUl(this);
      }

   }

   public Z __() {
      this.visitor.visitParentUl(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "ul";
   }

   public final Ul<Z> self() {
      return this;
   }
}
