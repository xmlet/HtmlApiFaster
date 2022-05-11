package org.xmlet.htmlapifaster.async;

import io.reactivex.rxjava3.core.Observable;
import org.xmlet.htmlapifaster.Element;

import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Interface that represents an asynchronous action occurring on a Html element referenced by the {@link Element} interface.
 * @param <E> the current {@link Element} being processed
 */
public interface Thenable<E extends Element> {
    
    /**
     * Asynchronous action to execute given an {@link Observable} and the current {@link Element}
     * @param obs the {@link Observable} that is going to be used for the async action
     * @param asyncAction {@link BiConsumer} containing the current {@link Element} being processed and the {@link Observable} passed as the parameter
     * @param <T> The type that the {@link Observable} contains
     * @param <O> A generic type that represents thh {@link Observable}
     * @return A {@link Thenable} as a result of the current asynchronous action happening
     */
    <T, O extends Observable<T>> Thenable<E> async(O obs, BiConsumer<E, O> asyncAction);
    
    /**
     * Synchronous action to execute on a given {@link Element} after a certain {@link #async(Observable, BiConsumer)} has occurred.
     * @param cont Function that represent the action to be executed
     * @param <R> The type of the next {@link Element}
     * @return The {@link Thenable} containing the new {@link Element} reference after execution the {@code cont} function.
     */
    <R extends Element> Thenable<R> then(Function<E,R> cont);
}
