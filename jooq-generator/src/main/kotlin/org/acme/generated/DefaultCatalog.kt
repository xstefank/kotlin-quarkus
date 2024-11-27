/*
 * This file is generated by jOOQ.
 */
package org.acme.generated


import kotlin.collections.List

import org.acme.generated.information_schema.InformationSchema
import org.acme.generated.pg_catalog.PgCatalog
import org.jooq.Constants
import org.jooq.Schema
import org.jooq.impl.CatalogImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DefaultCatalog : CatalogImpl("") {
    companion object {

        /**
         * The reference instance of <code>DEFAULT_CATALOG</code>
         */
        public val DEFAULT_CATALOG: DefaultCatalog = DefaultCatalog()
    }

    /**
     * The schema <code>information_schema</code>.
     */
    val INFORMATION_SCHEMA: InformationSchema get(): InformationSchema = InformationSchema.INFORMATION_SCHEMA

    /**
     * The schema <code>pg_catalog</code>.
     */
    val PG_CATALOG: PgCatalog get(): PgCatalog = PgCatalog.PG_CATALOG

    /**
     * The schema <code>public</code>.
     */
    val PUBLIC: org.acme.generated.`public`.Public get(): org.acme.generated.`public`.Public = org.acme.generated.`public`.Public.PUBLIC

    override fun getSchemas(): List<Schema> = listOf(
        InformationSchema.INFORMATION_SCHEMA,
        PgCatalog.PG_CATALOG,
        org.acme.generated.`public`.Public.PUBLIC
    )

    /**
     * A reference to the 3.19 minor release of the code generator. If this
     * doesn't compile, it's because the runtime library uses an older minor
     * release, namely: 3.19. You can turn off the generation of this reference
     * by specifying /configuration/generator/generate/jooqVersionReference
     */
    private val REQUIRE_RUNTIME_JOOQ_VERSION = Constants.VERSION_3_19
}