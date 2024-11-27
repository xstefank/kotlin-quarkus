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


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class GinConsistentJsonb : AbstractRoutine<Boolean>("gin_consistent_jsonb", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.gin_consistent_jsonb.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)

        /**
         * The parameter <code>pg_catalog.gin_consistent_jsonb._2</code>.
         */
        val _2: Parameter<Short?> = Internal.createParameter("_2", SQLDataType.SMALLINT, false, true)

        /**
         * The parameter <code>pg_catalog.gin_consistent_jsonb._3</code>.
         */
        val _3: Parameter<JSONB?> = Internal.createParameter("_3", SQLDataType.JSONB, false, true)

        /**
         * The parameter <code>pg_catalog.gin_consistent_jsonb._4</code>.
         */
        val _4: Parameter<Int?> = Internal.createParameter("_4", SQLDataType.INTEGER, false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _5: Parameter<Any?> = Internal.createParameter("_5", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _6: Parameter<Any?> = Internal.createParameter("_6", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _7: Parameter<Any?> = Internal.createParameter("_7", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _8: Parameter<Any?> = Internal.createParameter("_8", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)
    }

    init {
        returnParameter = GinConsistentJsonb.RETURN_VALUE
        addInParameter(GinConsistentJsonb._1)
        addInParameter(GinConsistentJsonb._2)
        addInParameter(GinConsistentJsonb._3)
        addInParameter(GinConsistentJsonb._4)
        addInParameter(GinConsistentJsonb._5)
        addInParameter(GinConsistentJsonb._6)
        addInParameter(GinConsistentJsonb._7)
        addInParameter(GinConsistentJsonb._8)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(GinConsistentJsonb._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(GinConsistentJsonb._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Short?): Unit = setValue(GinConsistentJsonb._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Short?>): Unit {
        setField(GinConsistentJsonb._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: JSONB?): Unit = setValue(GinConsistentJsonb._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<JSONB?>): Unit {
        setField(GinConsistentJsonb._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: Int?): Unit = setValue(GinConsistentJsonb._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<Int?>): Unit {
        setField(GinConsistentJsonb._4, field)
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    fun set__5(value: Any?): Unit = setValue(GinConsistentJsonb._5, value)

    /**
     * Set the <code>_5</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__5(field: Field<Any?>): Unit {
        setField(GinConsistentJsonb._5, field)
    }

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    fun set__6(value: Any?): Unit = setValue(GinConsistentJsonb._6, value)

    /**
     * Set the <code>_6</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__6(field: Field<Any?>): Unit {
        setField(GinConsistentJsonb._6, field)
    }

    /**
     * Set the <code>_7</code> parameter IN value to the routine
     */
    fun set__7(value: Any?): Unit = setValue(GinConsistentJsonb._7, value)

    /**
     * Set the <code>_7</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__7(field: Field<Any?>): Unit {
        setField(GinConsistentJsonb._7, field)
    }

    /**
     * Set the <code>_8</code> parameter IN value to the routine
     */
    fun set__8(value: Any?): Unit = setValue(GinConsistentJsonb._8, value)

    /**
     * Set the <code>_8</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__8(field: Field<Any?>): Unit {
        setField(GinConsistentJsonb._8, field)
    }
}