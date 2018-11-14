package org.xmlet.htmlapifaster;

public interface CustomAttributeGroup<T extends Element, Z extends Element> extends Element<T, Z> {
   default T addAttr(String name, String value) {
      this.getVisitor().visitAttribute(name, value);
      return this.self();
   }
}
