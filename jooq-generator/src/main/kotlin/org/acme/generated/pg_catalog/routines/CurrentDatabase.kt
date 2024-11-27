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
open class CurrentDatabase : AbstractRoutine<String>("current_database", PgCatalog.PG_CATALOG, SQLDataType.VARCHAR) {
    companion object {

        /**
         * The parameter <code>pg_catalog.current_database.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.VARCHAR, false, false)
    }

    init {
        returnParameter = CurrentDatabase.RETURN_VALUE
    }
}
