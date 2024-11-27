/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.DSL
import org.jooq.impl.DefaultDataType
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbPathQueryArray : AbstractRoutine<JSONB>("jsonb_path_query_array", PgCatalog.PG_CATALOG, SQLDataType.JSONB) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.jsonb_path_query_array.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSONB?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_path_query_array.target</code>.
         */
        val TARGET: Parameter<JSONB?> = Internal.createParameter("target", SQLDataType.JSONB, false, false)
        @Deprecated(message = "Unknown data type. If this is a qualified, user-defined type, it may have been excluded from code generation. If this is a built-in type, you can define an explicit org.jooq.Binding to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.")
        val PATH: Parameter<Any?> = Internal.createParameter("path", DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonpath\""), false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_path_query_array.vars</code>.
         */
        val VARS: Parameter<JSONB?> = Internal.createParameter("vars", SQLDataType.JSONB.defaultValue(DSL.field(DSL.raw("'{}'::jsonb"), SQLDataType.JSONB)), true, false)

        /**
         * The parameter <code>pg_catalog.jsonb_path_query_array.silent</code>.
         */
        val SILENT: Parameter<Boolean?> = Internal.createParameter("silent", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), true, false)
    }

    init {
        returnParameter = JsonbPathQueryArray.RETURN_VALUE
        addInParameter(JsonbPathQueryArray.TARGET)
        addInParameter(JsonbPathQueryArray.PATH)
        addInParameter(JsonbPathQueryArray.VARS)
        addInParameter(JsonbPathQueryArray.SILENT)
    }

    /**
     * Set the <code>target</code> parameter IN value to the routine
     */
    fun setTarget(value: JSONB?): Unit = setValue(JsonbPathQueryArray.TARGET, value)

    /**
     * Set the <code>target</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setTarget(field: Field<JSONB?>): Unit {
        setField(JsonbPathQueryArray.TARGET, field)
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    fun setPath(value: Any?): Unit = setValue(JsonbPathQueryArray.PATH, value)

    /**
     * Set the <code>path</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setPath(field: Field<Any?>): Unit {
        setField(JsonbPathQueryArray.PATH, field)
    }

    /**
     * Set the <code>vars</code> parameter IN value to the routine
     */
    fun setVars(value: JSONB?): Unit = setValue(JsonbPathQueryArray.VARS, value)

    /**
     * Set the <code>vars</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setVars(field: Field<JSONB?>): Unit {
        setField(JsonbPathQueryArray.VARS, field)
    }

    /**
     * Set the <code>silent</code> parameter IN value to the routine
     */
    fun setSilent(value: Boolean?): Unit = setValue(JsonbPathQueryArray.SILENT, value)

    /**
     * Set the <code>silent</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setSilent(field: Field<Boolean?>): Unit {
        setField(JsonbPathQueryArray.SILENT, field)
    }
}