package org.xmlet.htmlapifaster;

public interface TransparentContentWithoutAAll1<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Html<T> html() {
      return new Html(this.self());
   }

   default Head<T> head() {
      return new Head(this.self());
   }

   default Title<T> title() {
      return new Title(this.self());
   }

   default Base<T> base() {
      return new Base(this.self());
   }

   default Link<T> link() {
      return new Link(this.self());
   }

   default Meta<T> meta() {
      return new Meta(this.self());
   }

   default Style<T> style() {
      return new Style(this.self());
   }

   default Script<T> script() {
      return new Script(this.self());
   }

   default Noscript<T> noscript() {
      return new Noscript(this.self());
   }

   default Body<T> body() {
      return new Body(this.self());
   }

   default Section<T> section() {
      return new Section(this.self());
   }

   default Nav<T> nav() {
      return new Nav(this.self());
   }

   default Article<T> article() {
      return new Article(this.self());
   }

   default Aside<T> aside() {
      return new Aside(this.self());
   }

   default H1<T> h1() {
      return new H1(this.self());
   }

   default H2<T> h2() {
      return new H2(this.self());
   }

   default H3<T> h3() {
      return new H3(this.self());
   }

   default H4<T> h4() {
      return new H4(this.self());
   }

   default H5<T> h5() {
      return new H5(this.self());
   }

   default H6<T> h6() {
      return new H6(this.self());
   }

   default Header<T> header() {
      return new Header(this.self());
   }

   default Footer<T> footer() {
      return new Footer(this.self());
   }

   default Address<T> address() {
      return new Address(this.self());
   }

   default P<T> p() {
      return new P(this.self());
   }

   default Br<T> br() {
      return new Br(this.self());
   }

   default Pre<T> pre() {
      return new Pre(this.self());
   }

   default Dialog<T> dialog() {
      return new Dialog(this.self());
   }

   default Blockquote<T> blockquote() {
      return new Blockquote(this.self());
   }

   default Ol<T> ol() {
      return new Ol(this.self());
   }

   default Ul<T> ul() {
      return new Ul(this.self());
   }

   default Li<T> li() {
      return new Li(this.self());
   }

   default Dl<T> dl() {
      return new Dl(this.self());
   }

   default Dt<T> dt() {
      return new Dt(this.self());
   }

   default Dd<T> dd() {
      return new Dd(this.self());
   }

   default Em<T> em() {
      return new Em(this.self());
   }

   default Strong<T> strong() {
      return new Strong(this.self());
   }

   default Small<T> small() {
      return new Small(this.self());
   }

   default Cite<T> cite() {
      return new Cite(this.self());
   }

   default Q<T> q() {
      return new Q(this.self());
   }

   default Dfn<T> dfn() {
      return new Dfn(this.self());
   }

   default Abbr<T> abbr() {
      return new Abbr(this.self());
   }

   default Code<T> code() {
      return new Code(this.self());
   }

   default Var<T> var() {
      return new Var(this.self());
   }

   default Samp<T> samp() {
      return new Samp(this.self());
   }

   default Kbd<T> kbd() {
      return new Kbd(this.self());
   }

   default Sub<T> sub() {
      return new Sub(this.self());
   }

   default Sup<T> sup() {
      return new Sup(this.self());
   }

   default I<T> i() {
      return new I(this.self());
   }

   default B<T> b() {
      return new B(this.self());
   }

   default Mark<T> mark() {
      return new Mark(this.self());
   }

   default Progress<T> progress() {
      return new Progress(this.self());
   }

   default Meter<T> meter() {
      return new Meter(this.self());
   }

   default Time<T> time() {
      return new Time(this.self());
   }

   default Ruby<T> ruby() {
      return new Ruby(this.self());
   }

   default Rt<T> rt() {
      return new Rt(this.self());
   }

   default Rtc<T> rtc() {
      return new Rtc(this.self());
   }

   default Rb<T> rb() {
      return new Rb(this.self());
   }

   default Rp<T> rp() {
      return new Rp(this.self());
   }

   default Bdo<T> bdo() {
      return new Bdo(this.self());
   }

   default Span<T> span() {
      return new Span(this.self());
   }

   default Ins<T> ins() {
      return new Ins(this.self());
   }

   default Del<T> del() {
      return new Del(this.self());
   }

   default Figcaption<T> figcaption() {
      return new Figcaption(this.self());
   }

   default Figure<T> figure() {
      return new Figure(this.self());
   }

   default Img<T> img() {
      return new Img(this.self());
   }

   default Iframe<T> iframe() {
      return new Iframe(this.self());
   }

   default Embed<T> embed() {
      return new Embed(this.self());
   }

   default Object<T> object() {
      return new Object(this.self());
   }

   default Param<T> param() {
      return new Param(this.self());
   }

   default Details<T> details() {
      return new Details(this.self());
   }

   default Legend<T> legend() {
      return new Legend(this.self());
   }

   default Div<T> div() {
      return new Div(this.self());
   }

   default Source<T> source() {
      return new Source(this.self());
   }

   default Audio<T> audio() {
      return new Audio(this.self());
   }

   default Track<T> track() {
      return new Track(this.self());
   }

   default Video<T> video() {
      return new Video(this.self());
   }

   default Hr<T> hr() {
      return new Hr(this.self());
   }

   default Form<T> form() {
      return new Form(this.self());
   }

   default Fieldset<T> fieldset() {
      return new Fieldset(this.self());
   }

   default Label<T> label() {
      return new Label(this.self());
   }

   default Input<T> input() {
      return new Input(this.self());
   }

   default Button<T> button() {
      return new Button(this.self());
   }

   default Select<T> select() {
      return new Select(this.self());
   }

   default Datalist<T> datalist() {
      return new Datalist(this.self());
   }

   default Optgroup<T> optgroup() {
      return new Optgroup(this.self());
   }

   default Option<T> option() {
      return new Option(this.self());
   }

   default Textarea<T> textarea() {
      return new Textarea(this.self());
   }

   default Output<T> output() {
      return new Output(this.self());
   }

   default Canvas<T> canvas() {
      return new Canvas(this.self());
   }

   default Map<T> map() {
      return new Map(this.self());
   }

   default Area<T> area() {
      return new Area(this.self());
   }

   default Math<T> math() {
      return new Math(this.self());
   }

   default Svg<T> svg() {
      return new Svg(this.self());
   }

   default Table<T> table() {
      return new Table(this.self());
   }

   default Caption<T> caption() {
      return new Caption(this.self());
   }

   default Colgroup<T> colgroup() {
      return new Colgroup(this.self());
   }

   default Col<T> col() {
      return new Col(this.self());
   }

   default Tbody<T> tbody() {
      return new Tbody(this.self());
   }

   default Thead<T> thead() {
      return new Thead(this.self());
   }

   default Tfoot<T> tfoot() {
      return new Tfoot(this.self());
   }

   default Tr<T> tr() {
      return new Tr(this.self());
   }

   default Td<T> td() {
      return new Td(this.self());
   }

   default Th<T> th() {
      return new Th(this.self());
   }

   default Main<T> main() {
      return new Main(this.self());
   }

   default Template<T> template() {
      return new Template(this.self());
   }

   default Bdi<T> bdi() {
      return new Bdi(this.self());
   }

   default Data<T> data() {
      return new Data(this.self());
   }

   default S<T> s() {
      return new S(this.self());
   }

   default U<T> u() {
      return new U(this.self());
   }

   default Wbr<T> wbr() {
      return new Wbr(this.self());
   }

   default Picture<T> picture() {
      return new Picture(this.self());
   }

   default Summary<T> summary() {
      return new Summary(this.self());
   }
}
