/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.`public`


import kotlin.collections.List

import org.acme.generated.DefaultCatalog
import org.jooq.Catalog
import org.jooq.Sequence
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Public : SchemaImpl("public", DefaultCatalog.DEFAULT_CATALOG) {
    public companion object {

        /**
         * The reference instance of <code>public</code>
         */
        val PUBLIC: Public = Public()
    }

    /**
     * The table <code>public.person</code>.
     */
    val PERSON: org.acme.generated.`public`.tables.Person get() = org.acme.generated.`public`.tables.Person.PERSON

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getSequences(): List<Sequence<*>> = listOf(
        org.acme.generated.`public`.sequences.PERSON_SEQ
    )

    override fun getTables(): List<Table<*>> = listOf(
        org.acme.generated.`public`.tables.Person.PERSON
    )
}
