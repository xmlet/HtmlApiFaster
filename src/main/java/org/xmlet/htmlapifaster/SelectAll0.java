package org.xmlet.htmlapifaster;

public interface SelectAll0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Option<T> option() {
      return new Option(this.self());
   }

   default Optgroup<T> optgroup() {
      return new Optgroup(this.self());
   }
}
