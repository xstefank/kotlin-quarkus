/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables._PgForeignTables
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class _PgForeignTablesRecord() : TableRecordImpl<_PgForeignTablesRecord>(_PgForeignTables._PG_FOREIGN_TABLES) {

    open var foreignTableCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var foreignTableSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var foreignTableName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var ftoptions: Array<String?>?
        set(value): Unit = set(3, value)
        get(): Array<String?>? = get(3) as Array<String?>?

    open var foreignServerCatalog: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var foreignServerName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var authorizationIdentifier: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    /**
     * Create a detached, initialised _PgForeignTablesRecord
     */
    constructor(foreignTableCatalog: String? = null, foreignTableSchema: String? = null, foreignTableName: String? = null, ftoptions: Array<String?>? = null, foreignServerCatalog: String? = null, foreignServerName: String? = null, authorizationIdentifier: String? = null): this() {
        this.foreignTableCatalog = foreignTableCatalog
        this.foreignTableSchema = foreignTableSchema
        this.foreignTableName = foreignTableName
        this.ftoptions = ftoptions
        this.foreignServerCatalog = foreignServerCatalog
        this.foreignServerName = foreignServerName
        this.authorizationIdentifier = authorizationIdentifier
        resetChangedOnNotNull()
    }
}