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
open class PgSleep : AbstractRoutine<java.lang.Void>("pg_sleep", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_sleep._1</code>.
         */
        val _1: Parameter<Double?> = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true)
    }

    init {
        addInParameter(PgSleep._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Double?): Unit = setValue(PgSleep._1, value)
}