package org.xmlet.htmlapifaster;

public interface EmbeddedContentAll9<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Audio<T> audio() {
      return new Audio(this.self());
   }

   default Canvas<T> canvas() {
      return new Canvas(this.self());
   }

   default Embed<T> embed() {
      return new Embed(this.self());
   }

   default Iframe<T> iframe() {
      return new Iframe(this.self());
   }

   default Img<T> img() {
      return new Img(this.self());
   }

   default Math<T> math() {
      return new Math(this.self());
   }

   default Object<T> object() {
      return new Object(this.self());
   }

   default Picture<T> picture() {
      return new Picture(this.self());
   }

   default Svg<T> svg() {
      return new Svg(this.self());
   }

   default Video<T> video() {
      return new Video(this.self());
   }
}
