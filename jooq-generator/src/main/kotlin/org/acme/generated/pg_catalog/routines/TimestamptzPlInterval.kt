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
import org.jooq.types.YearToSecond


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TimestamptzPlInterval : AbstractRoutine<OffsetDateTime>("timestamptz_pl_interval", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6)) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.timestamptz_pl_interval.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)

        /**
         * The parameter <code>pg_catalog.timestamptz_pl_interval._1</code>.
         */
        val _1: Parameter<OffsetDateTime?> = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)

        /**
         * The parameter <code>pg_catalog.timestamptz_pl_interval._2</code>.
         */
        val _2: Parameter<YearToSecond?> = Internal.createParameter("_2", SQLDataType.INTERVAL, false, true)
    }

    init {
        returnParameter = TimestamptzPlInterval.RETURN_VALUE
        addInParameter(TimestamptzPlInterval._1)
        addInParameter(TimestamptzPlInterval._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: OffsetDateTime?): Unit = setValue(TimestamptzPlInterval._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<OffsetDateTime?>): Unit {
        setField(TimestamptzPlInterval._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: YearToSecond?): Unit = setValue(TimestamptzPlInterval._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<YearToSecond?>): Unit {
        setField(TimestamptzPlInterval._2, field)
    }
}