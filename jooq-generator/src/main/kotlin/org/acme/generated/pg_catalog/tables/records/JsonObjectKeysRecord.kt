/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.JsonObjectKeys
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonObjectKeysRecord() : TableRecordImpl<JsonObjectKeysRecord>(JsonObjectKeys.JSON_OBJECT_KEYS) {

    open var jsonObjectKeys: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    /**
     * Create a detached, initialised JsonObjectKeysRecord
     */
    constructor(jsonObjectKeys: String? = null): this() {
        this.jsonObjectKeys = jsonObjectKeys
        resetChangedOnNotNull()
    }
}
