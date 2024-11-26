package org.acme.rest.client;

import io.quarkus.tls.TlsConfiguration;
import io.quarkus.tls.TlsConfigurationRegistry;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.security.KeyStoreException;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletionStage;

@Path("/extension")
public class ExtensionsResource {

    @RestClient
    ExtensionsService extensionsService;


    @GET
    @Path("/id/{id}")
    @Blocking
    public Set<Extension> id(String id) {
        return extensionsService.getById(id);
    }

    @GET
    @Path("/id-async/{id}")
    public CompletionStage<Set<Extension>> idAsync(String id) {
        return extensionsService.getByIdAsync(id);
    }

    @GET
    @Path("/id-uni/{id}")
    public Uni<Set<Extension>> idUni(String id) {
        return extensionsService.getByIdAsUni(id);
    }

    @GET
    public String get() {
        return extensionsService.get();
    }

    @Inject
    TlsConfigurationRegistry certificates;

    @GET
    @Path("/crts")
    public String crts() throws KeyStoreException {
        Optional<TlsConfiguration> aDefault = certificates.getDefault();
        return aDefault.toString();
    }
}
