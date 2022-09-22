package org.xmlet.htmlapifaster.async;

import org.xmlet.htmlapifaster.Element;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Interface that represents an asynchronous action occurring on a Html element referenced by the {@link Element} interface.
 * @param <E> the current {@link Element} being processed
 */
public interface Thenable<E extends Element> extends AsyncElement<E> {
    
    /**
     * Synchronous action to execute on a given {@link Element} after a certain {@link #async(org.reactivestreams.Publisher, BiConsumer)} has occurred.
     * @param cont Function that represent the action to be executed
     * @param <R> The type of the next {@link Element}
     * @return The {@link Thenable} containing the new {@link Element} reference after execution the {@code cont} function.
     */
    <R extends Element> Thenable<R> then(Function<E,R> cont);
}
