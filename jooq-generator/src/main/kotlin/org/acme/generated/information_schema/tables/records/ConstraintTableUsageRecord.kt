/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.ConstraintTableUsage
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ConstraintTableUsageRecord() : TableRecordImpl<ConstraintTableUsageRecord>(ConstraintTableUsage.CONSTRAINT_TABLE_USAGE) {

    open var tableCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tableSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var tableName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var constraintCatalog: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var constraintSchema: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var constraintName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    /**
     * Create a detached, initialised ConstraintTableUsageRecord
     */
    constructor(tableCatalog: String? = null, tableSchema: String? = null, tableName: String? = null, constraintCatalog: String? = null, constraintSchema: String? = null, constraintName: String? = null): this() {
        this.tableCatalog = tableCatalog
        this.tableSchema = tableSchema
        this.tableName = tableName
        this.constraintCatalog = constraintCatalog
        this.constraintSchema = constraintSchema
        this.constraintName = constraintName
        resetChangedOnNotNull()
    }
}
