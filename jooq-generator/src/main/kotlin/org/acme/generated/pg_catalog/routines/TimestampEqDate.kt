/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.LocalDate
import java.time.LocalDateTime

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
open class TimestampEqDate : AbstractRoutine<Boolean>("timestamp_eq_date", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.timestamp_eq_date.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.timestamp_eq_date._1</code>.
         */
        val _1: Parameter<LocalDateTime?> = Internal.createParameter("_1", SQLDataType.LOCALDATETIME(6), false, true)

        /**
         * The parameter <code>pg_catalog.timestamp_eq_date._2</code>.
         */
        val _2: Parameter<LocalDate?> = Internal.createParameter("_2", SQLDataType.LOCALDATE, false, true)
    }

    init {
        returnParameter = TimestampEqDate.RETURN_VALUE
        addInParameter(TimestampEqDate._1)
        addInParameter(TimestampEqDate._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalDateTime?): Unit = setValue(TimestampEqDate._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalDateTime?>): Unit {
        setField(TimestampEqDate._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: LocalDate?): Unit = setValue(TimestampEqDate._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<LocalDate?>): Unit {
        setField(TimestampEqDate._2, field)
    }
}
