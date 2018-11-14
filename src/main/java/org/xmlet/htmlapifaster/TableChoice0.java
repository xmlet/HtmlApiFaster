package org.xmlet.htmlapifaster;

public interface TableChoice0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Caption<T> caption() {
      return new Caption(this.self());
   }

   default Colgroup<T> colgroup() {
      return new Colgroup(this.self());
   }

   default Thead<T> thead() {
      return new Thead(this.self());
   }

   default Tfoot<T> tfoot() {
      return new Tfoot(this.self());
   }

   default Tbody<T> tbody() {
      return new Tbody(this.self());
   }

   default Tr<T> tr() {
      return new Tr(this.self());
   }
}
