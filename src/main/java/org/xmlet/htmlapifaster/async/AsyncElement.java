package org.xmlet.htmlapifaster.async;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.Element;

import java.util.function.BiConsumer;

public interface AsyncElement<E extends Element> {
    
    /**
     * Asynchronous action to execute given an {@link Publisher} and the current {@link Element}
     */
    E await(BiConsumer<E, OnCompletion> asyncAction);
}
