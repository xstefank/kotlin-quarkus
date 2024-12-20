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
open class JsonbHashExtended : AbstractRoutine<Long>("jsonb_hash_extended", PgCatalog.PG_CATALOG, SQLDataType.BIGINT) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.jsonb_hash_extended.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Long?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.jsonb_hash_extended._1</code>.
         */
        val _1: Parameter<JSONB?> = Internal.createParameter("_1", SQLDataType.JSONB, false, true)

        /**
         * The parameter <code>pg_catalog.jsonb_hash_extended._2</code>.
         */
        val _2: Parameter<Long?> = Internal.createParameter("_2", SQLDataType.BIGINT, false, true)
    }

    init {
        returnParameter = JsonbHashExtended.RETURN_VALUE
        addInParameter(JsonbHashExtended._1)
        addInParameter(JsonbHashExtended._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: JSONB?): Unit = setValue(JsonbHashExtended._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<JSONB?>): Unit {
        setField(JsonbHashExtended._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Long?): Unit = setValue(JsonbHashExtended._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Long?>): Unit {
        setField(JsonbHashExtended._2, field)
    }
}
