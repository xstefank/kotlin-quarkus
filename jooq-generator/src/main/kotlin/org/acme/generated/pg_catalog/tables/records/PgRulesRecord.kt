/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgRules
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgRulesRecord() : TableRecordImpl<PgRulesRecord>(PgRules.PG_RULES) {

    open var schemaname: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tablename: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var rulename: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var definition: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    /**
     * Create a detached, initialised PgRulesRecord
     */
    constructor(schemaname: String? = null, tablename: String? = null, rulename: String? = null, definition: String? = null): this() {
        this.schemaname = schemaname
        this.tablename = tablename
        this.rulename = rulename
        this.definition = definition
        resetChangedOnNotNull()
    }
}
