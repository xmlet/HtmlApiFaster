package org.xmlet.htmlapifaster;

public interface MetadataContentAll1<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Base<T> base() {
      return new Base(this.self());
   }

   default Link<T> link() {
      return new Link(this.self());
   }

   default Meta<T> meta() {
      return new Meta(this.self());
   }

   default Noscript<T> noscript() {
      return new Noscript(this.self());
   }

   default Script<T> script() {
      return new Script(this.self());
   }

   default Style<T> style() {
      return new Style(this.self());
   }

   default Template<T> template() {
      return new Template(this.self());
   }

   default Title<T> title() {
      return new Title(this.self());
   }
}
