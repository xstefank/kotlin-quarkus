/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.math.BigDecimal

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
open class NumericDiv : AbstractRoutine<BigDecimal>("numeric_div", PgCatalog.PG_CATALOG, SQLDataType.NUMERIC) {
    companion object {

        /**
         * The parameter <code>pg_catalog.numeric_div.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<BigDecimal?> = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false)

        /**
         * The parameter <code>pg_catalog.numeric_div._1</code>.
         */
        val _1: Parameter<BigDecimal?> = Internal.createParameter("_1", SQLDataType.NUMERIC, false, true)

        /**
         * The parameter <code>pg_catalog.numeric_div._2</code>.
         */
        val _2: Parameter<BigDecimal?> = Internal.createParameter("_2", SQLDataType.NUMERIC, false, true)
    }

    init {
        returnParameter = NumericDiv.RETURN_VALUE
        addInParameter(NumericDiv._1)
        addInParameter(NumericDiv._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: BigDecimal?): Unit = setValue(NumericDiv._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<BigDecimal?>): Unit {
        setField(NumericDiv._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: BigDecimal?): Unit = setValue(NumericDiv._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<BigDecimal?>): Unit {
        setField(NumericDiv._2, field)
    }
}
