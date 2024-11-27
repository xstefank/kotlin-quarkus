/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.Transforms
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TransformsRecord() : TableRecordImpl<TransformsRecord>(Transforms.TRANSFORMS) {

    open var udtCatalog: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var udtSchema: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var udtName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var specificCatalog: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var specificSchema: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var specificName: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var groupName: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var transformType: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    /**
     * Create a detached, initialised TransformsRecord
     */
    constructor(udtCatalog: String? = null, udtSchema: String? = null, udtName: String? = null, specificCatalog: String? = null, specificSchema: String? = null, specificName: String? = null, groupName: String? = null, transformType: String? = null): this() {
        this.udtCatalog = udtCatalog
        this.udtSchema = udtSchema
        this.udtName = udtName
        this.specificCatalog = specificCatalog
        this.specificSchema = specificSchema
        this.specificName = specificName
        this.groupName = groupName
        this.transformType = transformType
        resetChangedOnNotNull()
    }
}