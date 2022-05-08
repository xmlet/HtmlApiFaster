package org.xmlet.htmlapifaster.async;

import io.reactivex.rxjava3.core.Observable;
import org.xmlet.htmlapifaster.Element;

import java.util.function.Consumer;
import java.util.function.Function;

public interface Thenable<E extends Element> {
    
    <R extends Element, T, O extends Observable<T>> Thenable<R> async(O obs, Consumer<E> asyncAction, Continuation<E,R> continuation);
    
    <R extends Element> Thenable<R> then(Function<E,R> cont);
}
