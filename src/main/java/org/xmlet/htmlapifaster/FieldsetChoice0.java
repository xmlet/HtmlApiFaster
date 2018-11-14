package org.xmlet.htmlapifaster;

public interface FieldsetChoice0<T extends Element<T, Z>, Z extends Element> extends FlowContentChoice<T, Z> {
   default Legend<T> legend() {
      return new Legend(this.self());
   }
}
