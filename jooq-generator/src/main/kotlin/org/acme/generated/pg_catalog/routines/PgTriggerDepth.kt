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
open class PgTriggerDepth : AbstractRoutine<Int>("pg_trigger_depth", PgCatalog.PG_CATALOG, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_trigger_depth.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)
    }

    init {
        returnParameter = PgTriggerDepth.RETURN_VALUE
    }
}
