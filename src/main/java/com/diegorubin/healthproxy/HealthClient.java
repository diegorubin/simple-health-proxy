package com.diegorubin.healthproxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/health")
@RegisterRestClient(configKey = "service-api")
public interface HealthClient {

    @GET
    @Path("/live")
    String getLive();

    @GET
    @Path("/ready")
    String getReady();
}
