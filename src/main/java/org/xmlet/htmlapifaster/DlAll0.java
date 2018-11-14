package org.xmlet.htmlapifaster;

public interface DlAll0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Dd<T> dd() {
      return new Dd(this.self());
   }

   default Dt<T> dt() {
      return new Dt(this.self());
   }

   default Div<T> div() {
      return new Div(this.self());
   }
}
