/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.ColumnOptions
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ColumnOptionsRecord() : TableRecordImpl<ColumnOptionsRecord>(ColumnOptions.COLUMN_OPTIONS) {

    open var tableCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tableSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var tableName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var columnName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var optionName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var optionValue: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    /**
     * Create a detached, initialised ColumnOptionsRecord
     */
    constructor(tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null, columnName: String? = null, optionName: String? = null, optionValue: String? = null): this() {
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.columnName = columnName
        this.optionName = optionName
        this.optionValue = optionValue
        resetChangedOnNotNull()
    }
}
