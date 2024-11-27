/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgSequences
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgSequencesRecord() : TableRecordImpl<PgSequencesRecord>(PgSequences.PG_SEQUENCES) {

    open var schemaname: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var sequencename: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var sequenceowner: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var dataType: Any?
        set(value): Unit = set(3, value)
        get(): Any? = get(3) as Any?

    open var startValue: Long?
        set(value): Unit = set(4, value)
        get(): Long? = get(4) as Long?

    open var minValue: Long?
        set(value): Unit = set(5, value)
        get(): Long? = get(5) as Long?

    open var maxValue: Long?
        set(value): Unit = set(6, value)
        get(): Long? = get(6) as Long?

    open var incrementBy: Long?
        set(value): Unit = set(7, value)
        get(): Long? = get(7) as Long?

    open var cycle: Boolean?
        set(value): Unit = set(8, value)
        get(): Boolean? = get(8) as Boolean?

    open var cacheSize: Long?
        set(value): Unit = set(9, value)
        get(): Long? = get(9) as Long?

    open var lastValue: Long?
        set(value): Unit = set(10, value)
        get(): Long? = get(10) as Long?

    /**
     * Create a detached, initialised PgSequencesRecord
     */
    constructor(schemaname: String? = null, sequencename: String? = null, sequenceowner: String? = null, dataType: Any? = null, startValue: Long? = null, minValue: Long? = null, maxValue: Long? = null, incrementBy: Long? = null, cycle: Boolean? = null, cacheSize: Long? = null, lastValue: Long? = null): this() {
        this.schemaname = schemaname
        this.sequencename = sequencename
        this.sequenceowner = sequenceowner
        this.dataType = dataType
        this.startValue = startValue
        this.minValue = minValue
        this.maxValue = maxValue
        this.incrementBy = incrementBy
        this.cycle = cycle
        this.cacheSize = cacheSize
        this.lastValue = lastValue
        resetChangedOnNotNull()
    }
}