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
open class PgLastCommittedXact : AbstractRoutine<java.lang.Void>("pg_last_committed_xact", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_last_committed_xact.xid</code>.
         */
        val XID: Parameter<Long?> = Internal.createParameter("xid", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_last_committed_xact.timestamp</code>.
         */
        val TIMESTAMP: Parameter<OffsetDateTime?> = Internal.createParameter("timestamp", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)

        /**
         * The parameter <code>pg_catalog.pg_last_committed_xact.roident</code>.
         */
        val ROIDENT: Parameter<Long?> = Internal.createParameter("roident", SQLDataType.BIGINT, false, false)
    }

    init {
        addOutParameter(PgLastCommittedXact.XID)
        addOutParameter(PgLastCommittedXact.TIMESTAMP)
        addOutParameter(PgLastCommittedXact.ROIDENT)
    }

    /**
     * Get the <code>xid</code> parameter OUT value from the routine
     */
    fun getXid(): Long? = get(PgLastCommittedXact.XID)

    /**
     * Get the <code>timestamp</code> parameter OUT value from the routine
     */
    fun getTimestamp(): OffsetDateTime? = get(PgLastCommittedXact.TIMESTAMP)

    /**
     * Get the <code>roident</code> parameter OUT value from the routine
     */
    fun getRoident(): Long? = get(PgLastCommittedXact.ROIDENT)
}
