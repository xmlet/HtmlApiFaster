package org.xmlet.htmlapifaster;

public interface AltFlowContentChoice<T extends Element<T, Z>, Z extends Element> extends PhrasingContentChoice<T, Z> {
   default Address<T> address() {
      return new Address(this.self());
   }

   default Blockquote<T> blockquote() {
      return new Blockquote(this.self());
   }

   default Details<T> details() {
      return new Details(this.self());
   }

   default Dialog<T> dialog() {
      return new Dialog(this.self());
   }

   default Div<T> div() {
      return new Div(this.self());
   }

   default Dl<T> dl() {
      return new Dl(this.self());
   }

   default Fieldset<T> fieldset() {
      return new Fieldset(this.self());
   }

   default Figure<T> figure() {
      return new Figure(this.self());
   }

   default Form<T> form() {
      return new Form(this.self());
   }

   default Hr<T> hr() {
      return new Hr(this.self());
   }

   default Main<T> main() {
      return new Main(this.self());
   }

   default Meter<T> meter() {
      return new Meter(this.self());
   }

   default Nav<T> nav() {
      return new Nav(this.self());
   }

   default Ol<T> ol() {
      return new Ol(this.self());
   }

   default P<T> p() {
      return new P(this.self());
   }

   default Section<T> section() {
      return new Section(this.self());
   }

   default Style<T> style() {
      return new Style(this.self());
   }

   default Table<T> table() {
      return new Table(this.self());
   }

   default Ul<T> ul() {
      return new Ul(this.self());
   }
}
