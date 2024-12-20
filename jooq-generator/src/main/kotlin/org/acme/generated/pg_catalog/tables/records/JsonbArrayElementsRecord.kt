/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.JsonbArrayElements
import org.jooq.JSONB
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbArrayElementsRecord() : TableRecordImpl<JsonbArrayElementsRecord>(JsonbArrayElements.JSONB_ARRAY_ELEMENTS) {

    open var value: JSONB?
        set(value): Unit = set(0, value)
        get(): JSONB? = get(0) as JSONB?

    /**
     * Create a detached, initialised JsonbArrayElementsRecord
     */
    constructor(value: JSONB? = null): this() {
        this.value = value
        resetChangedOnNotNull()
    }
}
