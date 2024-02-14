package org.xmlet.htmlapifaster

interface SuspendConsumer<E, M> {
    suspend fun E.accept(model: M)
}