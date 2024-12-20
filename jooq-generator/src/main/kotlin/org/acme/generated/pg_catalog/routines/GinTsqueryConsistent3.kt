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
open class GinTsqueryConsistent3 : AbstractRoutine<Boolean>("gin_tsquery_consistent", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.gin_tsquery_consistent.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)

        /**
         * The parameter <code>pg_catalog.gin_tsquery_consistent._2</code>.
         */
        val _2: Parameter<Short?> = Internal.createParameter("_2", SQLDataType.SMALLINT, false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _3: Parameter<Any?> = Internal.createParameter("_3", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsquery\""), false, true)

        /**
         * The parameter <code>pg_catalog.gin_tsquery_consistent._4</code>.
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
        returnParameter = GinTsqueryConsistent3.RETURN_VALUE
        addInParameter(GinTsqueryConsistent3._1)
        addInParameter(GinTsqueryConsistent3._2)
        addInParameter(GinTsqueryConsistent3._3)
        addInParameter(GinTsqueryConsistent3._4)
        addInParameter(GinTsqueryConsistent3._5)
        addInParameter(GinTsqueryConsistent3._6)
        addInParameter(GinTsqueryConsistent3._7)
        addInParameter(GinTsqueryConsistent3._8)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(GinTsqueryConsistent3._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(GinTsqueryConsistent3._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Short?): Unit = setValue(GinTsqueryConsistent3._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Short?>): Unit {
        setField(GinTsqueryConsistent3._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Any?): Unit = setValue(GinTsqueryConsistent3._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Any?>): Unit {
        setField(GinTsqueryConsistent3._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: Int?): Unit = setValue(GinTsqueryConsistent3._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<Int?>): Unit {
        setField(GinTsqueryConsistent3._4, field)
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    fun set__5(value: Any?): Unit = setValue(GinTsqueryConsistent3._5, value)

    /**
     * Set the <code>_5</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__5(field: Field<Any?>): Unit {
        setField(GinTsqueryConsistent3._5, field)
    }

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    fun set__6(value: Any?): Unit = setValue(GinTsqueryConsistent3._6, value)

    /**
     * Set the <code>_6</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__6(field: Field<Any?>): Unit {
        setField(GinTsqueryConsistent3._6, field)
    }

    /**
     * Set the <code>_7</code> parameter IN value to the routine
     */
    fun set__7(value: Any?): Unit = setValue(GinTsqueryConsistent3._7, value)

    /**
     * Set the <code>_7</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__7(field: Field<Any?>): Unit {
        setField(GinTsqueryConsistent3._7, field)
    }

    /**
     * Set the <code>_8</code> parameter IN value to the routine
     */
    fun set__8(value: Any?): Unit = setValue(GinTsqueryConsistent3._8, value)

    /**
     * Set the <code>_8</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__8(field: Field<Any?>): Unit {
        setField(GinTsqueryConsistent3._8, field)
    }
}
