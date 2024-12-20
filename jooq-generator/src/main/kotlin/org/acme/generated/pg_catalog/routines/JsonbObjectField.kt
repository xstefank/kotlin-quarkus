/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.JSONB
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonbObjectField : AbstractRoutine<JSONB>("jsonb_object_field", PgCatalog.PG_CATALOG, SQLDataType.JSONB) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.jsonb_object_field.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSONB?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_object_field.from_json</code>.
         */
        val FROM_JSON: Parameter<JSONB?> = Internal.createParameter("from_json", SQLDataType.JSONB, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_object_field.field_name</code>.
         */
        val FIELD_NAME: Parameter<String?> = Internal.createParameter("field_name", SQLDataType.CLOB, false, false)
    }

    init {
        returnParameter = JsonbObjectField.RETURN_VALUE
        addInParameter(JsonbObjectField.FROM_JSON)
        addInParameter(JsonbObjectField.FIELD_NAME)
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    fun setFromJson(value: JSONB?): Unit = setValue(JsonbObjectField.FROM_JSON, value)

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setFromJson(field: Field<JSONB?>): Unit {
        setField(JsonbObjectField.FROM_JSON, field)
    }

    /**
     * Set the <code>field_name</code> parameter IN value to the routine
     */
    fun setFieldName(value: String?): Unit = setValue(JsonbObjectField.FIELD_NAME, value)

    /**
     * Set the <code>field_name</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setFieldName(field: Field<String?>): Unit {
        setField(JsonbObjectField.FIELD_NAME, field)
    }
}
