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


@Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
@Suppress("UNCHECKED_CAST")
open class PercentileDisc1 : AbstractRoutine<Any>("percentile_disc", PgCatalog.PG_CATALOG, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\"")) {
    companion object {
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val RETURN_VALUE: Parameter<Any?> = Internal.createParameter("RETURN_VALUE", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), false, false)

        /**
         * The parameter <code>pg_catalog.percentile_disc._1</code>.
         */
        val _1: Parameter<Double?> = Internal.createParameter("_1", SQLDataType.DOUBLE, false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _2: Parameter<Any?> = Internal.createParameter("_2", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyelement\""), false, true)
    }

    init {
        returnParameter = PercentileDisc1.RETURN_VALUE
        addInParameter(PercentileDisc1._1)
        addInParameter(PercentileDisc1._2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Double?): Unit = setValue(PercentileDisc1._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Double?>): Unit {
        setField(PercentileDisc1._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Any?): Unit = setValue(PercentileDisc1._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Any?>): Unit {
        setField(PercentileDisc1._2, field)
    }
}
