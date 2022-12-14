package org.xmlet.htmlapifaster.async;

import org.reactivestreams.Publisher;
import org.xmlet.htmlapifaster.Element;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface AsyncElement<E extends Element> {
    
    /**
     * Asynchronous action to execute given an {@link Publisher} and the current {@link Element}
     */
    <M> E await(AwaitConsumer<E,M> asyncAction);
}
