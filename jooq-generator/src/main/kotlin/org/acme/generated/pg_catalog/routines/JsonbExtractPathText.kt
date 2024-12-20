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
open class JsonbExtractPathText : AbstractRoutine<String>("jsonb_extract_path_text", PgCatalog.PG_CATALOG, SQLDataType.CLOB) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.jsonb_extract_path_text.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<String?> = Internal.createParameter("RETURN_VALUE", SQLDataType.CLOB, false, false)

        /**
         * The parameter
         * <code>pg_catalog.jsonb_extract_path_text.from_json</code>.
         */
        val FROM_JSON: Parameter<JSONB?> = Internal.createParameter("from_json", SQLDataType.JSONB, false, false)

        /**
         * The parameter
         * <code>pg_catalog.jsonb_extract_path_text.path_elems</code>.
         */
        val PATH_ELEMS: Parameter<Array<String?>?> = Internal.createParameter("path_elems", SQLDataType.CLOB.array(), false, false)
    }

    init {
        returnParameter = JsonbExtractPathText.RETURN_VALUE
        addInParameter(JsonbExtractPathText.FROM_JSON)
        addInParameter(JsonbExtractPathText.PATH_ELEMS)
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    fun setFromJson(value: JSONB?): Unit = setValue(JsonbExtractPathText.FROM_JSON, value)

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setFromJson(field: Field<JSONB?>): Unit {
        setField(JsonbExtractPathText.FROM_JSON, field)
    }

    /**
     * Set the <code>path_elems</code> parameter IN value to the routine
     */
    fun setPathElems(value: Array<String?>?): Unit = setValue(JsonbExtractPathText.PATH_ELEMS, value)

    /**
     * Set the <code>path_elems</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setPathElems(field: Field<Array<String?>?>): Unit {
        setField(JsonbExtractPathText.PATH_ELEMS, field)
    }
}
