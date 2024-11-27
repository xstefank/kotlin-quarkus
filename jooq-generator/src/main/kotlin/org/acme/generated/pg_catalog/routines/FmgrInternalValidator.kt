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
open class FmgrInternalValidator : AbstractRoutine<java.lang.Void>("fmgr_internal_validator", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter <code>pg_catalog.fmgr_internal_validator._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)
    }

    init {
        addInParameter(FmgrInternalValidator._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(FmgrInternalValidator._1, value)
}