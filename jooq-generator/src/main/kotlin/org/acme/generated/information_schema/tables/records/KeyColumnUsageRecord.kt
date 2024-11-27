/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.KeyColumnUsage
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KeyColumnUsageRecord() : TableRecordImpl<KeyColumnUsageRecord>(KeyColumnUsage.KEY_COLUMN_USAGE) {

    open var constraintCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var constraintSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var constraintName: String?
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

    open var ordinalPosition: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    open var positionInUniqueConstraint: Int?
        set(value): Unit = set(8, value)
        get(): Int? = get(8) as Int?

    /**
     * Create a detached, initialised KeyColumnUsageRecord
     */
    constructor(constraintCatalog: String? = null, constraintSchema: String? = null, constraintName: String? = null, tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null, columnName: String? = null, ordinalPosition: Int? = null, positionInUniqueConstraint: Int? = null): this() {
        this.constraintCatalog = constraintCatalog
        this.constraintSchema = constraintSchema
        this.constraintName = constraintName
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.columnName = columnName
        this.ordinalPosition = ordinalPosition
        this.positionInUniqueConstraint = positionInUniqueConstraint
        resetChangedOnNotNull()
    }
}
