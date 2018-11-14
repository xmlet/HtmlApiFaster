package org.xmlet.htmlapifaster;

public interface HtmlChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Body<T> body() {
      return new Body(this.self());
   }

   default Head<T> head() {
      return new Head(this.self());
   }
}
