package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public final class Body<Z extends Element> implements GlobalAttributes<Body<Z>, Z>, FlowContentChoice<Body<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Body(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBody(this);
   }

   public Body(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBody(this);
   }

   protected Body(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBody(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBody(this);
      return this.parent;
   }

   public final Body<Z> dynamic(Consumer<Body<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Body<Z> of(Consumer<Body<Z>> consumer) {
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
      return "body";
   }

   public final Body<Z> self() {
      return this;
   }

   public final Body<Z> attrOnafterprint(String attrOnafterprint) {
      this.visitor.visitAttributeOnafterprint(attrOnafterprint);
      return this;
   }

   public final Body<Z> attrOnbeforeprint(String attrOnbeforeprint) {
      this.visitor.visitAttributeOnbeforeprint(attrOnbeforeprint);
      return this;
   }

   public final Body<Z> attrOnbeforeunload(String attrOnbeforeunload) {
      this.visitor.visitAttributeOnbeforeunload(attrOnbeforeunload);
      return this;
   }

   public final Body<Z> attrOnhashchange(String attrOnhashchange) {
      this.visitor.visitAttributeOnhashchange(attrOnhashchange);
      return this;
   }

   public final Body<Z> attrOnlanguagechange(String attrOnlanguagechange) {
      this.visitor.visitAttributeOnlanguagechange(attrOnlanguagechange);
      return this;
   }

   public final Body<Z> attrOnmessage(String attrOnmessage) {
      this.visitor.visitAttributeOnmessage(attrOnmessage);
      return this;
   }

   public final Body<Z> attrOnoffline(String attrOnoffline) {
      this.visitor.visitAttributeOnoffline(attrOnoffline);
      return this;
   }

   public final Body<Z> attrOnonline(String attrOnonline) {
      this.visitor.visitAttributeOnonline(attrOnonline);
      return this;
   }

   public final Body<Z> attrOnpagehide(String attrOnpagehide) {
      this.visitor.visitAttributeOnpagehide(attrOnpagehide);
      return this;
   }

   public final Body<Z> attrOnpageshow(String attrOnpageshow) {
      this.visitor.visitAttributeOnpageshow(attrOnpageshow);
      return this;
   }

   public final Body<Z> attrOnpopstate(String attrOnpopstate) {
      this.visitor.visitAttributeOnpopstate(attrOnpopstate);
      return this;
   }

   public final Body<Z> attrOnrejectionhandled(String attrOnrejectionhandled) {
      this.visitor.visitAttributeOnrejectionhandled(attrOnrejectionhandled);
      return this;
   }

   public final Body<Z> attrOnstorage(String attrOnstorage) {
      this.visitor.visitAttributeOnstorage(attrOnstorage);
      return this;
   }

   public final Body<Z> attrOnunhandledrejection(String attrOnunhandledrejection) {
      this.visitor.visitAttributeOnunhandledrejection(attrOnunhandledrejection);
      return this;
   }

   public final Body<Z> attrOnunload(String attrOnunload) {
      this.visitor.visitAttributeOnunload(attrOnunload);
      return this;
   }
}
