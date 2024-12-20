/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.TriggeredUpdateColumns
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TriggeredUpdateColumnsRecord() : TableRecordImpl<TriggeredUpdateColumnsRecord>(TriggeredUpdateColumns.TRIGGERED_UPDATE_COLUMNS) {

    open var triggerCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var triggerSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var triggerName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var eventObjectCatalog: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var eventObjectSchema: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var eventObjectTable: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var eventObjectColumn: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    /**
     * Create a detached, initialised TriggeredUpdateColumnsRecord
     */
    constructor(triggerCatalog: String? = null, triggerSchema: String? = null, triggerName: String? = null, eventObjectCatalog: String? = null, eventObjectSchema: String? = null, eventObjectTable: String? = null, eventObjectColumn: String? = null): this() {
        this.triggerCatalog = triggerCatalog
        this.triggerSchema = triggerSchema
        this.triggerName = triggerName
        this.eventObjectCatalog = eventObjectCatalog
        this.eventObjectSchema = eventObjectSchema
        this.eventObjectTable = eventObjectTable
        this.eventObjectColumn = eventObjectColumn
        resetChangedOnNotNull()
    }
}
