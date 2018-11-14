package org.xmlet.htmlapifaster;

public interface Element<T extends Element, Z extends Element> {
   T self();

   ElementVisitor getVisitor();

   String getName();

   Z __();

   Z getParent();
}
