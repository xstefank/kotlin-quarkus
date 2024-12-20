/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgHbaFileRules
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgHbaFileRulesRecord() : TableRecordImpl<PgHbaFileRulesRecord>(PgHbaFileRules.PG_HBA_FILE_RULES) {

    open var lineNumber: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var type: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var database: Array<String?>?
        set(value): Unit = set(2, value)
        get(): Array<String?>? = get(2) as Array<String?>?

    open var userName: Array<String?>?
        set(value): Unit = set(3, value)
        get(): Array<String?>? = get(3) as Array<String?>?

    open var address: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var netmask: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var authMethod: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var options: Array<String?>?
        set(value): Unit = set(7, value)
        get(): Array<String?>? = get(7) as Array<String?>?

    open var error: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    /**
     * Create a detached, initialised PgHbaFileRulesRecord
     */
    constructor(lineNumber: Int? = null, type: String? = null, database: Array<String?>? = null, userName: Array<String?>? = null, address: String? = null, netmask: String? = null, authMethod: String? = null, options: Array<String?>? = null, error: String? = null): this() {
        this.lineNumber = lineNumber
        this.type = type
        this.database = database
        this.userName = userName
        this.address = address
        this.netmask = netmask
        this.authMethod = authMethod
        this.options = options
        this.error = error
        resetChangedOnNotNull()
    }
}
