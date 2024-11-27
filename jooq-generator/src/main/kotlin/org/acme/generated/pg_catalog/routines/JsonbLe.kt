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
open class JsonbLe : AbstractRoutine<Boolean>("jsonb_le", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.jsonb_le.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_le._1</code>.
         */
        val _1: Parameter<JSONB?> = Internal.createParameter("_1", SQLDataType.JSONB, false, true)

        /**
         * The parameter <code>pg_catalog.jsonb_le._2</code>.
         */
        val _2: Parameter<JSONB?> = Internal.createParameter("_2", SQLDataType.JSONB, false, true)
    }

    init {
        returnParameter = JsonbLe.RETURN_VALUE
        addInParameter(JsonbLe._1)
        addInParameter(JsonbLe._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: JSONB?): Unit = setValue(JsonbLe._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<JSONB?>): Unit {
        setField(JsonbLe._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: JSONB?): Unit = setValue(JsonbLe._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<JSONB?>): Unit {
        setField(JsonbLe._2, field)
    }
}
