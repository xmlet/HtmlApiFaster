package org.xmlet.htmlapifaster;

public final class Template<Z extends Element> implements GlobalAttributes<Template<Z>, Z>, TransparentContentChoice<Template<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Template(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTemplate(this);
   }

   public Template(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTemplate(this);
   }

   protected Template(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTemplate(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTemplate(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "template";
   }

   public final Template<Z> self() {
      return this;
   }
}
