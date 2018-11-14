package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Script<Z extends Element> implements GlobalAttributes<Script<Z>, Z>, TextGroup<Script<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Script(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementScript(this);
   }

   public Script(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementScript(this);
   }

   protected Script(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementScript(this);
      }

   }

   public Z __() {
      this.visitor.visitParentScript(this);
      return this.parent;
   }

   public final Script<Z> dynamic(Consumer<Script<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Script<Z> of(Consumer<Script<Z>> consumer) {
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
      return "script";
   }

   public final Script<Z> self() {
      return this;
   }

   public final Script<Z> attrSrc(String attrSrc) {
      this.visitor.visitAttributeSrc(attrSrc);
      return this;
   }

   public final Script<Z> attrType(EnumTypeScriptType attrType) {
      this.visitor.visitAttributeType(attrType.getValue());
      return this;
   }

   public final Script<Z> attrCharset(String attrCharset) {
      this.visitor.visitAttributeCharset(attrCharset);
      return this;
   }

   public final Script<Z> attrAsync(Boolean attrAsync) {
      this.visitor.visitAttributeAsync(attrAsync.toString());
      return this;
   }

   public final Script<Z> attrDefer(Boolean attrDefer) {
      this.visitor.visitAttributeDefer(attrDefer.toString());
      return this;
   }

   public final Script<Z> attrNonce(String attrNonce) {
      this.visitor.visitAttributeNonce(attrNonce);
      return this;
   }

   public final Script<Z> attrCrossorigin(EnumCrossoriginCrossOriginType attrCrossorigin) {
      this.visitor.visitAttributeCrossorigin(attrCrossorigin.getValue());
      return this;
   }
}
