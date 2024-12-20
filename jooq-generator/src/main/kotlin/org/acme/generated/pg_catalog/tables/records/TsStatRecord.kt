/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.TsStat
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TsStatRecord() : TableRecordImpl<TsStatRecord>(TsStat.TS_STAT) {

    open var word: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var ndoc: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var nentry: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    /**
     * Create a detached, initialised TsStatRecord
     */
    constructor(word: String? = null, ndoc: Int? = null, nentry: Int? = null): this() {
        this.word = word
        this.ndoc = ndoc
        this.nentry = nentry
        resetChangedOnNotNull()
    }
}
