package org.openapi.quarkus.openapiyaml.api

import io.quarkiverse.openapi.generator.annotations.GeneratedClass
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod
import io.quarkiverse.openapi.generator.annotations.GeneratedParam
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.*
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import org.openapi.quarkus.openapiyaml.model.CodeQuarkusExtension

/**
 * Quarkus bootstrap API
 *
 * API that helps bootstrap a Quarkus application
 */
@Path("/api/extensions")
@RegisterRestClient(configKey = "openapi_yaml")
@GeneratedClass(value = "openapi.yaml", tag = "Extensions")
@ApplicationScoped
interface ExtensionsApi {
    /**
     * Get the Quarkus Launcher list of Quarkus extensions
     *
     * Extensions
     *
     * @param id
     * @param platformOnly
     */
    @GET
    @Produces("application/json")
    @GeneratedMethod("extensions")
    fun extensions(
        @GeneratedParam("id") @QueryParam("id") id: String?,
        @GeneratedParam("platformOnly") @QueryParam("platformOnly") platformOnly: Boolean?

    ): List<CodeQuarkusExtension?>?

    /**
     * Get the Quarkus Launcher list of Quarkus extensions
     *
     * Extensions For Stream
     *
     * @param streamKey
     * @param id
     * @param platformOnly
     */
    @GET
    @Path("/stream/{streamKey}")
    @Produces("application/json")
    @GeneratedMethod("extensionsForStream")
    fun extensionsForStream(
        @GeneratedParam("streamKey") @PathParam("streamKey") streamKey: String?,
        @GeneratedParam("id") @QueryParam("id") id: String?,
        @GeneratedParam("platformOnly") @QueryParam("platformOnly") platformOnly: Boolean?

    ): List<CodeQuarkusExtension?>?
}
