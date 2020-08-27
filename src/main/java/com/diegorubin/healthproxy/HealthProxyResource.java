package com.diegorubin.healthproxy;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/health")
public class HealthProxyResource {

    @Inject
    @RestClient
    HealthClient client;

    @GET
    @Path("/live")
    @Produces(MediaType.APPLICATION_JSON)
    public String live() {
        return client.getLive();
    }

    @GET
    @Path("/ready")
    @Produces(MediaType.APPLICATION_JSON)
    public String ready() {
        return client.getReady();
    }
}
