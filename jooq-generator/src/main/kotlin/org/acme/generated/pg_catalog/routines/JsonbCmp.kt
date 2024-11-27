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
open class JsonbCmp : AbstractRoutine<Int>("jsonb_cmp", PgCatalog.PG_CATALOG, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter <code>pg_catalog.jsonb_cmp.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_cmp._1</code>.
         */
        val _1: Parameter<JSONB?> = Internal.createParameter("_1", SQLDataType.JSONB, false, true)

        /**
         * The parameter <code>pg_catalog.jsonb_cmp._2</code>.
         */
        val _2: Parameter<JSONB?> = Internal.createParameter("_2", SQLDataType.JSONB, false, true)
    }

    init {
        returnParameter = JsonbCmp.RETURN_VALUE
        addInParameter(JsonbCmp._1)
        addInParameter(JsonbCmp._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: JSONB?): Unit = setValue(JsonbCmp._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<JSONB?>): Unit {
        setField(JsonbCmp._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: JSONB?): Unit = setValue(JsonbCmp._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<JSONB?>): Unit {
        setField(JsonbCmp._2, field)
    }
}
