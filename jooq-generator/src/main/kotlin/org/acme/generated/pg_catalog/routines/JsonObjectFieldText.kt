/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.JSON
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonObjectFieldText : AbstractRoutine<String>("json_object_field_text", PgCatalog.PG_CATALOG, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.json_object_field_text.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>pg_catalog.json_object_field_text.from_json</code>.
         */
        val FROM_JSON: Parameter<JSON?> = Internal.createParameter("from_json", SQLDataType.JSON, false, false)

        /**
         * The parameter
         * <code>pg_catalog.json_object_field_text.field_name</code>.
         */
        val FIELD_NAME: Parameter<String?> = Internal.createParameter("field_name", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = JsonObjectFieldText.RETURN_VALUE
        addInParameter(JsonObjectFieldText.FROM_JSON)
        addInParameter(JsonObjectFieldText.FIELD_NAME)
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    fun setFromJson(value: JSON?): Unit = setValue(JsonObjectFieldText.FROM_JSON, value)

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setFromJson(field: Field<JSON?>): Unit {
        setField(JsonObjectFieldText.FROM_JSON, field)
    }

    /**
     * Set the <code>field_name</code> parameter IN value to the routine
     */
    fun setFieldName(value: String?): Unit = setValue(JsonObjectFieldText.FIELD_NAME, value)

    /**
     * Set the <code>field_name</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setFieldName(field: Field<String?>): Unit {
        setField(JsonObjectFieldText.FIELD_NAME, field)
    }
}