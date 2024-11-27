/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


@Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
@Suppress("UNCHECKED_CAST")
open class ToTsvector3 : AbstractRoutine<Any>("to_tsvector", PgCatalog.PG_CATALOG, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\"")) {
    companion object {
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val RETURN_VALUE: Parameter<Any?> = Internal.createParameter("RETURN_VALUE", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""), false, false)

        /**
         * The parameter <code>pg_catalog.to_tsvector._1</code>.
         */
        val _1: Parameter<JSONB?> = Internal.createParameter("_1", SQLDataType.JSONB, false, true)
    }

    init {
        returnParameter = ToTsvector3.RETURN_VALUE
        addInParameter(ToTsvector3._1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: JSONB?): Unit = setValue(ToTsvector3._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<JSONB?>): Unit {
        setField(ToTsvector3._1, field)
    }
}
