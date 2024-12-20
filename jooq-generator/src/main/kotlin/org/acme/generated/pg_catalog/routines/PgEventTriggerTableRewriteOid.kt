/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgEventTriggerTableRewriteOid : AbstractRoutine<java.lang.Void>("pg_event_trigger_table_rewrite_oid", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_event_trigger_table_rewrite_oid.oid</code>.
         */
        val OID: Parameter<Long?> = Internal.createParameter("oid", SQLDataType.BIGINT, false, false)
    }

    init {
        addOutParameter(PgEventTriggerTableRewriteOid.OID)
    }

    /**
     * Get the <code>oid</code> parameter OUT value from the routine
     */
    fun getOid(): Long? = get(PgEventTriggerTableRewriteOid.OID)
}
