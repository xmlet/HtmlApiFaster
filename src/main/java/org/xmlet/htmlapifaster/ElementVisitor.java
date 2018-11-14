package org.xmlet.htmlapifaster;

public abstract class ElementVisitor {
   public abstract void visitElement(Element var1);

   public abstract void visitAttribute(String var1, String var2);

   public abstract void visitParent(Element var1);

   public abstract <R> void visitText(Text<? extends Element, R> var1);

   public abstract <R> void visitComment(Text<? extends Element, R> var1);

   public void visitOpenDynamic() {
   }

   public void visitCloseDynamic() {
   }

   public <Z extends Element> void visitParentMeta(Meta<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNav(Nav<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAddress(Address<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMeter(Meter<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentVar(Var<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMath(Math<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDfn(Dfn<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTfoot(Tfoot<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentButton(Button<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentPicture(Picture<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSub(Sub<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentHead(Head<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSmall(Small<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRoot(Root<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentHr(Hr<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCode(Code<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFigcaption(Figcaption<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSup(Sup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDetails(Details<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFieldset(Fieldset<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentHeader(Header<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentObject(Object<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTbody(Tbody<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMap(Map<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentLink(Link<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRtc(Rtc<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentA(A<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentB(B<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentLegend(Legend<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDetailsSummary(DetailsSummary<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSvg(Svg<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentEmbed(Embed<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBdi(Bdi<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentArticle(Article<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentI(I<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBdo(Bdo<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSpan(Span<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAbbr(Abbr<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentP(P<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBlockquote(Blockquote<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRb(Rb<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentQ(Q<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentS(S<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTextarea(Textarea<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentU(U<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCite(Cite<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentOutput(Output<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentStyle(Style<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRp(Rp<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCol(Col<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentProgress(Progress<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRt(Rt<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTable(Table<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDetailsComplete(DetailsComplete<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSection(Section<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFigure(Figure<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBr(Br<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDiv(Div<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFooter(Footer<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSelect(Select<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAudio(Audio<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentPre(Pre<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentLabel(Label<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentStrong(Strong<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTemplate(Template<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTd(Td<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentInput(Input<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTh(Th<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDialog(Dialog<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentLi(Li<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTr(Tr<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDd(Dd<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIframe(Iframe<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentScript(Script<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentImg(Img<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCanvas(Canvas<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDl(Dl<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDt(Dt<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentArea(Area<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSamp(Samp<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentVideo(Video<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentUl(Ul<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNoscript(Noscript<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentOption(Option<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentForm(Form<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentOptgroup(Optgroup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentEm(Em<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMark(Mark<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTime(Time<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentKbd(Kbd<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSource(Source<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIns(Ins<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAside(Aside<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBody(Body<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRuby(Ruby<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDatalist(Datalist<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentThead(Thead<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentWbr(Wbr<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentHtml(Html<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTitle(Title<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentH1(H1<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentH2(H2<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentDel(Del<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentData(Data<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentH3(H3<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentH4(H4<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentH5(H5<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBase(Base<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentH6(H6<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCaption(Caption<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentColgroup(Colgroup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentParam(Param<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSummary(Summary<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentOl(Ol<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMain(Main<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTrack(Track<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitElementMeta(Meta<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNav(Nav<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAddress(Address<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMeter(Meter<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementVar(Var<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMath(Math<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDfn(Dfn<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTfoot(Tfoot<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementButton(Button<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementPicture(Picture<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSub(Sub<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementHead(Head<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSmall(Small<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRoot(Root<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementHr(Hr<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCode(Code<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFigcaption(Figcaption<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSup(Sup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDetails(Details<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFieldset(Fieldset<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementHeader(Header<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementObject(Object<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTbody(Tbody<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMap(Map<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementLink(Link<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRtc(Rtc<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementA(A<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementB(B<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementLegend(Legend<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDetailsSummary(DetailsSummary<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSvg(Svg<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementEmbed(Embed<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBdi(Bdi<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementArticle(Article<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementI(I<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBdo(Bdo<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSpan(Span<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAbbr(Abbr<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementP(P<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBlockquote(Blockquote<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRb(Rb<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementQ(Q<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementS(S<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTextarea(Textarea<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementU(U<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCite(Cite<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementOutput(Output<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementStyle(Style<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRp(Rp<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCol(Col<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementProgress(Progress<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRt(Rt<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTable(Table<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDetailsComplete(DetailsComplete<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSection(Section<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFigure(Figure<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBr(Br<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDiv(Div<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFooter(Footer<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSelect(Select<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAudio(Audio<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementPre(Pre<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementLabel(Label<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementStrong(Strong<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTemplate(Template<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTd(Td<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementInput(Input<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTh(Th<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDialog(Dialog<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementLi(Li<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTr(Tr<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDd(Dd<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIframe(Iframe<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementScript(Script<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementImg(Img<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCanvas(Canvas<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDl(Dl<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDt(Dt<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementArea(Area<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSamp(Samp<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementVideo(Video<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementUl(Ul<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNoscript(Noscript<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementOption(Option<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementForm(Form<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementOptgroup(Optgroup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementEm(Em<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMark(Mark<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTime(Time<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementKbd(Kbd<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSource(Source<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIns(Ins<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAside(Aside<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBody(Body<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRuby(Ruby<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDatalist(Datalist<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementThead(Thead<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementWbr(Wbr<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementHtml(Html<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTitle(Title<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementH1(H1<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementH2(H2<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementDel(Del<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementData(Data<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementH3(H3<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementH4(H4<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementH5(H5<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBase(Base<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementH6(H6<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCaption(Caption<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementColgroup(Colgroup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementParam(Param<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSummary(Summary<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementOl(Ol<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMain(Main<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTrack(Track<Z> var1) {
      this.visitElement(var1);
   }

   public void visitAttributeOndragend(String ondragend) {
      this.visitAttribute("ondragend", ondragend);
   }

   public void visitAttributeSrcDoc(String srcDoc) {
      this.visitAttribute("srcDoc", srcDoc);
   }

   public void visitAttributeOninvalid(String oninvalid) {
      this.visitAttribute("oninvalid", oninvalid);
   }

   public void visitAttributeIsmap(String ismap) {
      this.visitAttribute("ismap", ismap);
   }

   public void visitAttributeOnmessage(String onmessage) {
      this.visitAttribute("onmessage", onmessage);
   }

   public void visitAttributeSizes(String sizes) {
      this.visitAttribute("sizes", sizes);
   }

   public void visitAttributeReadonly(String readonly) {
      this.visitAttribute("readonly", readonly);
   }

   public void visitAttributeOnselect(String onselect) {
      this.visitAttribute("onselect", onselect);
   }

   public void visitAttributeOnscroll(String onscroll) {
      this.visitAttribute("onscroll", onscroll);
   }

   public void visitAttributeAbbr(String abbr) {
      this.visitAttribute("abbr", abbr);
   }

   public void visitAttributeHeight(String height) {
      this.visitAttribute("height", height);
   }

   public void visitAttributeAllowfullscreen(String allowfullscreen) {
      this.visitAttribute("allowfullscreen", allowfullscreen);
   }

   public void visitAttributeMaxlength(String maxlength) {
      this.visitAttribute("maxlength", maxlength);
   }

   public void visitAttributeOnclick(String onclick) {
      this.visitAttribute("onclick", onclick);
   }

   public void visitAttributeOnchange(String onchange) {
      this.visitAttribute("onchange", onchange);
   }

   public void visitAttributeOndragexit(String ondragexit) {
      this.visitAttribute("ondragexit", ondragexit);
   }

   public void visitAttributeAccept(String accept) {
      this.visitAttribute("accept", accept);
   }

   public void visitAttributeOnkeypress(String onkeypress) {
      this.visitAttribute("onkeypress", onkeypress);
   }

   public void visitAttributeOndblclick(String ondblclick) {
      this.visitAttribute("ondblclick", ondblclick);
   }

   public void visitAttributeSize(String size) {
      this.visitAttribute("size", size);
   }

   public void visitAttributeOndrag(String ondrag) {
      this.visitAttribute("ondrag", ondrag);
   }

   public void visitAttributeOnseeked(String onseeked) {
      this.visitAttribute("onseeked", onseeked);
   }

   public void visitAttributePoster(String poster) {
      this.visitAttribute("poster", poster);
   }

   public void visitAttributeOnplay(String onplay) {
      this.visitAttribute("onplay", onplay);
   }

   public void visitAttributeAltimgWidth(String altimgWidth) {
      this.visitAttribute("altimg-width", altimgWidth);
   }

   public void visitAttributeSrclang(String srclang) {
      this.visitAttribute("srclang", srclang);
   }

   public void visitAttributeOnmouseover(String onmouseover) {
      this.visitAttribute("onmouseover", onmouseover);
   }

   public void visitAttributeColspan(String colspan) {
      this.visitAttribute("colspan", colspan);
   }

   public void visitAttributeDefault(String var1) {
      this.visitAttribute("default", var1);
   }

   public void visitAttributeMin(String min) {
      this.visitAttribute("min", min);
   }

   public void visitAttributeDraggable(String draggable) {
      this.visitAttribute("draggable", draggable);
   }

   public void visitAttributeOnclose(String onclose) {
      this.visitAttribute("onclose", onclose);
   }

   public void visitAttributeOnafterprint(String onafterprint) {
      this.visitAttribute("onafterprint", onafterprint);
   }

   public void visitAttributeDisabled(String disabled) {
      this.visitAttribute("disabled", disabled);
   }

   public void visitAttributeUsemap(String usemap) {
      this.visitAttribute("usemap", usemap);
   }

   public void visitAttributeOnseeking(String onseeking) {
      this.visitAttribute("onseeking", onseeking);
   }

   public void visitAttributeReferrerpolicy(String referrerpolicy) {
      this.visitAttribute("referrerpolicy", referrerpolicy);
   }

   public void visitAttributeOncuechange(String oncuechange) {
      this.visitAttribute("oncuechange", oncuechange);
   }

   public void visitAttributeOnpageshow(String onpageshow) {
      this.visitAttribute("onpageshow", onpageshow);
   }

   public void visitAttributeOptimum(String optimum) {
      this.visitAttribute("optimum", optimum);
   }

   public void visitAttributeOnplaying(String onplaying) {
      this.visitAttribute("onplaying", onplaying);
   }

   public void visitAttributeOnunhandledrejection(String onunhandledrejection) {
      this.visitAttribute("onunhandledrejection", onunhandledrejection);
   }

   public void visitAttributeAcceptCharset(String acceptCharset) {
      this.visitAttribute("accept-charset", acceptCharset);
   }

   public void visitAttributeAlttext(String alttext) {
      this.visitAttribute("alttext", alttext);
   }

   public void visitAttributeX(String x) {
      this.visitAttribute("x", x);
   }

   public void visitAttributeY(String y) {
      this.visitAttribute("y", y);
   }

   public void visitAttributeOnmousedown(String onmousedown) {
      this.visitAttribute("onmousedown", onmousedown);
   }

   public void visitAttributeOnlanguagechange(String onlanguagechange) {
      this.visitAttribute("onlanguagechange", onlanguagechange);
   }

   public void visitAttributeWrap(String wrap) {
      this.visitAttribute("wrap", wrap);
   }

   public void visitAttributeOpen(String open) {
      this.visitAttribute("open", open);
   }

   public void visitAttributeOnemptied(String onemptied) {
      this.visitAttribute("onemptied", onemptied);
   }

   public void visitAttributeControls(String controls) {
      this.visitAttribute("controls", controls);
   }

   public void visitAttributeTabIndex(String tabIndex) {
      this.visitAttribute("tabIndex", tabIndex);
   }

   public void visitAttributeDir(String dir) {
      this.visitAttribute("dir", dir);
   }

   public void visitAttributeOnresize(String onresize) {
      this.visitAttribute("onresize", onresize);
   }

   public void visitAttributeTypemustmatch(String typemustmatch) {
      this.visitAttribute("typemustmatch", typemustmatch);
   }

   public void visitAttributeLoop(String loop) {
      this.visitAttribute("loop", loop);
   }

   public void visitAttributeRowspan(String rowspan) {
      this.visitAttribute("rowspan", rowspan);
   }

   public void visitAttributeOnpause(String onpause) {
      this.visitAttribute("onpause", onpause);
   }

   public void visitAttributeRel(String rel) {
      this.visitAttribute("rel", rel);
   }

   public void visitAttributeOnloadstart(String onloadstart) {
      this.visitAttribute("onloadstart", onloadstart);
   }

   public void visitAttributeOnprogress(String onprogress) {
      this.visitAttribute("onprogress", onprogress);
   }

   public void visitAttributeOnwheel(String onwheel) {
      this.visitAttribute("onwheel", onwheel);
   }

   public void visitAttributeRev(String rev) {
      this.visitAttribute("rev", rev);
   }

   public void visitAttributeList(String list) {
      this.visitAttribute("list", list);
   }

   public void visitAttributeAutoplay(String autoplay) {
      this.visitAttribute("autoplay", autoplay);
   }

   public void visitAttributeName(String name) {
      this.visitAttribute("name", name);
   }

   public void visitAttributeOnloadedmetadata(String onloadedmetadata) {
      this.visitAttribute("onloadedmetadata", onloadedmetadata);
   }

   public void visitAttributeDefer(String defer) {
      this.visitAttribute("defer", defer);
   }

   public void visitAttributeMinlength(String minlength) {
      this.visitAttribute("minlength", minlength);
   }

   public void visitAttributeHttpEquiv(String httpEquiv) {
      this.visitAttribute("http-equiv", httpEquiv);
   }

   public void visitAttributeHidden(String hidden) {
      this.visitAttribute("hidden", hidden);
   }

   public void visitAttributeOnerror(String onerror) {
      this.visitAttribute("onerror", onerror);
   }

   public void visitAttributeFor(String var1) {
      this.visitAttribute("for", var1);
   }

   public void visitAttributeTitle(String title) {
      this.visitAttribute("title", title);
   }

   public void visitAttributeContent(String content) {
      this.visitAttribute("content", content);
   }

   public void visitAttributeOninput(String oninput) {
      this.visitAttribute("oninput", oninput);
   }

   public void visitAttributeAltimg(String altimg) {
      this.visitAttribute("altimg", altimg);
   }

   public void visitAttributeOnstalled(String onstalled) {
      this.visitAttribute("onstalled", onstalled);
   }

   public void visitAttributeScope(String scope) {
      this.visitAttribute("scope", scope);
   }

   public void visitAttributePlaceholder(String placeholder) {
      this.visitAttribute("placeholder", placeholder);
   }

   public void visitAttributeOnsubmit(String onsubmit) {
      this.visitAttribute("onsubmit", onsubmit);
   }

   public void visitAttributeCols(String cols) {
      this.visitAttribute("cols", cols);
   }

   public void visitAttributeClass(String var1) {
      this.visitAttribute("class", var1);
   }

   public void visitAttributeOnmouseenter(String onmouseenter) {
      this.visitAttribute("onmouseenter", onmouseenter);
   }

   public void visitAttributeHeaders(String headers) {
      this.visitAttribute("headers", headers);
   }

   public void visitAttributeStart(String start) {
      this.visitAttribute("start", start);
   }

   public void visitAttributeMultiple(String multiple) {
      this.visitAttribute("multiple", multiple);
   }

   public void visitAttributeOnunload(String onunload) {
      this.visitAttribute("onunload", onunload);
   }

   public void visitAttributeOndrop(String ondrop) {
      this.visitAttribute("ondrop", ondrop);
   }

   public void visitAttributeLabel(String label) {
      this.visitAttribute("label", label);
   }

   public void visitAttributeTarget(String target) {
      this.visitAttribute("target", target);
   }

   public void visitAttributeOnload(String onload) {
      this.visitAttribute("onload", onload);
   }

   public void visitAttributeOnshow(String onshow) {
      this.visitAttribute("onshow", onshow);
   }

   public void visitAttributeForm(String form) {
      this.visitAttribute("form", form);
   }

   public void visitAttributeStep(String step) {
      this.visitAttribute("step", step);
   }

   public void visitAttributeOnpopstate(String onpopstate) {
      this.visitAttribute("onpopstate", onpopstate);
   }

   public void visitAttributeOnfocus(String onfocus) {
      this.visitAttribute("onfocus", onfocus);
   }

   public void visitAttributeOnloadend(String onloadend) {
      this.visitAttribute("onloadend", onloadend);
   }

   public void visitAttributeType(String type) {
      this.visitAttribute("type", type);
   }

   public void visitAttributePreload(String preload) {
      this.visitAttribute("preload", preload);
   }

   public void visitAttributeDirname(String dirname) {
      this.visitAttribute("dirname", dirname);
   }

   public void visitAttributeOnratechange(String onratechange) {
      this.visitAttribute("onratechange", onratechange);
   }

   public void visitAttributeRequired(String required) {
      this.visitAttribute("required", required);
   }

   public void visitAttributeOncanplaythrough(String oncanplaythrough) {
      this.visitAttribute("oncanplaythrough", oncanplaythrough);
   }

   public void visitAttributeOncancel(String oncancel) {
      this.visitAttribute("oncancel", oncancel);
   }

   public void visitAttributeOnauxclick(String onauxclick) {
      this.visitAttribute("onauxclick", onauxclick);
   }

   public void visitAttributeAction(String action) {
      this.visitAttribute("action", action);
   }

   public void visitAttributeHref(String href) {
      this.visitAttribute("href", href);
   }

   public void visitAttributeId(String id) {
      this.visitAttribute("id", id);
   }

   public void visitAttributeOnkeydown(String onkeydown) {
      this.visitAttribute("onkeydown", onkeydown);
   }

   public void visitAttributeEnctype(String enctype) {
      this.visitAttribute("enctype", enctype);
   }

   public void visitAttributeCrossorigin(String crossorigin) {
      this.visitAttribute("crossorigin", crossorigin);
   }

   public void visitAttributeMethod(String method) {
      this.visitAttribute("method", method);
   }

   public void visitAttributeShape(String shape) {
      this.visitAttribute("shape", shape);
   }

   public void visitAttributeOnkeyup(String onkeyup) {
      this.visitAttribute("onkeyup", onkeyup);
   }

   public void visitAttributeOnreset(String onreset) {
      this.visitAttribute("onreset", onreset);
   }

   public void visitAttributeCdgroup(String cdgroup) {
      this.visitAttribute("cdgroup", cdgroup);
   }

   public void visitAttributeSpellcheck(String spellcheck) {
      this.visitAttribute("spellcheck", spellcheck);
   }

   public void visitAttributeOnbeforeunload(String onbeforeunload) {
      this.visitAttribute("onbeforeunload", onbeforeunload);
   }

   public void visitAttributeOntoogle(String ontoogle) {
      this.visitAttribute("ontoogle", ontoogle);
   }

   public void visitAttributeStyle(String style) {
      this.visitAttribute("style", style);
   }

   public void visitAttributeOnoffline(String onoffline) {
      this.visitAttribute("onoffline", onoffline);
   }

   public void visitAttributeDirName(String dirName) {
      this.visitAttribute("dirName", dirName);
   }

   public void visitAttributeCharset(String charset) {
      this.visitAttribute("charset", charset);
   }

   public void visitAttributeOnmousemove(String onmousemove) {
      this.visitAttribute("onmousemove", onmousemove);
   }

   public void visitAttributeMaxwidth(String maxwidth) {
      this.visitAttribute("maxwidth", maxwidth);
   }

   public void visitAttributeColumnheader(String columnheader) {
      this.visitAttribute("columnheader", columnheader);
   }

   public void visitAttributePattern(String pattern) {
      this.visitAttribute("pattern", pattern);
   }

   public void visitAttributeAltimgHeigth(String altimgHeigth) {
      this.visitAttribute("altimg-heigth", altimgHeigth);
   }

   public void visitAttributeSrcset(String srcset) {
      this.visitAttribute("srcset", srcset);
   }

   public void visitAttributeCell(String cell) {
      this.visitAttribute("cell", cell);
   }

   public void visitAttributeNovalidate(String novalidate) {
      this.visitAttribute("novalidate", novalidate);
   }

   public void visitAttributeFormenctype(String formenctype) {
      this.visitAttribute("formenctype", formenctype);
   }

   public void visitAttributeLow(String low) {
      this.visitAttribute("low", low);
   }

   public void visitAttributeOndragenter(String ondragenter) {
      this.visitAttribute("ondragenter", ondragenter);
   }

   public void visitAttributeOnmouseleave(String onmouseleave) {
      this.visitAttribute("onmouseleave", onmouseleave);
   }

   public void visitAttributeMuted(String muted) {
      this.visitAttribute("muted", muted);
   }

   public void visitAttributeCoords(String coords) {
      this.visitAttribute("coords", coords);
   }

   public void visitAttributeOnblur(String onblur) {
      this.visitAttribute("onblur", onblur);
   }

   public void visitAttributeOnvolumenchange(String onvolumenchange) {
      this.visitAttribute("onvolumenchange", onvolumenchange);
   }

   public void visitAttributeMax(String max) {
      this.visitAttribute("max", max);
   }

   public void visitAttributeDisplay(String display) {
      this.visitAttribute("display", display);
   }

   public void visitAttributeSrcSet(String srcSet) {
      this.visitAttribute("srcSet", srcSet);
   }

   public void visitAttributeOndurationchange(String ondurationchange) {
      this.visitAttribute("ondurationchange", ondurationchange);
   }

   public void visitAttributeLongdesc(String longdesc) {
      this.visitAttribute("longdesc", longdesc);
   }

   public void visitAttributeOnended(String onended) {
      this.visitAttribute("onended", onended);
   }

   public void visitAttributeOnloadeddata(String onloadeddata) {
      this.visitAttribute("onloadeddata", onloadeddata);
   }

   public void visitAttributeOnmouseout(String onmouseout) {
      this.visitAttribute("onmouseout", onmouseout);
   }

   public void visitAttributeOnsuspend(String onsuspend) {
      this.visitAttribute("onsuspend", onsuspend);
   }

   public void visitAttributeWidth(String width) {
      this.visitAttribute("width", width);
   }

   public void visitAttributeOnwaiting(String onwaiting) {
      this.visitAttribute("onwaiting", onwaiting);
   }

   public void visitAttributeCite(String cite) {
      this.visitAttribute("cite", cite);
   }

   public void visitAttributeOncanplay(String oncanplay) {
      this.visitAttribute("oncanplay", oncanplay);
   }

   public void visitAttributeSpan(String span) {
      this.visitAttribute("span", span);
   }

   public void visitAttributeData(String data) {
      this.visitAttribute("data", data);
   }

   public void visitAttributeOnrejectionhandled(String onrejectionhandled) {
      this.visitAttribute("onrejectionhandled", onrejectionhandled);
   }

   public void visitAttributeTranslate(String translate) {
      this.visitAttribute("translate", translate);
   }

   public void visitAttributeFormaction(String formaction) {
      this.visitAttribute("formaction", formaction);
   }

   public void visitAttributeDownload(String download) {
      this.visitAttribute("download", download);
   }

   public void visitAttributeHigh(String high) {
      this.visitAttribute("high", high);
   }

   public void visitAttributeDatetime(String datetime) {
      this.visitAttribute("datetime", datetime);
   }

   public void visitAttributeOverflow(String overflow) {
      this.visitAttribute("overflow", overflow);
   }

   public void visitAttributeAccesskey(String accesskey) {
      this.visitAttribute("accesskey", accesskey);
   }

   public void visitAttributeChecked(String checked) {
      this.visitAttribute("checked", checked);
   }

   public void visitAttributeOnbeforeprint(String onbeforeprint) {
      this.visitAttribute("onbeforeprint", onbeforeprint);
   }

   public void visitAttributeSelected(String selected) {
      this.visitAttribute("selected", selected);
   }

   public void visitAttributeBorder(String border) {
      this.visitAttribute("border", border);
   }

   public void visitAttributeOnstorage(String onstorage) {
      this.visitAttribute("onstorage", onstorage);
   }

   public void visitAttributeKind(String kind) {
      this.visitAttribute("kind", kind);
   }

   public void visitAttributeFormmethod(String formmethod) {
      this.visitAttribute("formmethod", formmethod);
   }

   public void visitAttributeAlt(String alt) {
      this.visitAttribute("alt", alt);
   }

   public void visitAttributeNonce(String nonce) {
      this.visitAttribute("nonce", nonce);
   }

   public void visitAttributeOntimeupdate(String ontimeupdate) {
      this.visitAttribute("ontimeupdate", ontimeupdate);
   }

   public void visitAttributeRowheader(String rowheader) {
      this.visitAttribute("rowheader", rowheader);
   }

   public void visitAttributeHreflang(String hreflang) {
      this.visitAttribute("hreflang", hreflang);
   }

   public void visitAttributeOnpagehide(String onpagehide) {
      this.visitAttribute("onpagehide", onpagehide);
   }

   public void visitAttributeFormnovalidate(String formnovalidate) {
      this.visitAttribute("formnovalidate", formnovalidate);
   }

   public void visitAttributeOnabort(String onabort) {
      this.visitAttribute("onabort", onabort);
   }

   public void visitAttributeContenteditable(String contenteditable) {
      this.visitAttribute("contenteditable", contenteditable);
   }

   public void visitAttributeOnmouseup(String onmouseup) {
      this.visitAttribute("onmouseup", onmouseup);
   }

   public void visitAttributeOndragover(String ondragover) {
      this.visitAttribute("ondragover", ondragover);
   }

   public void visitAttributeOnhashchange(String onhashchange) {
      this.visitAttribute("onhashchange", onhashchange);
   }

   public void visitAttributeOnonline(String ononline) {
      this.visitAttribute("ononline", ononline);
   }

   public void visitAttributeMedia(String media) {
      this.visitAttribute("media", media);
   }

   public void visitAttributeRow(String row) {
      this.visitAttribute("row", row);
   }

   public void visitAttributeLang(String lang) {
      this.visitAttribute("lang", lang);
   }

   public void visitAttributeValue(String value) {
      this.visitAttribute("value", value);
   }

   public void visitAttributeAltimgValign(String altimgValign) {
      this.visitAttribute("altimg-valign", altimgValign);
   }

   public void visitAttributeOndragleave(String ondragleave) {
      this.visitAttribute("ondragleave", ondragleave);
   }

   public void visitAttributeAutoComplete(String autoComplete) {
      this.visitAttribute("autoComplete", autoComplete);
   }

   public void visitAttributeSrc(String src) {
      this.visitAttribute("src", src);
   }

   public void visitAttributeAutocomplete(String autocomplete) {
      this.visitAttribute("autocomplete", autocomplete);
   }

   public void visitAttributeManifest(String manifest) {
      this.visitAttribute("manifest", manifest);
   }

   public void visitAttributeSandbox(String sandbox) {
      this.visitAttribute("sandbox", sandbox);
   }

   public void visitAttributeAutofocus(String autofocus) {
      this.visitAttribute("autofocus", autofocus);
   }

   public void visitAttributeRows(String rows) {
      this.visitAttribute("rows", rows);
   }

   public void visitAttributeOndragstart(String ondragstart) {
      this.visitAttribute("ondragstart", ondragstart);
   }

   public void visitAttributeAllowpaymentrequest(String allowpaymentrequest) {
      this.visitAttribute("allowpaymentrequest", allowpaymentrequest);
   }

   public void visitAttributeRowgroup(String rowgroup) {
      this.visitAttribute("rowgroup", rowgroup);
   }

   public void visitAttributeFormtarget(String formtarget) {
      this.visitAttribute("formtarget", formtarget);
   }

   public void visitAttributeAsync(String async) {
      this.visitAttribute("async", async);
   }

   public void visitAttributeReversed(String reversed) {
      this.visitAttribute("reversed", reversed);
   }
}
