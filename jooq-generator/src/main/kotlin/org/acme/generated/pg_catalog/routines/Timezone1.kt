/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.LocalDateTime
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
open class Timezone1 : AbstractRoutine<LocalDateTime>("timezone", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATETIME(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.timezone.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATETIME(6), false, false)

        /**
         * The parameter <code>pg_catalog.timezone._1</code>.
         */
        val _1: Parameter<YearToSecond?> = Internal.createParameter("_1", SQLDataType.INTERVAL, false, true)

        /**
         * The parameter <code>pg_catalog.timezone._2</code>.
         */
        val _2: Parameter<OffsetDateTime?> = Internal.createParameter("_2", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)
    }

    init {
        returnParameter = Timezone1.RETURN_VALUE
        addInParameter(Timezone1._1)
        addInParameter(Timezone1._2)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: YearToSecond?): Unit = setValue(Timezone1._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<YearToSecond?>): Unit {
        setField(Timezone1._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: OffsetDateTime?): Unit = setValue(Timezone1._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<OffsetDateTime?>): Unit {
        setField(Timezone1._2, field)
    }
}
