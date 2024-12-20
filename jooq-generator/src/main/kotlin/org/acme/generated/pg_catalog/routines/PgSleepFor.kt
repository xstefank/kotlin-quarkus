/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgSleepFor : AbstractRoutine<java.lang.Void>("pg_sleep_for", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_sleep_for._1</code>.
         */
        val _1: Parameter<YearToSecond?> = Internal.createParameter("_1", SQLDataType.INTERVAL, false, true)
    }

    init {
        addInParameter(PgSleepFor._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: YearToSecond?): Unit = setValue(PgSleepFor._1, value)
}
