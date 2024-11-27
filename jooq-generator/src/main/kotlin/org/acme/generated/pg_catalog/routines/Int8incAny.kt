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
open class Int8incAny : AbstractRoutine<Long>("int8inc_any", PgCatalog.PG_CATALOG, SQLDataType.BIGINT) {
    companion object {

        /**
         * The parameter <code>pg_catalog.int8inc_any.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Long?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.int8inc_any._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _2: Parameter<Any?> = Internal.createParameter("_2", SQLDataType.OTHER, false, true)
    }

    init {
        returnParameter = Int8incAny.RETURN_VALUE
        addInParameter(Int8incAny._1)
        addInParameter(Int8incAny._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(Int8incAny._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Long?>): Unit {
        setField(Int8incAny._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Any?): Unit = setValue(Int8incAny._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Any?>): Unit {
        setField(Int8incAny._2, field)
    }
}