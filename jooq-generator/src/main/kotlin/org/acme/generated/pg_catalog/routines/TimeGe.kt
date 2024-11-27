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
open class TimeGe : AbstractRoutine<Boolean>("time_ge", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.time_ge.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.time_ge._1</code>.
         */
        val _1: Parameter<LocalTime?> = Internal.createParameter("_1", SQLDataType.LOCALTIME(6), false, true)

        /**
         * The parameter <code>pg_catalog.time_ge._2</code>.
         */
        val _2: Parameter<LocalTime?> = Internal.createParameter("_2", SQLDataType.LOCALTIME(6), false, true)
    }

    init {
        returnParameter = TimeGe.RETURN_VALUE
        addInParameter(TimeGe._1)
        addInParameter(TimeGe._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalTime?): Unit = setValue(TimeGe._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalTime?>): Unit {
        setField(TimeGe._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: LocalTime?): Unit = setValue(TimeGe._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<LocalTime?>): Unit {
        setField(TimeGe._2, field)
    }
}
