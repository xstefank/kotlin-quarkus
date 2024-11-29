package org.acme

import org.openjdk.jmh.annotations.Benchmark

open class Benchmarks {

    @Benchmark
    fun benchmark() {
        println("Testing")
    }
}