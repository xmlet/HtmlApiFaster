package org.xmlet.htmlapifaster;

public final class Picture<Z extends Element> implements GlobalAttributes<Picture<Z>, Z>, PictureAll0<Picture<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Picture(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementPicture(this);
   }

   public Picture(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementPicture(this);
   }

   protected Picture(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementPicture(this);
      }

   }

   public Z __() {
      this.visitor.visitParentPicture(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "picture";
   }

   public final Picture<Z> self() {
      return this;
   }
}
