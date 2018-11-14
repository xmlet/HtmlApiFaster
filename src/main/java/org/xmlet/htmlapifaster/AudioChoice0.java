package org.xmlet.htmlapifaster;

public interface AudioChoice0<T extends Element<T, Z>, Z extends Element> extends TransparentContentChoice<T, Z> {
   default Track<T> track() {
      return new Track(this.self());
   }

   default Source<T> source() {
      return new Source(this.self());
   }
}
