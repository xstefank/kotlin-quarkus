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
open class ArrayOut : AbstractRoutine<Any>("array_out", PgCatalog.PG_CATALOG, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\"")) {
    companion object {
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val RETURN_VALUE: Parameter<Any?> = Internal.createParameter("RETURN_VALUE", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\""), false, false)

        /**
         * The parameter <code>pg_catalog.array_out._1</code>.
         */
        val _1: Parameter<Array<Any?>?> = Internal.createParameter("_1", SQLDataType.OTHER.array(), false, true)
    }

    init {
        returnParameter = ArrayOut.RETURN_VALUE
        addInParameter(ArrayOut._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Array<Any?>?): Unit = setValue(ArrayOut._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Array<Any?>?>): Unit {
        setField(ArrayOut._1, field)
    }
}