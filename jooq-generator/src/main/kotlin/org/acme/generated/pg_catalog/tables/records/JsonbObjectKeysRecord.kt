/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.JsonbObjectKeys
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbObjectKeysRecord() : TableRecordImpl<JsonbObjectKeysRecord>(JsonbObjectKeys.JSONB_OBJECT_KEYS) {

    open var jsonbObjectKeys: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    /**
     * Create a detached, initialised JsonbObjectKeysRecord
     */
    constructor(jsonbObjectKeys: String? = null): this() {
        this.jsonbObjectKeys = jsonbObjectKeys
        resetChangedOnNotNull()
    }
}
