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
open class PgGetExpr1 : AbstractRoutine<String>("pg_get_expr", PgCatalog.PG_CATALOG, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_get_expr.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), false, true)

        /**
         * The parameter <code>pg_catalog.pg_get_expr._2</code>.
         */
        val _2: Parameter<Long?> = Internal.createParameter("_2", SQLDataType.BIGINT, false, true)
    }

    init {
        returnParameter = PgGetExpr1.RETURN_VALUE
        addInParameter(PgGetExpr1._1)
        addInParameter(PgGetExpr1._2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(PgGetExpr1._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(PgGetExpr1._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Long?): Unit = setValue(PgGetExpr1._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Long?>): Unit {
        setField(PgGetExpr1._2, field)
    }
}
