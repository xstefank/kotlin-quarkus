/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.LocalTime

import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TimeMiTime : AbstractRoutine<YearToSecond>("time_mi_time", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL) {
    companion object {

        /**
         * The parameter <code>pg_catalog.time_mi_time.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<YearToSecond?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false)

        /**
         * The parameter <code>pg_catalog.time_mi_time._1</code>.
         */
        val _1: Parameter<LocalTime?> = Internal.createParameter("_1", SQLDataType.LOCALTIME(6), false, true)

        /**
         * The parameter <code>pg_catalog.time_mi_time._2</code>.
         */
        val _2: Parameter<LocalTime?> = Internal.createParameter("_2", SQLDataType.LOCALTIME(6), false, true)
    }

    init {
        returnParameter = TimeMiTime.RETURN_VALUE
        addInParameter(TimeMiTime._1)
        addInParameter(TimeMiTime._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalTime?): Unit = setValue(TimeMiTime._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalTime?>): Unit {
        setField(TimeMiTime._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: LocalTime?): Unit = setValue(TimeMiTime._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<LocalTime?>): Unit {
        setField(TimeMiTime._2, field)
    }
}
