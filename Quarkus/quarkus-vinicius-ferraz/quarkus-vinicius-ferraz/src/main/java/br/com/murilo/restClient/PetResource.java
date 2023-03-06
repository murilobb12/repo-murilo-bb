package br.com.murilo.restClient;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/pets")
public class PetResource {

    @Inject
    @RestClient
    PetsProxy proxy;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findByStatus")
    public List<Pet> findByStatus(@QueryParam("status")String status){
        return proxy.findByStatus("chiuaua");
    }







}
