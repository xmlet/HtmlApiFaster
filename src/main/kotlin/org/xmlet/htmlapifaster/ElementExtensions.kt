package org.xmlet.htmlapifaster

interface ElementExtensions<T: Element<*,*>> {
    operator fun String.unaryPlus(): T {
        return addTextFromkotlin(this)
    }

    fun addTextFromkotlin(txt: String) : T
}