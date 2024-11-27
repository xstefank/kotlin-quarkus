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
open class Date1 : AbstractRoutine<LocalDate>("date", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATE) {
    companion object {

        /**
         * The parameter <code>pg_catalog.date.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<LocalDate?> = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATE, false, false)

        /**
         * The parameter <code>pg_catalog.date._1</code>.
         */
        val _1: Parameter<OffsetDateTime?> = Internal.createParameter("_1", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, true)
    }

    init {
        returnParameter = Date1.RETURN_VALUE
        addInParameter(Date1._1)
        setOverloaded(true)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: OffsetDateTime?): Unit = setValue(Date1._1, value)

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    fun set__1(field: Field<OffsetDateTime?>): Unit {
        setField(Date1._1, field)
    }
}
