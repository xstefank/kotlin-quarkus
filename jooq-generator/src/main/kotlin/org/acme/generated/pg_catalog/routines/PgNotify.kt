/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgNotify : AbstractRoutine<java.lang.Void>("pg_notify", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.pg_notify._1</code>.
         */
        val _1: Parameter<String?> = Internal.createParameter("_1", SQLDataType.CLOB, false, true)

        /**
         * The parameter <code>pg_catalog.pg_notify._2</code>.
         */
        val _2: Parameter<String?> = Internal.createParameter("_2", SQLDataType.CLOB, false, true)
    }

    init {
        addInParameter(PgNotify._1)
        addInParameter(PgNotify._2)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: String?): Unit = setValue(PgNotify._1, value)

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    fun set__2(value: String?): Unit = setValue(PgNotify._2, value)
}