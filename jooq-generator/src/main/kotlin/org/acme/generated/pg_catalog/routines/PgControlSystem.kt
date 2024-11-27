/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.routines


import java.time.OffsetDateTime

import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgControlSystem : AbstractRoutine<java.lang.Void>("pg_control_system", PgCatalog.PG_CATALOG) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.pg_control_version</code>.
         */
        val PG_CONTROL_VERSION: Parameter<Int?> = Internal.createParameter("pg_control_version", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.catalog_version_no</code>.
         */
        val CATALOG_VERSION_NO: Parameter<Int?> = Internal.createParameter("catalog_version_no", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.system_identifier</code>.
         */
        val SYSTEM_IDENTIFIER: Parameter<Long?> = Internal.createParameter("system_identifier", SQLDataType.BIGINT, false, false)

        /**
         * The parameter
         * <code>pg_catalog.pg_control_system.pg_control_last_modified</code>.
         */
        val PG_CONTROL_LAST_MODIFIED: Parameter<OffsetDateTime?> = Internal.createParameter("pg_control_last_modified", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false)
    }

    init {
        addOutParameter(PgControlSystem.PG_CONTROL_VERSION)
        addOutParameter(PgControlSystem.CATALOG_VERSION_NO)
        addOutParameter(PgControlSystem.SYSTEM_IDENTIFIER)
        addOutParameter(PgControlSystem.PG_CONTROL_LAST_MODIFIED)
    }

    /**
     * Get the <code>pg_control_version</code> parameter OUT value from the
     * routine
     */
    fun getPgControlVersion(): Int? = get(PgControlSystem.PG_CONTROL_VERSION)

    /**
     * Get the <code>catalog_version_no</code> parameter OUT value from the
     * routine
     */
    fun getCatalogVersionNo(): Int? = get(PgControlSystem.CATALOG_VERSION_NO)

    /**
     * Get the <code>system_identifier</code> parameter OUT value from the
     * routine
     */
    fun getSystemIdentifier(): Long? = get(PgControlSystem.SYSTEM_IDENTIFIER)

    /**
     * Get the <code>pg_control_last_modified</code> parameter OUT value from
     * the routine
     */
    fun getPgControlLastModified(): OffsetDateTime? = get(PgControlSystem.PG_CONTROL_LAST_MODIFIED)
}