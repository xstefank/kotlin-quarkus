/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.pg_catalog.tables.records


import org.acme.generated.pg_catalog.tables.PgAggregate
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PgAggregateRecord() : UpdatableRecordImpl<PgAggregateRecord>(PgAggregate.PG_AGGREGATE) {

    open var aggfnoid: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    open var aggkind: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var aggnumdirectargs: Short?
        set(value): Unit = set(2, value)
        get(): Short? = get(2) as Short?

    open var aggtransfn: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var aggfinalfn: String?
        set(value): Unit = set(4, value)
        get(): String? = get(4) as String?

    open var aggcombinefn: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var aggserialfn: String?
        set(value): Unit = set(6, value)
        get(): String? = get(6) as String?

    open var aggdeserialfn: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    open var aggmtransfn: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var aggminvtransfn: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var aggmfinalfn: String?
        set(value): Unit = set(10, value)
        get(): String? = get(10) as String?

    open var aggfinalextra: Boolean?
        set(value): Unit = set(11, value)
        get(): Boolean? = get(11) as Boolean?

    open var aggmfinalextra: Boolean?
        set(value): Unit = set(12, value)
        get(): Boolean? = get(12) as Boolean?

    open var aggfinalmodify: String?
        set(value): Unit = set(13, value)
        get(): String? = get(13) as String?

    open var aggmfinalmodify: String?
        set(value): Unit = set(14, value)
        get(): String? = get(14) as String?

    open var aggsortop: Long?
        set(value): Unit = set(15, value)
        get(): Long? = get(15) as Long?

    open var aggtranstype: Long?
        set(value): Unit = set(16, value)
        get(): Long? = get(16) as Long?

    open var aggtransspace: Int?
        set(value): Unit = set(17, value)
        get(): Int? = get(17) as Int?

    open var aggmtranstype: Long?
        set(value): Unit = set(18, value)
        get(): Long? = get(18) as Long?

    open var aggmtransspace: Int?
        set(value): Unit = set(19, value)
        get(): Int? = get(19) as Int?

    open var agginitval: String?
        set(value): Unit = set(20, value)
        get(): String? = get(20) as String?

    open var aggminitval: String?
        set(value): Unit = set(21, value)
        get(): String? = get(21) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    /**
     * Create a detached, initialised PgAggregateRecord
     */
    constructor(aggfnoid: String? = null, aggkind: String? = null, aggnumdirectargs: Short? = null, aggtransfn: String? = null, aggfinalfn: String? = null, aggcombinefn: String? = null, aggserialfn: String? = null, aggdeserialfn: String? = null, aggmtransfn: String? = null, aggminvtransfn: String? = null, aggmfinalfn: String? = null, aggfinalextra: Boolean? = null, aggmfinalextra: Boolean? = null, aggfinalmodify: String? = null, aggmfinalmodify: String? = null, aggsortop: Long? = null, aggtranstype: Long? = null, aggtransspace: Int? = null, aggmtranstype: Long? = null, aggmtransspace: Int? = null, agginitval: String? = null, aggminitval: String? = null): this() {
        this.aggfnoid = aggfnoid
        this.aggkind = aggkind
        this.aggnumdirectargs = aggnumdirectargs
        this.aggtransfn = aggtransfn
        this.aggfinalfn = aggfinalfn
        this.aggcombinefn = aggcombinefn
        this.aggserialfn = aggserialfn
        this.aggdeserialfn = aggdeserialfn
        this.aggmtransfn = aggmtransfn
        this.aggminvtransfn = aggminvtransfn
        this.aggmfinalfn = aggmfinalfn
        this.aggfinalextra = aggfinalextra
        this.aggmfinalextra = aggmfinalextra
        this.aggfinalmodify = aggfinalmodify
        this.aggmfinalmodify = aggmfinalmodify
        this.aggsortop = aggsortop
        this.aggtranstype = aggtranstype
        this.aggtransspace = aggtransspace
        this.aggmtranstype = aggmtranstype
        this.aggmtransspace = aggmtransspace
        this.agginitval = agginitval
        this.aggminitval = aggminitval
        resetChangedOnNotNull()
    }
}
