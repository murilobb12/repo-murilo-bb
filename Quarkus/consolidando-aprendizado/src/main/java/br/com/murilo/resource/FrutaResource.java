package br.com.murilo.resource;

import br.com.murilo.model.Fruta;
import br.com.murilo.service.FrutaService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/frutas")
@ApplicationScoped
public class FrutaResource {

    @Inject
    FrutaService service;



    @POST
    public Response insertFruit(Fruta fruta){
        return Response.status(Response.Status.CREATED.getStatusCode()).entity(service.insertFruit(fruta)).build();
    }

    @GET
    public Response listFruits(){
        return Response.status(Response.Status.OK.getStatusCode()).entity(service.listFruits()).build();
    }

    @Path("/{id}")
    @PUT
    public Response updateFruit(Fruta fruta, @PathParam("id") Long id){
        return Response.status(Response.Status.OK.getStatusCode()).entity(service.updateFruit(fruta, id)).build();
    }


    @Path("/{id}")
    @DELETE
    public Response deleteFruit(@PathParam("id") Long id) {
        return Response.status(Response.Status.OK.getStatusCode()).entity(service.deleteFruit(id)).build();
    }

    @Path("/{id}")
    @GET
    public Response listFruitById(@PathParam("id") Long id){
        return Response.status(Response.Status.OK.getStatusCode()).entity(service.listFruitById(id)).build();
    }



}
