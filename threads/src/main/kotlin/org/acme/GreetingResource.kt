package org.acme

import io.smallrye.common.annotation.RunOnVirtualThread
import io.smallrye.mutiny.Uni
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello from Quarkus REST"

    @GET
    @Path("/blocking")
    fun blocking(): String {
        println(Thread.currentThread().name)
        return "Hello from Quarkus REST Blocking"
    }

    @GET
    @Path("/reactive")
    fun reactive(): Uni<String> {
        println(Thread.currentThread().name)
        return Uni.createFrom().item("Hello from Quarkus REST Reactive")
    }

    @GET
    @Path("/virtual-thread")
    @RunOnVirtualThread
    fun virtual(): String {
        println(Thread.currentThread().name)
        return "Hello from Quarkus REST Virtual"
    }



}

