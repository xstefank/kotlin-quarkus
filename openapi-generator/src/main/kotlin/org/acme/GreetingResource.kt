package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.eclipse.microprofile.rest.client.inject.RestClient
import org.openapi.quarkus.openapiyaml.api.ExtensionsApi

@Path("/hello")
class GreetingResource(@RestClient var extensionApi: ExtensionsApi) {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        println(extensionApi.extensions(null, null))

        return "Hello from Quarkus REST"
    }
}