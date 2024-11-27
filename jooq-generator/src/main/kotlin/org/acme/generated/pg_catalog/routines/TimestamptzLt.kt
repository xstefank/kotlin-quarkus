/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


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
open class TimestamptzLt : AbstractRoutine<Boolean>("timestamptz_lt", PgCatalog.PG_CATALOG, SQLDataType.BOOLEAN) {
    companion object {

        /**
         * The parameter <code>pg_catalog.timestamptz_lt.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Boolean?> = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false)

        /**
         * The parameter <code>pg_catalog.timestamptz_lt._1</code>.
         */
        val _1: Parameter<OffsetDateTime?> = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)

        /**
         * The parameter <code>pg_catalog.timestamptz_lt._2</code>.
         */
        val _2: Parameter<OffsetDateTime?> = Internal.createParameter("_2", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)
    }

    init {
        returnParameter = TimestamptzLt.RETURN_VALUE
        addInParameter(TimestamptzLt._1)
        addInParameter(TimestamptzLt._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: OffsetDateTime?): Unit = setValue(TimestamptzLt._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<OffsetDateTime?>): Unit {
        setField(TimestamptzLt._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: OffsetDateTime?): Unit = setValue(TimestamptzLt._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<OffsetDateTime?>): Unit {
        setField(TimestamptzLt._2, field)
    }
}