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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Time3 : AbstractRoutine<LocalTime>("time", PgCatalog.PG_CATALOG, SQLDataType.LOCALTIME(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.time.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALTIME(6), false, false)

        /**
         * The parameter <code>pg_catalog.time._1</code>.
         */
        val _1: Parameter<LocalTime?> = Internal.createParameter("_1", SQLDataType.LOCALTIME(6), false, true)

        /**
         * The parameter <code>pg_catalog.time._2</code>.
         */
        val _2: Parameter<Int?> = Internal.createParameter("_2", SQLDataType.INTEGER, false, true)
    }

    init {
        returnParameter = Time3.RETURN_VALUE
        addInParameter(Time3._1)
        addInParameter(Time3._2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalTime?): Unit = setValue(Time3._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalTime?>): Unit {
        setField(Time3._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Int?): Unit = setValue(Time3._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Int?>): Unit {
        setField(Time3._2, field)
    }
}
