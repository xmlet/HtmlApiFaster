package org.xmlet.htmlapifaster.async;

import org.xmlet.htmlapifaster.Element;

@FunctionalInterface
public interface Continuation<T extends Element, R extends Element> {
    
    R onContinue(T elem);
}
