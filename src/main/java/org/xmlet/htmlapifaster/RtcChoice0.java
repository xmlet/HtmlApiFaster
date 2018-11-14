package org.xmlet.htmlapifaster;

public interface RtcChoice0<T extends Element<T, Z>, Z extends Element> extends PhrasingContentChoice<T, Z> {
   default Rt<T> rt() {
      return new Rt(this.self());
   }

   default Rp<T> rp() {
      return new Rp(this.self());
   }
}
