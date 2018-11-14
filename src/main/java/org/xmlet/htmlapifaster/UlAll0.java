package org.xmlet.htmlapifaster;

public interface UlAll0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Li<T> li() {
      return new Li(this.self());
   }
}
