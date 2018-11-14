package org.xmlet.htmlapifaster;

public interface TextGroup<T extends Element, Z extends Element> extends Element<T, Z> {
   default <R> T text(R text) {
      this.getVisitor().visitText(new Text(this.self(), this.getVisitor(), text));
      return this.self();
   }

   default <R> T comment(R comment) {
      this.getVisitor().visitComment(new Text(this.self(), this.getVisitor(), comment));
      return this.self();
   }
}
