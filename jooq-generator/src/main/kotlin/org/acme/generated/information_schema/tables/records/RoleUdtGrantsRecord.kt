/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.information_schema.tables.records


import org.acme.generated.information_schema.tables.RoleUdtGrants
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RoleUdtGrantsRecord() : TableRecordImpl<RoleUdtGrantsRecord>(RoleUdtGrants.ROLE_UDT_GRANTS) {

    open var grantor: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var grantee: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var udtCatalog: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var udtSchema: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var udtName: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var privilegeType: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsGrantable")
    open var isGrantable: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    /**
     * Create a detached, initialised RoleUdtGrantsRecord
     */
    constructor(grantor: String? = null, grantee: String? = null, udtCatalog: String? = null, udtSchema: String? = null, udtName: String? = null, privilegeType: String? = null, isGrantable: String? = null): this() {
        this.grantor = grantor
        this.grantee = grantee
        this.udtCatalog = udtCatalog
        this.udtSchema = udtSchema
        this.udtName = udtName
        this.privilegeType = privilegeType
        this.isGrantable = isGrantable
        resetChangedOnNotNull()
    }
}
