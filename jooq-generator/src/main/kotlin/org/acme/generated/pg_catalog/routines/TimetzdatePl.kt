/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.OffsetTime

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
open class TimetzdatePl : AbstractRoutine<OffsetDateTime>("timetzdate_pl", PgCatalog.PG_CATALOG, SQLDataType.TIMESTAMPWITHTIMEZONE(6)) {
    companion object {

        /**
         * The parameter <code>pg_catalog.timetzdate_pl.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<OffsetDateTime?> = Internal.createParameter("RETURN_VALUE", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)

        /**
         * The parameter <code>pg_catalog.timetzdate_pl._1</code>.
         */
        val _1: Parameter<OffsetTime?> = Internal.createParameter("_1", SQLDataType.TIMEWITHTIMEZONE(6), false, true)

        /**
         * The parameter <code>pg_catalog.timetzdate_pl._2</code>.
         */
        val _2: Parameter<LocalDate?> = Internal.createParameter("_2", SQLDataType.LOCALDATE, false, true)
    }

    init {
        returnParameter = TimetzdatePl.RETURN_VALUE
        addInParameter(TimetzdatePl._1)
        addInParameter(TimetzdatePl._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: OffsetTime?): Unit = setValue(TimetzdatePl._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<OffsetTime?>): Unit {
        setField(TimetzdatePl._1, field)
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: LocalDate?): Unit = setValue(TimetzdatePl._2, value)

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__2(field: Field<LocalDate?>): Unit {
        setField(TimetzdatePl._2, field)
    }
}
