package org.xmlet.htmlapifaster.async;

/**
 * @author Pedro Fialho
 * Generic class used to accept an async action on a Html element with a callback.
 * The callback is to be called when the async action has reached the end.
 **/
public interface AwaitConsumer<T,M> {

    /**
     * @param first The current Html element
     * @param model The model which contains the async source of data
     * @param third The callback used to be notified once the async action terminates.
     */
    void accept(T first, M model, OnCompletion third);
}
