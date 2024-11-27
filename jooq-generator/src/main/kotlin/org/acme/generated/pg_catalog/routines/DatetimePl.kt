/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DatetimePl : AbstractRoutine<LocalDateTime>("datetime_pl", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATETIME(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.datetime_pl.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATETIME(6), false, false)

        /**
         * The parameter <code>pg_catalog.datetime_pl._1</code>.
         */
        val _1: Parameter<LocalDate?> = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true)

        /**
         * The parameter <code>pg_catalog.datetime_pl._2</code>.
         */
        val _2: Parameter<LocalTime?> = Internal.createParameter("_2", SQLDataType.LOCALTIME(6), false, true)
    }

    init {
        returnParameter = DatetimePl.RETURN_VALUE
        addInParameter(DatetimePl._1)
        addInParameter(DatetimePl._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalDate?): Unit = setValue(DatetimePl._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalDate?>): Unit {
        setField(DatetimePl._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: LocalTime?): Unit = setValue(DatetimePl._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<LocalTime?>): Unit {
        setField(DatetimePl._2, field)
    }
}