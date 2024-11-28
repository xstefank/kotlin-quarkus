package org.acme;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class TestBenchmark {

    GreetingResource greetingResource = new GreetingResource();

//    @Benchmark
    public void init() {
        System.out.println(greetingResource.hello());
    }

}