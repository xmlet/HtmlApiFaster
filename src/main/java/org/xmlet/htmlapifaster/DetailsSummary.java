package org.xmlet.htmlapifaster;

import java.util.function.Consumer;

public class DetailsSummary<Z extends Element> implements CustomAttributeGroup<DetailsSummary<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public DetailsSummary(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public DetailsSummary(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected DetailsSummary(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentDetailsSummary(this);
      return this.parent;
   }

   public final DetailsSummary<Z> dynamic(Consumer<DetailsSummary<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final DetailsSummary<Z> of(Consumer<DetailsSummary<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "details";
   }

   public final DetailsSummary<Z> self() {
      return this;
   }

   public DetailsComplete<Z> address(String address) {
      ((Address)(new Address(this, this.visitor, true)).text(address)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> blockquote(String blockquote) {
      ((Blockquote)(new Blockquote(this, this.visitor, true)).text(blockquote)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> details(String details) {
      ((Details)(new Details(this, this.visitor, true)).text(details)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> dialog(String dialog) {
      ((Dialog)(new Dialog(this, this.visitor, true)).text(dialog)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> div(String div) {
      ((Div)(new Div(this, this.visitor, true)).text(div)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> dl(String dl) {
      ((Dl)(new Dl(this, this.visitor, true)).text(dl)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> fieldset(String fieldset) {
      ((Fieldset)(new Fieldset(this, this.visitor, true)).text(fieldset)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> figure(String figure) {
      ((Figure)(new Figure(this, this.visitor, true)).text(figure)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> footer(String footer) {
      ((Footer)(new Footer(this, this.visitor, true)).text(footer)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> form(String form) {
      ((Form)(new Form(this, this.visitor, true)).text(form)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> header(String header) {
      ((Header)(new Header(this, this.visitor, true)).text(header)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> hr(String hr) {
      ((Hr)(new Hr(this, this.visitor, true)).text(hr)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> main(String main) {
      ((Main)(new Main(this, this.visitor, true)).text(main)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> ol(String ol) {
      ((Ol)(new Ol(this, this.visitor, true)).text(ol)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> p(String p) {
      ((P)(new P(this, this.visitor, true)).text(p)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> style(String style) {
      ((Style)(new Style(this, this.visitor, true)).text(style)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> table(String table) {
      ((Table)(new Table(this, this.visitor, true)).text(table)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> ul(String ul) {
      ((Ul)(new Ul(this, this.visitor, true)).text(ul)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> h1(String h1) {
      ((H1)(new H1(this, this.visitor, true)).text(h1)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> h2(String h2) {
      ((H2)(new H2(this, this.visitor, true)).text(h2)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> h3(String h3) {
      ((H3)(new H3(this, this.visitor, true)).text(h3)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> h4(String h4) {
      ((H4)(new H4(this, this.visitor, true)).text(h4)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> h5(String h5) {
      ((H5)(new H5(this, this.visitor, true)).text(h5)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> h6(String h6) {
      ((H6)(new H6(this, this.visitor, true)).text(h6)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> article(String article) {
      ((Article)(new Article(this, this.visitor, true)).text(article)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> aside(String aside) {
      ((Aside)(new Aside(this, this.visitor, true)).text(aside)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> nav(String nav) {
      ((Nav)(new Nav(this, this.visitor, true)).text(nav)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> section(String section) {
      ((Section)(new Section(this, this.visitor, true)).text(section)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> a(String a) {
      ((A)(new A(this, this.visitor, true)).text(a)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> abbr(String abbr) {
      ((Abbr)(new Abbr(this, this.visitor, true)).text(abbr)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> area(String area) {
      ((Area)(new Area(this, this.visitor, true)).text(area)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> b(String b) {
      ((B)(new B(this, this.visitor, true)).text(b)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> bdi(String bdi) {
      ((Bdi)(new Bdi(this, this.visitor, true)).text(bdi)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> bdo(String bdo) {
      ((Bdo)(new Bdo(this, this.visitor, true)).text(bdo)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> br(String br) {
      ((Br)(new Br(this, this.visitor, true)).text(br)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> button(String button) {
      ((Button)(new Button(this, this.visitor, true)).text(button)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> cite(String cite) {
      ((Cite)(new Cite(this, this.visitor, true)).text(cite)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> code(String code) {
      ((Code)(new Code(this, this.visitor, true)).text(code)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> data(String data) {
      ((Data)(new Data(this, this.visitor, true)).text(data)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> datalist(String datalist) {
      ((Datalist)(new Datalist(this, this.visitor, true)).text(datalist)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> del(String del) {
      ((Del)(new Del(this, this.visitor, true)).text(del)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> dfn(String dfn) {
      ((Dfn)(new Dfn(this, this.visitor, true)).text(dfn)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> em(String em) {
      ((Em)(new Em(this, this.visitor, true)).text(em)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> i(String i) {
      ((I)(new I(this, this.visitor, true)).text(i)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> input(String input) {
      ((Input)(new Input(this, this.visitor, true)).text(input)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> ins(String ins) {
      ((Ins)(new Ins(this, this.visitor, true)).text(ins)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> kbd(String kbd) {
      ((Kbd)(new Kbd(this, this.visitor, true)).text(kbd)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> label(String label) {
      ((Label)(new Label(this, this.visitor, true)).text(label)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> link(String link) {
      ((Link)(new Link(this, this.visitor, true)).text(link)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> map(String map) {
      ((Map)(new Map(this, this.visitor, true)).text(map)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> mark(String mark) {
      ((Mark)(new Mark(this, this.visitor, true)).text(mark)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> meter(String meter) {
      ((Meter)(new Meter(this, this.visitor, true)).text(meter)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> noscript(String noscript) {
      ((Noscript)(new Noscript(this, this.visitor, true)).text(noscript)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> output(String output) {
      ((Output)(new Output(this, this.visitor, true)).text(output)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> progress(String progress) {
      ((Progress)(new Progress(this, this.visitor, true)).text(progress)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> q(String q) {
      ((Q)(new Q(this, this.visitor, true)).text(q)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> ruby(String ruby) {
      ((Ruby)(new Ruby(this, this.visitor, true)).text(ruby)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> s(String s) {
      ((S)(new S(this, this.visitor, true)).text(s)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> samp(String samp) {
      ((Samp)(new Samp(this, this.visitor, true)).text(samp)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> script(String script) {
      ((Script)(new Script(this, this.visitor, true)).text(script)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> select(String select) {
      ((Select)(new Select(this, this.visitor, true)).text(select)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> small(String small) {
      ((Small)(new Small(this, this.visitor, true)).text(small)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> span(String span) {
      ((Span)(new Span(this, this.visitor, true)).text(span)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> strong(String strong) {
      ((Strong)(new Strong(this, this.visitor, true)).text(strong)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> sub(String sub) {
      ((Sub)(new Sub(this, this.visitor, true)).text(sub)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> sup(String sup) {
      ((Sup)(new Sup(this, this.visitor, true)).text(sup)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> template(String template) {
      ((Template)(new Template(this, this.visitor, true)).text(template)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> textarea(String textarea) {
      ((Textarea)(new Textarea(this, this.visitor, true)).text(textarea)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> time(String time) {
      ((Time)(new Time(this, this.visitor, true)).text(time)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> u(String u) {
      ((U)(new U(this, this.visitor, true)).text(u)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> var(String var) {
      ((Var)(new Var(this, this.visitor, true)).text(var)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> wbr(String wbr) {
      ((Wbr)(new Wbr(this, this.visitor, true)).text(wbr)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> audio(String audio) {
      ((Audio)(new Audio(this, this.visitor, true)).text(audio)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> canvas(String canvas) {
      ((Canvas)(new Canvas(this, this.visitor, true)).text(canvas)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> embed(String embed) {
      ((Embed)(new Embed(this, this.visitor, true)).text(embed)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> iframe(String iframe) {
      ((Iframe)(new Iframe(this, this.visitor, true)).text(iframe)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> img(String img) {
      ((Img)(new Img(this, this.visitor, true)).text(img)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> math(String math) {
      ((Math)(new Math(this, this.visitor, true)).text(math)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> object(String object) {
      ((Object)(new Object(this, this.visitor, true)).text(object)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> picture(String picture) {
      ((Picture)(new Picture(this, this.visitor, true)).text(picture)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> svg(String svg) {
      ((Svg)(new Svg(this, this.visitor, true)).text(svg)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }

   public DetailsComplete<Z> video(String video) {
      ((Video)(new Video(this, this.visitor, true)).text(video)).__();
      return new DetailsComplete(this.parent, this.visitor, true);
   }
}
