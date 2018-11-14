package org.xmlet.htmlapifaster;

public interface SectioningContentAll5<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Article<T> article() {
      return new Article(this.self());
   }

   default Aside<T> aside() {
      return new Aside(this.self());
   }

   default Nav<T> nav() {
      return new Nav(this.self());
   }

   default Section<T> section() {
      return new Section(this.self());
   }
}
