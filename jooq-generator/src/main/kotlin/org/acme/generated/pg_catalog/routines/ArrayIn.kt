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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ArrayIn : AbstractRoutine<Array<Any?>>("array_in", PgCatalog.PG_CATALOG, SQLDataType.OTHER.array()) {
    companion object {

        /**
         * The parameter <code>pg_catalog.array_in.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Array<Any?>?> = Internal.createParameter("RETURN_VALUE", SQLDataType.OTHER.array(), false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\""), false, true)

        /**
         * The parameter <code>pg_catalog.array_in._2</code>.
         */
        val _2: Parameter<Long?> = Internal.createParameter("_2", SQLDataType.BIGINT, false, true)

        /**
         * The parameter <code>pg_catalog.array_in._3</code>.
         */
        val _3: Parameter<Int?> = Internal.createParameter("_3", SQLDataType.INTEGER, false, true)
    }

    init {
        returnParameter = ArrayIn.RETURN_VALUE
        addInParameter(ArrayIn._1)
        addInParameter(ArrayIn._2)
        addInParameter(ArrayIn._3)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(ArrayIn._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(ArrayIn._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Long?): Unit = setValue(ArrayIn._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Long?>): Unit {
        setField(ArrayIn._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Int?): Unit = setValue(ArrayIn._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Int?>): Unit {
        setField(ArrayIn._3, field)
    }
}
