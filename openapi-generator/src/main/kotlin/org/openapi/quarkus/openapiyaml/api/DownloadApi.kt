package org.openapi.quarkus.openapiyaml.api

import io.quarkiverse.openapi.generator.annotations.GeneratedClass
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod
import io.quarkiverse.openapi.generator.annotations.GeneratedParam
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.*
import jakarta.ws.rs.core.Response
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import org.openapi.quarkus.openapiyaml.model.ProjectDefinition

/**
 * Quarkus bootstrap API
 *
 * API that helps bootstrap a Quarkus application
 */
@Path("/api/download")
@RegisterRestClient(configKey = "openapi_yaml")
@GeneratedClass(value = "openapi.yaml", tag = "Download")
@ApplicationScoped
interface DownloadApi {
    /**
     * Download a custom Quarkus application with the provided settings
     *
     * Download
     *
     * @param projectDefinition
     */
    @POST
    @Consumes("application/json")
    @GeneratedMethod("")
    fun apiDownloadPost(
        projectDefinition: ProjectDefinition?

    ): Response?

    /**
     * Download a custom Quarkus application with the provided settings
     *
     * Get Download
     *
     * @param S The platform stream to use to create this project ('platformKey:streamId' or 'streamId')
     * @param a GAV: artifactId
     * @param b The build tool to use (MAVEN, GRADLE or GRADLE_KOTLIN_DSL)
     * @param c The class name to use in the generated application
     * @param e The set of extension ids that will be included in the generated application
     * @param g GAV: groupId
     * @param j The Java version for the generation application
     * @param nc No code
     * @param ne No code examples (Deprecated: use noCode (nc) instead)
     * @param p The path of the REST endpoint created in the generated application
     * @param v GAV: version
     */
    @GET
    @GeneratedMethod("downloadForStream")
    fun downloadForStream(
        @GeneratedParam("S") @QueryParam("S") S: String?,
        @GeneratedParam("a") @QueryParam("a") a: String?,
        @GeneratedParam("b") @QueryParam("b") b: String?,
        @GeneratedParam("c") @QueryParam("c") c: String?,
        @GeneratedParam("e") @QueryParam("e") e: Any?,
        @GeneratedParam("g") @QueryParam("g") g: String?,
        @GeneratedParam("j") @QueryParam("j") j: Int?,
        @GeneratedParam("nc") @QueryParam("nc") nc: Boolean?,
        @GeneratedParam("ne") @QueryParam("ne") ne: Any?,
        @GeneratedParam("p") @QueryParam("p") p: String?,
        @GeneratedParam("v") @QueryParam("v") v: String?

    ): Response?
}
