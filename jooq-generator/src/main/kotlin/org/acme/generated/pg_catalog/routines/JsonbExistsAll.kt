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
open class JsonbExistsAll : AbstractRoutine<Boolean>("jsonb_exists_all", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.jsonb_exists_all.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_exists_all._1</code>.
         */
        val _1: Parameter<JSONB?> = Internal.createParameter("_1", SQLDataType.JSONB, false, true)

        /**
         * The parameter <code>pg_catalog.jsonb_exists_all._2</code>.
         */
        val _2: Parameter<Array<String?>?> = Internal.createParameter("_2", SQLDataType.CLOB.array(), false, true)
    }

    init {
        returnParameter = JsonbExistsAll.RETURN_VALUE
        addInParameter(JsonbExistsAll._1)
        addInParameter(JsonbExistsAll._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: JSONB?): Unit = setValue(JsonbExistsAll._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<JSONB?>): Unit {
        setField(JsonbExistsAll._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Array<String?>?): Unit = setValue(JsonbExistsAll._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Array<String?>?>): Unit {
        setField(JsonbExistsAll._2, field)
    }
}
