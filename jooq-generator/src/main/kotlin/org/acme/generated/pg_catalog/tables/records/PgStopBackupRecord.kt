/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgStopBackup
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgStopBackupRecord() : TableRecordImpl<PgStopBackupRecord>(PgStopBackup.PG_STOP_BACKUP) {

    open var lsn: Any?
        set(value): Unit = set(0, value)
        get(): Any? = get(0) as Any?

    open var labelfile: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var spcmapfile: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    /**
     * Create a detached, initialised PgStopBackupRecord
     */
    constructor(lsn: Any? = null, labelfile: String? = null, spcmapfile: String? = null): this() {
        this.lsn = lsn
        this.labelfile = labelfile
        this.spcmapfile = spcmapfile
        resetChangedOnNotNull()
    }
}