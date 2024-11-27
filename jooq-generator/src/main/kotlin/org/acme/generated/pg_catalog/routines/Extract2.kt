/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.math.BigDecimal
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
open class Extract2 : AbstractRoutine<BigDecimal>("extract", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC) {
    companion object {

        /**
         * The parameter <code>pg_catalog.extract.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<BigDecimal?> = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false)

        /**
         * The parameter <code>pg_catalog.extract._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CLOB, false, true)

        /**
         * The parameter <code>pg_catalog.extract._2</code>.
         */
        val _2: Parameter<LocalTime?> = Internal.createParameter("_2", SQLDataType.LOCALTIME(6), false, true)
    }

    init {
        returnParameter = Extract2.RETURN_VALUE
        addInParameter(Extract2._1)
        addInParameter(Extract2._2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(Extract2._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<String?>): Unit {
        setField(Extract2._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: LocalTime?): Unit = setValue(Extract2._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<LocalTime?>): Unit {
        setField(Extract2._2, field)
    }
}