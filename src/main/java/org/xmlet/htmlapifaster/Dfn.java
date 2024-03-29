package org.xmlet.htmlapifaster;

public final class Dfn<Z extends Element> implements GlobalAttributes<Dfn<Z>, Z>, PhrasingContentWithoutDfnChoice<Dfn<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Dfn(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementDfn(this);
   }

   public Dfn(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementDfn(this);
   }

   protected Dfn(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementDfn(this);
      }

   }

   public Z __() {
      this.visitor.visitParentDfn(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "dfn";
   }

   public final Dfn<Z> self() {
      return this;
   }
}
