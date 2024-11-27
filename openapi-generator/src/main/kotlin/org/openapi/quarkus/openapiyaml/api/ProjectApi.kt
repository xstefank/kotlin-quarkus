package org.openapi.quarkus.openapiyaml.api

import io.quarkiverse.openapi.generator.annotations.GeneratedClass
import io.quarkiverse.openapi.generator.annotations.GeneratedMethod
import io.quarkiverse.openapi.generator.annotations.GeneratedParam
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.*
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import org.openapi.quarkus.openapiyaml.model.CreatedProject
import org.openapi.quarkus.openapiyaml.model.GitHubCreatedRepository
import org.openapi.quarkus.openapiyaml.model.ProjectDefinition

/**
 * Quarkus bootstrap API
 *
 * API that helps bootstrap a Quarkus application
 */
@Path("/api")
@RegisterRestClient(configKey = "openapi_yaml")
@GeneratedClass(value = "openapi.yaml", tag = "Project")
@ApplicationScoped
interface ProjectApi {
    /**
     * Create project and push generated code to GitHub
     *
     * Create Project
     *
     * @param projectDefinition
     * @param gitHubCode
     * @param gitHubState
     */
    @POST
    @Path("/github/project")
    @Consumes("application/json")
    @Produces("application/json")
    @GeneratedMethod("")
    fun apiGithubProjectPost(

        @GeneratedParam("GitHub-Code") @HeaderParam("GitHub-Code") gitHubCode: String?,
        @GeneratedParam("GitHub-State") @HeaderParam("GitHub-State") gitHubState: String?, projectDefinition: ProjectDefinition?

    ): GitHubCreatedRepository?

    /**
     * Prepare a Quarkus application project to be downloaded
     *
     * Project
     *
     * @param projectDefinition
     */
    @POST
    @Path("/project")
    @Consumes("application/json")
    @Produces("application/json")
    @GeneratedMethod("")
    fun apiProjectPost(
        projectDefinition: ProjectDefinition?

    ): CreatedProject?
}
