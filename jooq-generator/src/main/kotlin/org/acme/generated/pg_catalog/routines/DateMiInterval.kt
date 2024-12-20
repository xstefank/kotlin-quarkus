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
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DateMiInterval : AbstractRoutine<LocalDateTime>("date_mi_interval", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATETIME(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.date_mi_interval.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATETIME(6), false, false)

        /**
         * The parameter <code>pg_catalog.date_mi_interval._1</code>.
         */
        val _1: Parameter<LocalDate?> = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true)

        /**
         * The parameter <code>pg_catalog.date_mi_interval._2</code>.
         */
        val _2: Parameter<YearToSecond?> = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true)
    }

    init {
        returnParameter = DateMiInterval.RETURN_VALUE
        addInParameter(DateMiInterval._1)
        addInParameter(DateMiInterval._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalDate?): Unit = setValue(DateMiInterval._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalDate?>): Unit {
        setField(DateMiInterval._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: YearToSecond?): Unit = setValue(DateMiInterval._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<YearToSecond?>): Unit {
        setField(DateMiInterval._2, field)
    }
}
