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
open class Ginarrayconsistent : AbstractRoutine<Boolean>("ginarrayconsistent", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.ginarrayconsistent.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true)

        /**
         * The parameter <code>pg_catalog.ginarrayconsistent._2</code>.
         */
        val _2: Parameter<Short?> = Internal.createParameter("_2", SQLDataType.SMALLINT, false, true)

        /**
         * The parameter <code>pg_catalog.ginarrayconsistent._3</code>.
         */
        val _3: Parameter<Array<Any?>?> = Internal.createParameter("_3", SQLDataType.OTHER.array(), false, true)

        /**
         * The parameter <code>pg_catalog.ginarrayconsistent._4</code>.
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
        returnParameter = Ginarrayconsistent.RETURN_VALUE
        addInParameter(Ginarrayconsistent._1)
        addInParameter(Ginarrayconsistent._2)
        addInParameter(Ginarrayconsistent._3)
        addInParameter(Ginarrayconsistent._4)
        addInParameter(Ginarrayconsistent._5)
        addInParameter(Ginarrayconsistent._6)
        addInParameter(Ginarrayconsistent._7)
        addInParameter(Ginarrayconsistent._8)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(Ginarrayconsistent._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(Ginarrayconsistent._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Short?): Unit = setValue(Ginarrayconsistent._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Short?>): Unit {
        setField(Ginarrayconsistent._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Array<Any?>?): Unit = setValue(Ginarrayconsistent._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Array<Any?>?>): Unit {
        setField(Ginarrayconsistent._3, field)
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    fun set__4(value: Int?): Unit = setValue(Ginarrayconsistent._4, value)

    /**
     * Set the <code>_4</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__4(field: Field<Int?>): Unit {
        setField(Ginarrayconsistent._4, field)
    }

    /**
     * Set the <code>_5</code> parameter IN value to the routine
     */
    fun set__5(value: Any?): Unit = setValue(Ginarrayconsistent._5, value)

    /**
     * Set the <code>_5</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__5(field: Field<Any?>): Unit {
        setField(Ginarrayconsistent._5, field)
    }

    /**
     * Set the <code>_6</code> parameter IN value to the routine
     */
    fun set__6(value: Any?): Unit = setValue(Ginarrayconsistent._6, value)

    /**
     * Set the <code>_6</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__6(field: Field<Any?>): Unit {
        setField(Ginarrayconsistent._6, field)
    }

    /**
     * Set the <code>_7</code> parameter IN value to the routine
     */
    fun set__7(value: Any?): Unit = setValue(Ginarrayconsistent._7, value)

    /**
     * Set the <code>_7</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__7(field: Field<Any?>): Unit {
        setField(Ginarrayconsistent._7, field)
    }

    /**
     * Set the <code>_8</code> parameter IN value to the routine
     */
    fun set__8(value: Any?): Unit = setValue(Ginarrayconsistent._8, value)

    /**
     * Set the <code>_8</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__8(field: Field<Any?>): Unit {
        setField(Ginarrayconsistent._8, field)
    }
}
