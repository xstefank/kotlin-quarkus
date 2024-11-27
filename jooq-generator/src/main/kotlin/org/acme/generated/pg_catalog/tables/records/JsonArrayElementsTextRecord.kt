/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.JsonArrayElementsText
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonArrayElementsTextRecord() : TableRecordImpl<JsonArrayElementsTextRecord>(JsonArrayElementsText.JSON_ARRAY_ELEMENTS_TEXT) {

    open var value: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    /**
     * Create a detached, initialised JsonArrayElementsTextRecord
     */
    constructor(value: String? = null): this() {
        this.value = value
        resetChangedOnNotNull()
    }
}