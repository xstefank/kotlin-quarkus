/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.tables.PgLsTmpdir
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgLsTmpdirRecord() : TableRecordImpl<PgLsTmpdirRecord>(PgLsTmpdir.PG_LS_TMPDIR) {

    open var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var size: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var modification: OffsetDateTime?
        set(value): Unit = set(2, value)
        get(): OffsetDateTime? = get(2) as OffsetDateTime?

    /**
     * Create a detached, initialised PgLsTmpdirRecord
     */
    constructor(name: String? = null, size: Long? = null, modification: OffsetDateTime? = null): this() {
        this.name = name
        this.size = size
        this.modification = modification
        resetChangedOnNotNull()
    }
}
