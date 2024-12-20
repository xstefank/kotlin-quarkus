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
open class JsonExtractPath : AbstractRoutine<JSON>("json_extract_path", PgCatalog.PG_CATALOG, SQLDataType.JSON) {
    companion object {

        /**
         * The parameter <code>pg_catalog.json_extract_path.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<JSON?> = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false)

        /**
         * The parameter <code>pg_catalog.json_extract_path.from_json</code>.
         */
        val FROM_JSON: Parameter<JSON?> = Internal.createParameter("from_json", SQLDataType.JSON, false, false)

        /**
         * The parameter <code>pg_catalog.json_extract_path.path_elems</code>.
         */
        val PATH_ELEMS: Parameter<Array<String?>?> = Internal.createParameter("path_elems", SQLDataType.CLOB.array(), false, false)
    }

    init {
        returnParameter = JsonExtractPath.RETURN_VALUE
        addInParameter(JsonExtractPath.FROM_JSON)
        addInParameter(JsonExtractPath.PATH_ELEMS)
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    fun setFromJson(value: JSON?): Unit = setValue(JsonExtractPath.FROM_JSON, value)

    /**
     * Set the <code>from_json</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setFromJson(field: Field<JSON?>): Unit {
        setField(JsonExtractPath.FROM_JSON, field)
    }

    /**
     * Set the <code>path_elems</code> parameter IN value to the routine
     */
    fun setPathElems(value: Array<String?>?): Unit = setValue(JsonExtractPath.PATH_ELEMS, value)

    /**
     * Set the <code>path_elems</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    fun setPathElems(field: Field<Array<String?>?>): Unit {
        setField(JsonExtractPath.PATH_ELEMS, field)
    }
}
