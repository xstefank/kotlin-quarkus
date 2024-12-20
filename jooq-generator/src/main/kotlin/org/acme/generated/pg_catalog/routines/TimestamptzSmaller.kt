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
open class TimestamptzSmaller : AbstractRoutine<OffsetDateTime>("timestamptz_smaller", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6)) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.timestamptz_smaller.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)

        /**
         * The parameter <code>pg_catalog.timestamptz_smaller._1</code>.
         */
        val _1: Parameter<OffsetDateTime?> = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)

        /**
         * The parameter <code>pg_catalog.timestamptz_smaller._2</code>.
         */
        val _2: Parameter<OffsetDateTime?> = Internal.createParameter("_2", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)
    }

    init {
        returnParameter = TimestamptzSmaller.RETURN_VALUE
        addInParameter(TimestamptzSmaller._1)
        addInParameter(TimestamptzSmaller._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: OffsetDateTime?): Unit = setValue(TimestamptzSmaller._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<OffsetDateTime?>): Unit {
        setField(TimestamptzSmaller._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: OffsetDateTime?): Unit = setValue(TimestamptzSmaller._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<OffsetDateTime?>): Unit {
        setField(TimestamptzSmaller._2, field)
    }
}
