package org.xmlet.htmlapifaster;

import java.util.Objects;
import java.util.function.BiConsumer;

public final class CustomElement<Z extends Element> implements GlobalAttributes<CustomElement<Z>, Z>, DivChoice0<CustomElement<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;
   protected final String name;

   public CustomElement(Z var1, String var2) {
      this.parent = var1;
      this.visitor = var1.getVisitor();
      this.name = var2;
      this.visitor.visitElement(this);
   }

   public Z __() {
      this.visitor.visitParent(this);
      return this.parent;
   }

   public final CustomElement<Z> async(BiConsumer<Runnable, CustomElement<Z>> var1) {
      this.visitor.visitOpenAsync();
      ElementVisitor var2 = this.visitor;
      this.visitor.getClass();
      Objects.requireNonNull(var2);
      var1.accept(var2::visitCloseAsync, this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return this.name;
   }

   public final CustomElement<Z> self() {
      return this;
   }
}
