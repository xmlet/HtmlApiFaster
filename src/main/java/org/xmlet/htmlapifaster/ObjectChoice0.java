package org.xmlet.htmlapifaster;

public interface ObjectChoice0<T extends Element<T, Z>, Z extends Element> extends TransparentContentChoice<T, Z> {
   default Param<T> param() {
      return new Param(this.self());
   }
}
