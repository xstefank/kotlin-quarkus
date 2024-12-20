/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.tables.PgCursor
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgCursorRecord() : TableRecordImpl<PgCursorRecord>(PgCursor.PG_CURSOR) {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var statement: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsHoldable")
    open var isHoldable: Boolean?
        set(value): Unit = set(2, value)
        get(): Boolean? = get(2) as Boolean?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsBinary")
    open var isBinary: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsScrollable")
    open var isScrollable: Boolean?
        set(value): Unit = set(4, value)
        get(): Boolean? = get(4) as Boolean?

    open var creationTime: OffsetDateTime?
        set(value): Unit = set(5, value)
        get(): OffsetDateTime? = get(5) as OffsetDateTime?

    /**
     * Create a detached, initialised PgCursorRecord
     */
    constructor(name: String? = null, statement: String? = null, isHoldable: Boolean? = null, isBinary: Boolean? = null, isScrollable: Boolean? = null, creationTime: OffsetDateTime? = null): this() {
        this.name = name
        this.statement = statement
        this.isHoldable = isHoldable
        this.isBinary = isBinary
        this.isScrollable = isScrollable
        this.creationTime = creationTime
        resetChangedOnNotNull()
    }
}
