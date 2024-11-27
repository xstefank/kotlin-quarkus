/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.Aclexplode
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class AclexplodeRecord() : TableRecordImpl<AclexplodeRecord>(Aclexplode.ACLEXPLODE) {

    open var grantor: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var grantee: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var privilegeType: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    @Suppress("INAPPLICABLE_JVM_NAME")
    @set:JvmName("setIsGrantable")
    open var isGrantable: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    /**
     * Create a detached, initialised AclexplodeRecord
     */
    constructor(grantor: Long? = null, grantee: Long? = null, privilegeType: String? = null, isGrantable: Boolean? = null): this() {
        this.grantor = grantor
        this.grantee = grantee
        this.privilegeType = privilegeType
        this.isGrantable = isGrantable
        resetChangedOnNotNull()
    }
}