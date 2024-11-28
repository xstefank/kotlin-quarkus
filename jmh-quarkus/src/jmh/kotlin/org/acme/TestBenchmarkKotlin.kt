package org.acme

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State


@State(Scope.Benchmark)
open class TestBenchmarkKotlin(val greetingResource: GreetingResource = GreetingResource()) {

    @Benchmark
    fun init() {
        println("Kotlin ${greetingResource.hello()}")
    }
}