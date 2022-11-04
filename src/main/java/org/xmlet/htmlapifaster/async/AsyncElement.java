package org.xmlet.htmlapifaster.async;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.Element;

import java.util.function.BiConsumer;

public interface AsyncElement<E extends Element> {
    
    /**
     * Asynchronous action to execute given an {@link Publisher} and the current {@link Element}
     * @param obs the {@link Publisher} that is going to be used for the async action
     * @param asyncAction {@link BiConsumer} containing the current {@link Element} being processed and the {@link Publisher} passed as the parameter
     * @param <T> The type that the {@link Publisher} contains
     * @return A {@link Thenable} as a result of the current asynchronous action happening
     */
    <T> E async(Publisher<T> obs, BiConsumer<E, Publisher<T>> asyncAction);
    
}
