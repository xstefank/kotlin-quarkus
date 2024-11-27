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
open class PgPostmasterStartTime : AbstractRoutine<OffsetDateTime>("pg_postmaster_start_time", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6)) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_postmaster_start_time.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)
    }

    init {
        returnParameter = PgPostmasterStartTime.RETURN_VALUE
    }
}
