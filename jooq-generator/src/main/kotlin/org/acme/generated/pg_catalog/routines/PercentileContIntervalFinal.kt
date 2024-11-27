/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PercentileContIntervalFinal : AbstractRoutine<YearToSecond>("percentile_cont_interval_final", PgCatalog.PG_CATALOG, SQLDataType.INTERVAL) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.percentile_cont_interval_final.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<YearToSecond?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTERVAL, false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)

        /**
         * The parameter
         * <code>pg_catalog.percentile_cont_interval_final._2</code>.
         */
        val _2: Parameter<Double?> = Internal.createParameter("_2", SQLDataType.DOUBLE, false, true)
    }

    init {
        returnParameter = PercentileContIntervalFinal.RETURN_VALUE
        addInParameter(PercentileContIntervalFinal._1)
        addInParameter(PercentileContIntervalFinal._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(PercentileContIntervalFinal._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(PercentileContIntervalFinal._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Double?): Unit = setValue(PercentileContIntervalFinal._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Double?>): Unit {
        setField(PercentileContIntervalFinal._2, field)
    }
}