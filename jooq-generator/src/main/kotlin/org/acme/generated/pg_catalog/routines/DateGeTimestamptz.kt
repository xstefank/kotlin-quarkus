/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.LocalDate
import java.time.OffsetDateTime

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
open class DateGeTimestamptz : AbstractRoutine<Boolean>("date_ge_timestamptz", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.date_ge_timestamptz.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.date_ge_timestamptz._1</code>.
         */
        val _1: Parameter<LocalDate?> = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true)

        /**
         * The parameter <code>pg_catalog.date_ge_timestamptz._2</code>.
         */
        val _2: Parameter<OffsetDateTime?> = Internal.createParameter("_2", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)
    }

    init {
        returnParameter = DateGeTimestamptz.RETURN_VALUE
        addInParameter(DateGeTimestamptz._1)
        addInParameter(DateGeTimestamptz._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: LocalDate?): Unit = setValue(DateGeTimestamptz._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<LocalDate?>): Unit {
        setField(DateGeTimestamptz._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: OffsetDateTime?): Unit = setValue(DateGeTimestamptz._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<OffsetDateTime?>): Unit {
        setField(DateGeTimestamptz._2, field)
    }
}
