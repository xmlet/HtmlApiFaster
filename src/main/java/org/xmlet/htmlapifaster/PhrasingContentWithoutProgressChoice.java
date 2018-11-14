package org.xmlet.htmlapifaster;

public interface PhrasingContentWithoutProgressChoice<T extends Element<T, Z>, Z extends Element> extends EmbeddedContentAll3<T, Z> {
   default A<T> a() {
      return new A(this.self());
   }

   default Abbr<T> abbr() {
      return new Abbr(this.self());
   }

   default Area<T> area() {
      return new Area(this.self());
   }

   default B<T> b() {
      return new B(this.self());
   }

   default Bdi<T> bdi() {
      return new Bdi(this.self());
   }

   default Bdo<T> bdo() {
      return new Bdo(this.self());
   }

   default Br<T> br() {
      return new Br(this.self());
   }

   default Button<T> button() {
      return new Button(this.self());
   }

   default Cite<T> cite() {
      return new Cite(this.self());
   }

   default Code<T> code() {
      return new Code(this.self());
   }

   default Data<T> data() {
      return new Data(this.self());
   }

   default Datalist<T> datalist() {
      return new Datalist(this.self());
   }

   default Del<T> del() {
      return new Del(this.self());
   }

   default Dfn<T> dfn() {
      return new Dfn(this.self());
   }

   default Em<T> em() {
      return new Em(this.self());
   }

   default I<T> i() {
      return new I(this.self());
   }

   default Input<T> input() {
      return new Input(this.self());
   }

   default Ins<T> ins() {
      return new Ins(this.self());
   }

   default Kbd<T> kbd() {
      return new Kbd(this.self());
   }

   default Label<T> label() {
      return new Label(this.self());
   }

   default Link<T> link() {
      return new Link(this.self());
   }

   default Map<T> map() {
      return new Map(this.self());
   }

   default Mark<T> mark() {
      return new Mark(this.self());
   }

   default Meter<T> meter() {
      return new Meter(this.self());
   }

   default Noscript<T> noscript() {
      return new Noscript(this.self());
   }

   default Output<T> output() {
      return new Output(this.self());
   }

   default Q<T> q() {
      return new Q(this.self());
   }

   default Ruby<T> ruby() {
      return new Ruby(this.self());
   }

   default S<T> s() {
      return new S(this.self());
   }

   default Samp<T> samp() {
      return new Samp(this.self());
   }

   default Script<T> script() {
      return new Script(this.self());
   }

   default Select<T> select() {
      return new Select(this.self());
   }

   default Small<T> small() {
      return new Small(this.self());
   }

   default Span<T> span() {
      return new Span(this.self());
   }

   default Strong<T> strong() {
      return new Strong(this.self());
   }

   default Sub<T> sub() {
      return new Sub(this.self());
   }

   default Sup<T> sup() {
      return new Sup(this.self());
   }

   default Template<T> template() {
      return new Template(this.self());
   }

   default Textarea<T> textarea() {
      return new Textarea(this.self());
   }

   default Time<T> time() {
      return new Time(this.self());
   }

   default U<T> u() {
      return new U(this.self());
   }

   default Var<T> var() {
      return new Var(this.self());
   }

   default Wbr<T> wbr() {
      return new Wbr(this.self());
   }
}
