package org.xmlet.htmlapifaster;

public interface PictureAll0<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Source<T> source() {
      return new Source(this.self());
   }

   default Img<T> img() {
      return new Img(this.self());
   }
}
