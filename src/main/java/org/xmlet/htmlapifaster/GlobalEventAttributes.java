package org.xmlet.htmlapifaster;

public interface GlobalEventAttributes<T extends Element<T, Z>, Z extends Element> extends CustomAttributeGroup<T, Z> {
   default T attrOnabort(String attrOnabort) {
      this.getVisitor().visitAttributeOnabort(attrOnabort);
      return this.self();
   }

   default T attrOnauxclick(String attrOnauxclick) {
      this.getVisitor().visitAttributeOnauxclick(attrOnauxclick);
      return this.self();
   }

   default T attrOnblur(String attrOnblur) {
      this.getVisitor().visitAttributeOnblur(attrOnblur);
      return this.self();
   }

   default T attrOncancel(String attrOncancel) {
      this.getVisitor().visitAttributeOncancel(attrOncancel);
      return this.self();
   }

   default T attrOncanplay(String attrOncanplay) {
      this.getVisitor().visitAttributeOncanplay(attrOncanplay);
      return this.self();
   }

   default T attrOncanplaythrough(String attrOncanplaythrough) {
      this.getVisitor().visitAttributeOncanplaythrough(attrOncanplaythrough);
      return this.self();
   }

   default T attrOnchange(String attrOnchange) {
      this.getVisitor().visitAttributeOnchange(attrOnchange);
      return this.self();
   }

   default T attrOnclick(String attrOnclick) {
      this.getVisitor().visitAttributeOnclick(attrOnclick);
      return this.self();
   }

   default T attrOnclose(String attrOnclose) {
      this.getVisitor().visitAttributeOnclose(attrOnclose);
      return this.self();
   }

   default T attrOncuechange(String attrOncuechange) {
      this.getVisitor().visitAttributeOncuechange(attrOncuechange);
      return this.self();
   }

   default T attrOndblclick(String attrOndblclick) {
      this.getVisitor().visitAttributeOndblclick(attrOndblclick);
      return this.self();
   }

   default T attrOndrag(String attrOndrag) {
      this.getVisitor().visitAttributeOndrag(attrOndrag);
      return this.self();
   }

   default T attrOndragend(String attrOndragend) {
      this.getVisitor().visitAttributeOndragend(attrOndragend);
      return this.self();
   }

   default T attrOndragenter(String attrOndragenter) {
      this.getVisitor().visitAttributeOndragenter(attrOndragenter);
      return this.self();
   }

   default T attrOndragexit(String attrOndragexit) {
      this.getVisitor().visitAttributeOndragexit(attrOndragexit);
      return this.self();
   }

   default T attrOndragleave(String attrOndragleave) {
      this.getVisitor().visitAttributeOndragleave(attrOndragleave);
      return this.self();
   }

   default T attrOndragover(String attrOndragover) {
      this.getVisitor().visitAttributeOndragover(attrOndragover);
      return this.self();
   }

   default T attrOndragstart(String attrOndragstart) {
      this.getVisitor().visitAttributeOndragstart(attrOndragstart);
      return this.self();
   }

   default T attrOndrop(String attrOndrop) {
      this.getVisitor().visitAttributeOndrop(attrOndrop);
      return this.self();
   }

   default T attrOndurationchange(String attrOndurationchange) {
      this.getVisitor().visitAttributeOndurationchange(attrOndurationchange);
      return this.self();
   }

   default T attrOnemptied(String attrOnemptied) {
      this.getVisitor().visitAttributeOnemptied(attrOnemptied);
      return this.self();
   }

   default T attrOnended(String attrOnended) {
      this.getVisitor().visitAttributeOnended(attrOnended);
      return this.self();
   }

   default T attrOnerror(String attrOnerror) {
      this.getVisitor().visitAttributeOnerror(attrOnerror);
      return this.self();
   }

   default T attrOnfocus(String attrOnfocus) {
      this.getVisitor().visitAttributeOnfocus(attrOnfocus);
      return this.self();
   }

   default T attrOninput(String attrOninput) {
      this.getVisitor().visitAttributeOninput(attrOninput);
      return this.self();
   }

   default T attrOninvalid(String attrOninvalid) {
      this.getVisitor().visitAttributeOninvalid(attrOninvalid);
      return this.self();
   }

   default T attrOnkeydown(String attrOnkeydown) {
      this.getVisitor().visitAttributeOnkeydown(attrOnkeydown);
      return this.self();
   }

   default T attrOnkeypress(String attrOnkeypress) {
      this.getVisitor().visitAttributeOnkeypress(attrOnkeypress);
      return this.self();
   }

   default T attrOnkeyup(String attrOnkeyup) {
      this.getVisitor().visitAttributeOnkeyup(attrOnkeyup);
      return this.self();
   }

   default T attrOnload(String attrOnload) {
      this.getVisitor().visitAttributeOnload(attrOnload);
      return this.self();
   }

