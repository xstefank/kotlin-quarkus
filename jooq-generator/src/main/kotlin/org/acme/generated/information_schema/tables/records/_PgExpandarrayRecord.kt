/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables._PgExpandarray
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class _PgExpandarrayRecord() : TableRecordImpl<_PgExpandarrayRecord>(_PgExpandarray._PG_EXPANDARRAY) {

    open var x: Any?
        set(value): Unit = set(0, value)
        get(): Any? = get(0) as Any?

    open var n: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    /**
     * Create a detached, initialised _PgExpandarrayRecord
     */
    constructor(x: Any? = null, n: Int? = null): this() {
        this.x = x
        this.n = n
        resetChangedOnNotNull()
    }
}
