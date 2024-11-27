/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgAuthMembers
import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgAuthMembersRecord() : UpdatableRecordImpl<PgAuthMembersRecord>(PgAuthMembers.PG_AUTH_MEMBERS) {

    open var roleid: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var member: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var grantor: Long?
        set(value): Unit = set(2, value)
        get(): Long? = get(2) as Long?

    open var adminOption: Boolean?
        set(value): Unit = set(3, value)
        get(): Boolean? = get(3) as Boolean?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Long?, Long?> = super.key() as Record2<Long?, Long?>

    /**
     * Create a detached, initialised PgAuthMembersRecord
     */
    constructor(roleid: Long? = null, member: Long? = null, grantor: Long? = null, adminOption: Boolean? = null): this() {
        this.roleid = roleid
        this.member = member
        this.grantor = grantor
        this.adminOption = adminOption
        resetChangedOnNotNull()
    }
}