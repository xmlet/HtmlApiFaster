package org.xmlet.htmlapifaster;

public interface HeadingContentAll2<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default H1<T> h1() {
      return new H1(this.self());
   }

   default H2<T> h2() {
      return new H2(this.self());
   }

   default H3<T> h3() {
      return new H3(this.self());
   }

   default H4<T> h4() {
      return new H4(this.self());
   }

   default H5<T> h5() {
      return new H5(this.self());
   }

   default H6<T> h6() {
      return new H6(this.self());
   }
}
