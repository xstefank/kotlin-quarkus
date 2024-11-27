/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgXactCommitTimestampOrigin : AbstractRoutine<java.lang.Void>("pg_xact_commit_timestamp_origin", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_xact_commit_timestamp_origin.xid</code>.
         */
        val XID: Parameter<Long?> = Internal.createParameter("xid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_xact_commit_timestamp_origin.timestamp</code>.
         */
        val TIMESTAMP: Parameter<OffsetDateTime?> = Internal.createParameter("timestamp", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_xact_commit_timestamp_origin.roident</code>.
         */
        val ROIDENT: Parameter<Long?> = Internal.createParameter("roident", SQLDataType.BIGINT, false, false)
    }

    init {
        addInParameter(PgXactCommitTimestampOrigin.XID)
        addOutParameter(PgXactCommitTimestampOrigin.TIMESTAMP)
        addOutParameter(PgXactCommitTimestampOrigin.ROIDENT)
    }

    /**
     * Set the <code>xid</code> parameter IN value to the routine
     */
    fun setXid(value: Long?): Unit = setValue(PgXactCommitTimestampOrigin.XID, value)

    /**
     * Get the <code>timestamp</code> parameter OUT value from the routine
     */
    fun getTimestamp(): OffsetDateTime? = get(PgXactCommitTimestampOrigin.TIMESTAMP)

    /**
     * Get the <code>roident</code> parameter OUT value from the routine
     */
    fun getRoident(): Long? = get(PgXactCommitTimestampOrigin.ROIDENT)
}
