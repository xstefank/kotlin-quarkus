/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.JsonToRecordset
import org.jooq.Record
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonToRecordsetRecord() : TableRecordImpl<JsonToRecordsetRecord>(JsonToRecordset.JSON_TO_RECORDSET) {

    open var jsonToRecordset: Record?
        set(value): Unit = set(0, value)
        get(): Record? = get(0) as Record?

    /**
     * Create a detached, initialised JsonToRecordsetRecord
     */
    constructor(jsonToRecordset: Record? = null): this() {
        this.jsonToRecordset = jsonToRecordset
        resetChangedOnNotNull()
    }
}