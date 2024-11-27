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
open class Setweight1 : AbstractRoutine<Any>("setweight", PgCatalog.PG_CATALOG, DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\"")) {
    companion object {
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val RETURN_VALUE: Parameter<Any?> = Internal.createParameter("RETURN_VALUE", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""), false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val _1: Parameter<Any?> = Internal.createParameter("_1", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tsvector\""), false, true)

        /**
         * The parameter <code>pg_catalog.setweight._2</code>.
         */
        val _2: Parameter<String?> = Internal.createParameter("_2", SQLDataType.CHAR, false, true)

        /**
         * The parameter <code>pg_catalog.setweight._3</code>.
         */
        val _3: Parameter<Array<String?>?> = Internal.createParameter("_3", SQLDataType.CLOB.array(), false, true)
    }

    init {
        returnParameter = Setweight1.RETURN_VALUE
        addInParameter(Setweight1._1)
        addInParameter(Setweight1._2)
        addInParameter(Setweight1._3)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Any?): Unit = setValue(Setweight1._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<Any?>): Unit {
        setField(Setweight1._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: String?): Unit = setValue(Setweight1._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<String?>): Unit {
        setField(Setweight1._2, field)
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    fun set__3(value: Array<String?>?): Unit = setValue(Setweight1._3, value)

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__3(field: Field<Array<String?>?>): Unit {
        setField(Setweight1._3, field)
    }
}