   default T attrOnloadeddata(String attrOnloadeddata) {
      this.getVisitor().visitAttributeOnloadeddata(attrOnloadeddata);
      return this.self();
   }

   default T attrOnloadedmetadata(String attrOnloadedmetadata) {
      this.getVisitor().visitAttributeOnloadedmetadata(attrOnloadedmetadata);
      return this.self();
   }

   default T attrOnloadend(String attrOnloadend) {
      this.getVisitor().visitAttributeOnloadend(attrOnloadend);
      return this.self();
   }

   default T attrOnloadstart(String attrOnloadstart) {
      this.getVisitor().visitAttributeOnloadstart(attrOnloadstart);
      return this.self();
   }

   default T attrOnmousedown(String attrOnmousedown) {
      this.getVisitor().visitAttributeOnmousedown(attrOnmousedown);
      return this.self();
   }

   default T attrOnmouseenter(String attrOnmouseenter) {
      this.getVisitor().visitAttributeOnmouseenter(attrOnmouseenter);
      return this.self();
   }

   default T attrOnmouseleave(String attrOnmouseleave) {
      this.getVisitor().visitAttributeOnmouseleave(attrOnmouseleave);
      return this.self();
   }

   default T attrOnmousemove(String attrOnmousemove) {
      this.getVisitor().visitAttributeOnmousemove(attrOnmousemove);
      return this.self();
   }

   default T attrOnmouseout(String attrOnmouseout) {
      this.getVisitor().visitAttributeOnmouseout(attrOnmouseout);
      return this.self();
   }

   default T attrOnmouseover(String attrOnmouseover) {
      this.getVisitor().visitAttributeOnmouseover(attrOnmouseover);
      return this.self();
   }

   default T attrOnmouseup(String attrOnmouseup) {
      this.getVisitor().visitAttributeOnmouseup(attrOnmouseup);
      return this.self();
   }

   default T attrOnwheel(String attrOnwheel) {
      this.getVisitor().visitAttributeOnwheel(attrOnwheel);
      return this.self();
   }

   default T attrOnpause(String attrOnpause) {
      this.getVisitor().visitAttributeOnpause(attrOnpause);
      return this.self();
   }

   default T attrOnplay(String attrOnplay) {
      this.getVisitor().visitAttributeOnplay(attrOnplay);
      return this.self();
   }

   default T attrOnplaying(String attrOnplaying) {
      this.getVisitor().visitAttributeOnplaying(attrOnplaying);
      return this.self();
   }

   default T attrOnprogress(String attrOnprogress) {
      this.getVisitor().visitAttributeOnprogress(attrOnprogress);
      return this.self();
   }

   default T attrOnratechange(String attrOnratechange) {
      this.getVisitor().visitAttributeOnratechange(attrOnratechange);
      return this.self();
   }

   default T attrOnreset(String attrOnreset) {
      this.getVisitor().visitAttributeOnreset(attrOnreset);
      return this.self();
   }

   default T attrOnresize(String attrOnresize) {
      this.getVisitor().visitAttributeOnresize(attrOnresize);
      return this.self();
   }

   default T attrOnscroll(String attrOnscroll) {
      this.getVisitor().visitAttributeOnscroll(attrOnscroll);
      return this.self();
   }

   default T attrOnseeked(String attrOnseeked) {
      this.getVisitor().visitAttributeOnseeked(attrOnseeked);
      return this.self();
   }

   default T attrOnseeking(String attrOnseeking) {
      this.getVisitor().visitAttributeOnseeking(attrOnseeking);
      return this.self();
   }

   default T attrOnselect(String attrOnselect) {
      this.getVisitor().visitAttributeOnselect(attrOnselect);
      return this.self();
   }

   default T attrOnshow(String attrOnshow) {
      this.getVisitor().visitAttributeOnshow(attrOnshow);
      return this.self();
   }

   default T attrOnstalled(String attrOnstalled) {
      this.getVisitor().visitAttributeOnstalled(attrOnstalled);
      return this.self();
   }

   default T attrOnsubmit(String attrOnsubmit) {
      this.getVisitor().visitAttributeOnsubmit(attrOnsubmit);
      return this.self();
   }

   default T attrOnsuspend(String attrOnsuspend) {
      this.getVisitor().visitAttributeOnsuspend(attrOnsuspend);
      return this.self();
   }

   default T attrOntimeupdate(String attrOntimeupdate) {
      this.getVisitor().visitAttributeOntimeupdate(attrOntimeupdate);
      return this.self();
   }

   default T attrOntoogle(String attrOntoogle) {
      this.getVisitor().visitAttributeOntoogle(attrOntoogle);
      return this.self();
   }

   default T attrOnvolumenchange(String attrOnvolumenchange) {
      this.getVisitor().visitAttributeOnvolumenchange(attrOnvolumenchange);
      return this.self();
   }

   default T attrOnwaiting(String attrOnwaiting) {
      this.getVisitor().visitAttributeOnwaiting(attrOnwaiting);
      return this.self();
   }
}
