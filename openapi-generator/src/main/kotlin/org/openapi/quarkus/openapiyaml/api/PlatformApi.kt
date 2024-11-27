package org.openapi.quarkus.openapiyaml.api

import io.quarkiverse.openapi.generator.annotations.GeneratedClass
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import org.openapi.quarkus.openapiyaml.model.PlatformCatalog
import org.openapi.quarkus.openapiyaml.model.Stream

/**
 * Quarkus bootstrap API
 *
 * API that helps bootstrap a Quarkus application
 */
@Path("/api")
@RegisterRestClient(configKey = "openapi_yaml")
@GeneratedClass(value = "openapi.yaml", tag = "Platform")
@ApplicationScoped
interface PlatformApi {
    /**
     * Get all available platforms
     *
     * Platforms
     *
     */
    @GET
    @Path("/platforms")
    @Produces("application/json")
    @GeneratedMethod("")
    fun apiPlatformsGet(

    ): PlatformCatalog?

    /**
     * Get all available streams
     *
     * Streams
     *
     */
    @GET
    @Path("/streams")
    @Produces("application/json")
    @GeneratedMethod("")
    fun apiStreamsGet(

    ): List<Stream?>?
}
