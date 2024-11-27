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
open class PgStatGetBgwriterBufWrittenCheckpoints : AbstractRoutine<Long>("pg_stat_get_bgwriter_buf_written_checkpoints", PgCatalog.PG_CATALOG, SQLDataType.BIGINT) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_stat_get_bgwriter_buf_written_checkpoints.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Long?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false)
    }

    init {
        returnParameter = PgStatGetBgwriterBufWrittenCheckpoints.RETURN_VALUE
    }
}
