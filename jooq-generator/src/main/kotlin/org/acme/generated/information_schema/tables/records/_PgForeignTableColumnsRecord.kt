/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables._PgForeignTableColumns
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class _PgForeignTableColumnsRecord() : TableRecordImpl<_PgForeignTableColumnsRecord>(_PgForeignTableColumns._PG_FOREIGN_TABLE_COLUMNS) {

    open var nspname: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var relname: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var attname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var attfdwoptions: Array<String?>?
        set(value): Unit = set(3, value)
        get(): Array<String?>? = get(3) as Array<String?>?

    /**
     * Create a detached, initialised _PgForeignTableColumnsRecord
     */
    constructor(nspname: String? = null, relname: String? = null, attname: String? = null, attfdwoptions: Array<String?>? = null): this() {
        this.nspname = nspname
        this.relname = relname
        this.attname = attname
        this.attfdwoptions = attfdwoptions
        resetChangedOnNotNull()
    }
}
