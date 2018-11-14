package org.xmlet.htmlapifaster;

public class Text<Z extends Element, R> implements Element<Text<Z, R>, Z> {
   private final String text;
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Text(Z var1, ElementVisitor var2, R var3) {
      this.parent = var1;
      this.visitor = var2;
      this.text = var3.toString();
   }

   public Text<Z, R> self() {
      return this;
   }

   public Z __() {
      this.visitor.visitText(this);
      return this.parent;
   }

   public Z getParent() {
      return this.parent;
   }

   public String getName() {
      return "";
   }

   public ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getValue() {
      return this.text;
   }
}
