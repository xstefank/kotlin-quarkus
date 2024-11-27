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
open class WinToUtf8 : AbstractRoutine<Int>("win_to_utf8", PgCatalog.PG_CATALOG, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>pg_catalog.win_to_utf8.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.win_to_utf8._1</code>.
         */
        val _1: Parameter<Int?> = Internal.createParameter("_1", SQLDataType.INTEGER, false, true)

        /**
         * The parameter <code>pg_catalog.win_to_utf8._2</code>.
         */
        val _2: Parameter<Int?> = Internal.createParameter("_2", SQLDataType.INTEGER, false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _3: Parameter<Any?> = Internal.createParameter("_3", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"cstring\""), false, true)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _4: Parameter<Any?> = Internal.createParameter("_4", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)

        /**
         * The parameter <code>pg_catalog.win_to_utf8._5</code>.
         */
        val _5: Parameter<Int?> = Internal.createParameter("_5", SQLDataType.INTEGER, false, true)

        /**
         * The parameter <code>pg_catalog.win_to_utf8._6</code>.
         */
        val _6: Parameter<Boolean?> = Internal.createParameter("_6", SQLDataType.BOOLEAN, false, true)
    }

    init {
        returnParameter = WinToUtf8.RETURN_VALUE
        addInParameter(WinToUtf8._1)
        addInParameter(WinToUtf8._2)
        addInParameter(WinToUtf8._3)
        addInParameter(WinToUtf8._4)
        addInParameter(WinToUtf8._5)
        addInParameter(WinToUtf8._6)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Int?): Unit = setValue(WinToUtf8._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Int?>): Unit {
        setField(WinToUtf8._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Int?): Unit = setValue(WinToUtf8._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Int?>): Unit {
        setField(WinToUtf8._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Any?): Unit = setValue(WinToUtf8._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Any?>): Unit {
        setField(WinToUtf8._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: Any?): Unit = setValue(WinToUtf8._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<Any?>): Unit {
        setField(WinToUtf8._4, field)
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    fun set__5(value: Int?): Unit = setValue(WinToUtf8._5, value)

    /**
     * Set the <code>_5</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__5(field: Field<Int?>): Unit {
        setField(WinToUtf8._5, field)
    }

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    fun set__6(value: Boolean?): Unit = setValue(WinToUtf8._6, value)

    /**
     * Set the <code>_6</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__6(field: Field<Boolean?>): Unit {
        setField(WinToUtf8._6, field)
    }
}
