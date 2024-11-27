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
open class PgNotificationQueueUsage : AbstractRoutine<Double>("pg_notification_queue_usage", PgCatalog.PG_CATALOG, SQLDataType.DOUBLE) {
    companion object {

        /**
         * The parameter
         * <code>pg_catalog.pg_notification_queue_usage.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Double?> = Internal.createParameter("RETURN_VALUE", SQLDataType.DOUBLE, false, false)
    }

    init {
        returnParameter = PgNotificationQueueUsage.RETURN_VALUE
    }
}
