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
open class BinaryUpgradeSetNextArrayPgTypeOid : AbstractRoutine<java.lang.Void>("binary_upgrade_set_next_array_pg_type_oid", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.binary_upgrade_set_next_array_pg_type_oid._1</code>.
         */
        val _1: Parameter<Long?> = Internal.createParameter("_1", SQLDataType.BIGINT, false, true)
    }

    init {
        addInParameter(BinaryUpgradeSetNextArrayPgTypeOid._1)
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    fun set__1(value: Long?): Unit = setValue(BinaryUpgradeSetNextArrayPgTypeOid._1, value)
}
