package org.xmlet.htmlapifaster;

public interface TrAll0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Th<T> th() {
      return new Th(this.self());
   }

   default Td<T> td() {
      return new Td(this.self());
   }
}
