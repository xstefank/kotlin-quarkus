/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgTimezoneNames
import org.jooq.impl.TableRecordImpl
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgTimezoneNamesRecord() : TableRecordImpl<PgTimezoneNamesRecord>(PgTimezoneNames.PG_TIMEZONE_NAMES) {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var abbrev: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var utcOffset: YearToSecond?
        set(value): Unit = set(2, value)
        get(): YearToSecond? = get(2) as YearToSecond?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsDst")
    open var isDst: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    /**
     * Create a detached, initialised PgTimezoneNamesRecord
     */
    constructor(name: String? = null, abbrev: String? = null, utcOffset: YearToSecond? = null, isDst: Boolean? = null): this() {
        this.name = name
        this.abbrev = abbrev
        this.utcOffset = utcOffset
        this.isDst = isDst
        resetChangedOnNotNull()
    }
}
