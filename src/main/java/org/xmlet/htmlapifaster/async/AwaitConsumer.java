package org.xmlet.htmlapifaster.async;

/**
 * @author Pedro Fialho
 **/
public interface AwaitConsumer<T,M> {

    void accept(T first, M model, OnCompletion third);
}
