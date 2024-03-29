package org.xmlet.htmlapifaster;

public final class Blockquote<Z extends Element> implements GlobalAttributes<Blockquote<Z>, Z>, FlowContentChoice<Blockquote<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Blockquote(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBlockquote(this);
   }

   public Blockquote(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBlockquote(this);
   }

   protected Blockquote(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBlockquote(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBlockquote(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "blockquote";
   }

   public final Blockquote<Z> self() {
      return this;
   }

   public final Blockquote<Z> attrCite(String attrCite) {
      this.visitor.visitAttributeCite(attrCite);
      return this;
   }
}
