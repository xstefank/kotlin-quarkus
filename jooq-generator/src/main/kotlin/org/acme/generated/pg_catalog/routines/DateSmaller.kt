/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.LocalDate

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
open class DateSmaller : AbstractRoutine<LocalDate>("date_smaller", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATE) {
    companion object {

        /**
         * The parameter <code>pg_catalog.date_smaller.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalDate?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATE, false, false)

        /**
         * The parameter <code>pg_catalog.date_smaller._1</code>.
         */
        val _1: Parameter<LocalDate?> = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true)

        /**
         * The parameter <code>pg_catalog.date_smaller._2</code>.
         */
        val _2: Parameter<LocalDate?> = Internal.createParameter("_2", SQLDataType.LOCALDATE, false, true)
    }

    init {
        returnParameter = DateSmaller.RETURN_VALUE
        addInParameter(DateSmaller._1)
        addInParameter(DateSmaller._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalDate?): Unit = setValue(DateSmaller._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalDate?>): Unit {
        setField(DateSmaller._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: LocalDate?): Unit = setValue(DateSmaller._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<LocalDate?>): Unit {
        setField(DateSmaller._2, field)
    }
}
