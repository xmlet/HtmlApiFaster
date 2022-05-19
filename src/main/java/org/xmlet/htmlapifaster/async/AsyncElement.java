package org.xmlet.htmlapifaster.async;

import io.reactivex.rxjava3.core.Observable;
import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.Element;

import java.util.function.BiConsumer;

public interface AsyncElement<E extends Element> {
    
    /**
     * Asynchronous action to execute given an {@link Observable} and the current {@link Element}
     * @param obs the {@link Observable} that is going to be used for the async action
     * @param asyncAction {@link BiConsumer} containing the current {@link Element} being processed and the {@link Observable} passed as the parameter
     * @param <T> The type that the {@link Observable} contains
     * @param <O> A generic type that represents thh {@link Observable}
     * @return A {@link Thenable} as a result of the current asynchronous action happening
     */
    <T> Thenable<E> async(Observable<T> obs, BiConsumer<E, Observable<T>> asyncAction);
    
    default <T> Thenable<E> async(Publisher<T> pub, BiConsumer<E, Observable<T>> asyncAction) {
        return async(Observable.fromPublisher(pub), asyncAction);
    }
}
