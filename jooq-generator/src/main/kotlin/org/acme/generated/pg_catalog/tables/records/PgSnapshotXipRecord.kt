/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgSnapshotXip
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgSnapshotXipRecord() : TableRecordImpl<PgSnapshotXipRecord>(PgSnapshotXip.PG_SNAPSHOT_XIP) {

    open var pgSnapshotXip: Any?
        set(value): Unit = set(0, value)
        get(): Any? = get(0) as Any?

    /**
     * Create a detached, initialised PgSnapshotXipRecord
     */
    constructor(pgSnapshotXip: Any? = null): this() {
        this.pgSnapshotXip = pgSnapshotXip
        resetChangedOnNotNull()
    }
}
