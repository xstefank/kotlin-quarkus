/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.RegexpSplitToTable
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RegexpSplitToTableRecord() : TableRecordImpl<RegexpSplitToTableRecord>(RegexpSplitToTable.REGEXP_SPLIT_TO_TABLE) {

    open var regexpSplitToTable: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    /**
     * Create a detached, initialised RegexpSplitToTableRecord
     */
    constructor(regexpSplitToTable: String? = null): this() {
        this.regexpSplitToTable = regexpSplitToTable
        resetChangedOnNotNull()
    }
}