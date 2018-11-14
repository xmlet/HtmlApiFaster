package org.xmlet.htmlapifaster;

public interface DatalistChoice0<T extends Element<T, Z>, Z extends Element> extends PhrasingContentChoice<T, Z> {
   default Option<T> option() {
      return new Option(this.self());
   }
}
