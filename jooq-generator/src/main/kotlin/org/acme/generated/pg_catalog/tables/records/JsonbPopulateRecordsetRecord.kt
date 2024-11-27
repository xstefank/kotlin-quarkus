/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.JsonbPopulateRecordset
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbPopulateRecordsetRecord() : TableRecordImpl<JsonbPopulateRecordsetRecord>(JsonbPopulateRecordset.JSONB_POPULATE_RECORDSET) {

    open var jsonbPopulateRecordset: Any?
        set(value): Unit = set(0, value)
        get(): Any? = get(0) as Any?

    /**
     * Create a detached, initialised JsonbPopulateRecordsetRecord
     */
    constructor(jsonbPopulateRecordset: Any? = null): this() {
        this.jsonbPopulateRecordset = jsonbPopulateRecordset
        resetChangedOnNotNull()
    }
}
