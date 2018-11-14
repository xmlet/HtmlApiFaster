package org.xmlet.htmlapifaster;

public interface FigureChoice0<T extends Element<T, Z>, Z extends Element> extends FlowContentChoice<T, Z> {
   default Figcaption<T> figcaption() {
      return new Figcaption(this.self());
   }
}
