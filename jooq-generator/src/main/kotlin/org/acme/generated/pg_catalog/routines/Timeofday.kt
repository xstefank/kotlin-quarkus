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
open class Timeofday : AbstractRoutine<String>("timeofday", PgCatalog.PG_CATALOG, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.timeofday.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = Timeofday.RETURN_VALUE
    }
}
