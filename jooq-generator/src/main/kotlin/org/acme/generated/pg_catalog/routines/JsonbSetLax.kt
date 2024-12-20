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
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbSetLax : AbstractRoutine<JSONB>("jsonb_set_lax", PgCatalog.PG_CATALOG, SQLDataType.JSONB) {
    companion object {

        /**
         * The parameter <code>pg_catalog.jsonb_set_lax.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSONB?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_set_lax.jsonb_in</code>.
         */
        val JSONB_IN: Parameter<JSONB?> = Internal.createParameter("jsonb_in", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_set_lax.path</code>.
         */
        val PATH: Parameter<Array<String?>?> = Internal.createParameter("path", SQLDataType.CLOB.array(), false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_set_lax.replacement</code>.
         */
        val REPLACEMENT: Parameter<JSONB?> = Internal.createParameter("replacement", SQLDataType.JSONB, false, false)

        /**
         * The parameter
         * <code>pg_catalog.jsonb_set_lax.create_if_missing</code>.
         */
        val CREATE_IF_MISSING: Parameter<Boolean?> = Internal.createParameter("create_if_missing", SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("true"), SQLDataType.BOOLEAN)), true, false)

        /**
         * The parameter
         * <code>pg_catalog.jsonb_set_lax.null_value_treatment</code>.
         */
        val NULL_VALUE_TREATMENT: Parameter<String?> = Internal.createParameter("null_value_treatment", SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("'use_json_null'::text"), SQLDataType.CLOB)), true, false)
    }

    init {
        returnParameter = JsonbSetLax.RETURN_VALUE
        addInParameter(JsonbSetLax.JSONB_IN)
        addInParameter(JsonbSetLax.PATH)
        addInParameter(JsonbSetLax.REPLACEMENT)
        addInParameter(JsonbSetLax.CREATE_IF_MISSING)
        addInParameter(JsonbSetLax.NULL_VALUE_TREATMENT)
    }

    /**
     * Set the <code>jsonb_in</code> parameter IN value to the routine
     */
    fun setJsonbIn(value: JSONB?): Unit = setValue(JsonbSetLax.JSONB_IN, value)

    /**
     * Set the <code>jsonb_in</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setJsonbIn(field: Field<JSONB?>): Unit {
        setField(JsonbSetLax.JSONB_IN, field)
    }

    /**
     * Set the <code>path</code> parameter IN value to the routine
     */
    fun setPath(value: Array<String?>?): Unit = setValue(JsonbSetLax.PATH, value)

    /**
     * Set the <code>path</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun setPath(field: Field<Array<String?>?>): Unit {
        setField(JsonbSetLax.PATH, field)
    }

    /**
     * Set the <code>replacement</code> parameter IN value to the routine
     */
    fun setReplacement(value: JSONB?): Unit = setValue(JsonbSetLax.REPLACEMENT, value)

    /**
     * Set the <code>replacement</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    fun setReplacement(field: Field<JSONB?>): Unit {
        setField(JsonbSetLax.REPLACEMENT, field)
    }

    /**
     * Set the <code>create_if_missing</code> parameter IN value to the routine
     */
    fun setCreateIfMissing(value: Boolean?): Unit = setValue(JsonbSetLax.CREATE_IF_MISSING, value)

    /**
     * Set the <code>create_if_missing</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    fun setCreateIfMissing(field: Field<Boolean?>): Unit {
        setField(JsonbSetLax.CREATE_IF_MISSING, field)
    }

    /**
     * Set the <code>null_value_treatment</code> parameter IN value to the
     * routine
     */
    fun setNullValueTreatment(value: String?): Unit = setValue(JsonbSetLax.NULL_VALUE_TREATMENT, value)

    /**
     * Set the <code>null_value_treatment</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    fun setNullValueTreatment(field: Field<String?>): Unit {
        setField(JsonbSetLax.NULL_VALUE_TREATMENT, field)
    }
}
