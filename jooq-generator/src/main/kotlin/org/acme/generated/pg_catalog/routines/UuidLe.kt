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
open class UuidLe : AbstractRoutine<Boolean>("uuid_le", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.uuid_le.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.uuid_le._1</code>.
         */
        val _1: Parameter<UUID?> = Internal.createParameter("_1", SQLDataType.UUID, false, true)

        /**
         * The parameter <code>pg_catalog.uuid_le._2</code>.
         */
        val _2: Parameter<UUID?> = Internal.createParameter("_2", SQLDataType.UUID, false, true)
    }

    init {
        returnParameter = UuidLe.RETURN_VALUE
        addInParameter(UuidLe._1)
        addInParameter(UuidLe._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: UUID?): Unit = setValue(UuidLe._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<UUID?>): Unit {
        setField(UuidLe._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: UUID?): Unit = setValue(UuidLe._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<UUID?>): Unit {
        setField(UuidLe._2, field)
    }
}