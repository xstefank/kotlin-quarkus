/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.ColumnUdtUsage
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ColumnUdtUsageRecord() : TableRecordImpl<ColumnUdtUsageRecord>(ColumnUdtUsage.COLUMN_UDT_USAGE) {

    open var udtCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var udtSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var udtName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var tableCatalog: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var tableSchema: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var tableName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var columnName: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    /**
     * Create a detached, initialised ColumnUdtUsageRecord
     */
    constructor(udtCatalog: String? = null, udtSchema: String? = null, udtName: String? = null, tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null, columnName: String? = null): this() {
        this.udtCatalog = udtCatalog
        this.udtSchema = udtSchema
        this.udtName = udtName
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.columnName = columnName
        resetChangedOnNotNull()
    }
}