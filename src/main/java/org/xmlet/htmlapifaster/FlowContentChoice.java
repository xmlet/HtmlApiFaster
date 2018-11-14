package org.xmlet.htmlapifaster;

public interface FlowContentChoice<T extends Element<T, Z>, Z extends Element> extends HeadingContentAll3<T, Z>, SectioningContentAll5<T, Z>, PhrasingContentChoice<T, Z> {
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

   default Footer<T> footer() {
      return new Footer(this.self());
   }

   default Form<T> form() {
      return new Form(this.self());
   }

   default Header<T> header() {
      return new Header(this.self());
   }

   default Hr<T> hr() {
      return new Hr(this.self());
   }

   default Main<T> main() {
      return new Main(this.self());
   }

   default Ol<T> ol() {
      return new Ol(this.self());
   }

   default P<T> p() {
      return new P(this.self());
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
