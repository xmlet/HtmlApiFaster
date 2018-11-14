package org.xmlet.htmlapifaster;

public interface DivChoice0<T extends Element<T, Z>, Z extends Element> extends FlowContentChoice<T, Z> {
   default Dt<T> dt() {
      return new Dt(this.self());
   }

   default Dd<T> dd() {
      return new Dd(this.self());
   }
}
