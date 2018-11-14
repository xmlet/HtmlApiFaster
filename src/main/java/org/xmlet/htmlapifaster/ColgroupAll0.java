package org.xmlet.htmlapifaster;

public interface ColgroupAll0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Col<T> col() {
      return new Col(this.self());
   }

   default Template<T> template() {
      return new Template(this.self());
   }
}
