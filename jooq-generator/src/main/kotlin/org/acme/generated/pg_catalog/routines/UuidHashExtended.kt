/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.util.UUID

import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Field
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class UuidHashExtended : AbstractRoutine<Long>("uuid_hash_extended", PgCatalog.PG_CATALOG, SQLDataType.BIGINT) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.uuid_hash_extended.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Long?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BIGINT, false, false)

        /**
         * The parameter <code>pg_catalog.uuid_hash_extended._1</code>.
         */
        val _1: Parameter<UUID?> = Internal.createParameter("_1", SQLDataType.UUID, false, true)

        /**
         * The parameter <code>pg_catalog.uuid_hash_extended._2</code>.
         */
        val _2: Parameter<Long?> = Internal.createParameter("_2", SQLDataType.BIGINT, false, true)
    }

    init {
        returnParameter = UuidHashExtended.RETURN_VALUE
        addInParameter(UuidHashExtended._1)
        addInParameter(UuidHashExtended._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: UUID?): Unit = setValue(UuidHashExtended._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<UUID?>): Unit {
        setField(UuidHashExtended._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: Long?): Unit = setValue(UuidHashExtended._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<Long?>): Unit {
        setField(UuidHashExtended._2, field)
    }
}
