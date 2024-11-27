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
open class LsegNe : AbstractRoutine<Boolean>("lseg_ne", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.lseg_ne.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"lseg\""), false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _2: Parameter<Any?> = Internal.createParameter("_2", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"lseg\""), false, true)
    }

    init {
        returnParameter = LsegNe.RETURN_VALUE
        addInParameter(LsegNe._1)
        addInParameter(LsegNe._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(LsegNe._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(LsegNe._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Any?): Unit = setValue(LsegNe._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Any?>): Unit {
        setField(LsegNe._2, field)
    }
}
