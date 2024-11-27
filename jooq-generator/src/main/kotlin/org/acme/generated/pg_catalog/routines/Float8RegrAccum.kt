/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


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
open class Float8RegrAccum : AbstractRoutine<Array<Double?>>("float8_regr_accum", PgCatalog.PG_CATALOG, SQLDataType.FLOAT.array()) {
    companion object {

        /**
         * The parameter <code>pg_catalog.float8_regr_accum.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Array<Double?>?> = Internal.createParameter("RETURN_VALUE", SQLDataType.FLOAT.array(), false, false)

        /**
         * The parameter <code>pg_catalog.float8_regr_accum._1</code>.
         */
        val _1: Parameter<Array<Double?>?> = Internal.createParameter("_1", SQLDataType.FLOAT.array(), false, true)

        /**
         * The parameter <code>pg_catalog.float8_regr_accum._2</code>.
         */
        val _2: Parameter<Double?> = Internal.createParameter("_2", SQLDataType.DOUBLE, false, true)

        /**
         * The parameter <code>pg_catalog.float8_regr_accum._3</code>.
         */
        val _3: Parameter<Double?> = Internal.createParameter("_3", SQLDataType.DOUBLE, false, true)
    }

    init {
        returnParameter = Float8RegrAccum.RETURN_VALUE
        addInParameter(Float8RegrAccum._1)
        addInParameter(Float8RegrAccum._2)
        addInParameter(Float8RegrAccum._3)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Double?>?): Unit = setValue(Float8RegrAccum._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Double?>?>): Unit {
        setField(Float8RegrAccum._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Double?): Unit = setValue(Float8RegrAccum._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Double?>): Unit {
        setField(Float8RegrAccum._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Double?): Unit = setValue(Float8RegrAccum._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Double?>): Unit {
        setField(Float8RegrAccum._3, field)
    }
}