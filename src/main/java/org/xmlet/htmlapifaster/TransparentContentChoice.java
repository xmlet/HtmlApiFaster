package org.xmlet.htmlapifaster;

public interface TransparentContentChoice<T extends Element<T, Z>, Z extends Element> extends TransparentContentWithoutAAll3<T, Z> {
   default A<T> a() {
      return new A(this.self());
   }
}
