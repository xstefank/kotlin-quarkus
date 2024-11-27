package org.openapi.quarkus.openapiyaml.api

import io.quarkiverse.openapi.generator.annotations.GeneratedClass
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod
import io.quarkiverse.openapi.generator.annotations.GeneratedParam
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import jakarta.ws.rs.Produces
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import org.openapi.quarkus.openapiyaml.model.Preset

/**
 * Quarkus bootstrap API
 *
 * API that helps bootstrap a Quarkus application
 */
@Path("/api/presets")
@RegisterRestClient(configKey = "openapi_yaml")
@GeneratedClass(value = "openapi.yaml", tag = "Presets")
@ApplicationScoped
interface PresetsApi {
    /**
     * Get the Quarkus Launcher list of Presets
     *
     * Presets
     *
     */
    @GET
    @Produces("application/json")
    @GeneratedMethod("presets")
    fun presets(

    ): List<Preset?>?

    /**
     * Get the Quarkus Launcher list of Presets
     *
     * Presets For Stream
     *
     * @param streamKey
     */
    @GET
    @Path("/stream/{streamKey}")
    @Produces("application/json")
    @GeneratedMethod("presetsForStream")
    fun presetsForStream(
        @GeneratedParam("streamKey") @PathParam("streamKey") streamKey: String?

    ): List<Preset?>?
}
