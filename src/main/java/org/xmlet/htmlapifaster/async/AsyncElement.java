package org.xmlet.htmlapifaster.async;

import org.xmlet.htmlapifaster.Element;

public interface AsyncElement<E extends Element> {
    
    /**
     * Asynchronous action to execute given the current {@link Element}
     */
    <M> E await(AwaitConsumer<E,M> asyncAction);
}
