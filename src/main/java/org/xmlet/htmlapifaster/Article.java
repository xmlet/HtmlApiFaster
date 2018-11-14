package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Article<Z extends Element> implements GlobalAttributes<Article<Z>, Z>, MainLessFlowContentChoice<Article<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Article(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementArticle(this);
   }

   public Article(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementArticle(this);
   }

   protected Article(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementArticle(this);
      }

   }

   public Z __() {
      this.visitor.visitParentArticle(this);
      return this.parent;
   }

   public final Article<Z> dynamic(Consumer<Article<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Article<Z> of(Consumer<Article<Z>> consumer) {
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
      return "article";
   }

   public final Article<Z> self() {
      return this;
   }
}
