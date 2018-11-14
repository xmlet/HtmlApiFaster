package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Html<Z extends Element> implements GlobalAttributes<Html<Z>, Z>, HtmlChoice0<Html<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Html(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementHtml(this);
   }

   public Html(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementHtml(this);
   }

   protected Html(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementHtml(this);
      }

   }

   public Z __() {
      this.visitor.visitParentHtml(this);
      return this.parent;
   }

   public final Html<Z> dynamic(Consumer<Html<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Html<Z> of(Consumer<Html<Z>> consumer) {
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
      return "html";
   }

   public final Html<Z> self() {
      return this;
   }

   public final Html<Z> attrManifest(String attrManifest) {
      this.visitor.visitAttributeManifest(attrManifest);
      return this;
   }
}
