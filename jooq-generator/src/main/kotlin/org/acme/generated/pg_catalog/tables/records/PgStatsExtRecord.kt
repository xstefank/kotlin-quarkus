/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStatsExt
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStatsExtRecord() : TableRecordImpl<PgStatsExtRecord>(PgStatsExt.PG_STATS_EXT) {

    open var schemaname: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var tablename: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var statisticsSchemaname: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var statisticsName: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var statisticsOwner: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var attnames: Array<String?>?
        set(value): Unit = set(5, value)
        get(): Array<String?>? = get(5) as Array<String?>?

    open var exprs: Array<String?>?
        set(value): Unit = set(6, value)
        get(): Array<String?>? = get(6) as Array<String?>?

    open var kinds: Array<String?>?
        set(value): Unit = set(7, value)
        get(): Array<String?>? = get(7) as Array<String?>?

    open var nDistinct: Any?
        set(value): Unit = set(8, value)
        get(): Any? = get(8) as Any?

    open var dependencies: Any?
        set(value): Unit = set(9, value)
        get(): Any? = get(9) as Any?

    open var mostCommonVals: Array<String?>?
        set(value): Unit = set(10, value)
        get(): Array<String?>? = get(10) as Array<String?>?

    open var mostCommonValNulls: Array<Boolean?>?
        set(value): Unit = set(11, value)
        get(): Array<Boolean?>? = get(11) as Array<Boolean?>?

    open var mostCommonFreqs: Array<Double?>?
        set(value): Unit = set(12, value)
        get(): Array<Double?>? = get(12) as Array<Double?>?

    open var mostCommonBaseFreqs: Array<Double?>?
        set(value): Unit = set(13, value)
        get(): Array<Double?>? = get(13) as Array<Double?>?

    /**
     * Create a detached, initialised PgStatsExtRecord
     */
    constructor(schemaname: String? = null, tablename: String? = null, statisticsSchemaname: String? = null, statisticsName: String? = null, statisticsOwner: String? = null, attnames: Array<String?>? = null, exprs: Array<String?>? = null, kinds: Array<String?>? = null, nDistinct: Any? = null, dependencies: Any? = null, mostCommonVals: Array<String?>? = null, mostCommonValNulls: Array<Boolean?>? = null, mostCommonFreqs: Array<Double?>? = null, mostCommonBaseFreqs: Array<Double?>? = null): this() {
        this.schemaname = schemaname
        this.tablename = tablename
        this.statisticsSchemaname = statisticsSchemaname
        this.statisticsName = statisticsName
        this.statisticsOwner = statisticsOwner
        this.attnames = attnames
        this.exprs = exprs
        this.kinds = kinds
        this.nDistinct = nDistinct
        this.dependencies = dependencies
        this.mostCommonVals = mostCommonVals
        this.mostCommonValNulls = mostCommonValNulls
        this.mostCommonFreqs = mostCommonFreqs
        this.mostCommonBaseFreqs = mostCommonBaseFreqs
        resetChangedOnNotNull()
    }
}
