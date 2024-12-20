/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.DomainUdtUsage
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DomainUdtUsageRecord() : TableRecordImpl<DomainUdtUsageRecord>(DomainUdtUsage.DOMAIN_UDT_USAGE) {

    open var udtCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var udtSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var udtName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var domainCatalog: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var domainSchema: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var domainName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    /**
     * Create a detached, initialised DomainUdtUsageRecord
     */
    constructor(udtCatalog: String? = null, udtSchema: String? = null, udtName: String? = null, domainCatalog: String? = null, domainSchema: String? = null, domainName: String? = null): this() {
        this.udtCatalog = udtCatalog
        this.udtSchema = udtSchema
        this.udtName = udtName
        this.domainCatalog = domainCatalog
        this.domainSchema = domainSchema
        this.domainName = domainName
        resetChangedOnNotNull()
    }
}
