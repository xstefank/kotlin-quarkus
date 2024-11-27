/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.ForeignServerOptions
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ForeignServerOptionsRecord() : TableRecordImpl<ForeignServerOptionsRecord>(ForeignServerOptions.FOREIGN_SERVER_OPTIONS) {

    open var foreignServerCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var foreignServerName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var optionName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var optionValue: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    /**
     * Create a detached, initialised ForeignServerOptionsRecord
     */
    constructor(foreignServerCatalog: String? = null, foreignServerName: String? = null, optionName: String? = null, optionValue: String? = null): this() {
        this.foreignServerCatalog = foreignServerCatalog
        this.foreignServerName = foreignServerName
        this.optionName = optionName
        this.optionValue = optionValue
        resetChangedOnNotNull()
    }
}