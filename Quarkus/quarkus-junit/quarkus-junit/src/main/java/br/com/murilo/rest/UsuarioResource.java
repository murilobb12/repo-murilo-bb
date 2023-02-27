package br.com.murilo.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("/usuarios")
public class UsuarioResource {




//    @Path("/named")
//    @GET
//    public Response listarUsuario2(){
//
//        return Response.status(Response.Status.OK).entity(dao.listarUsuarios()).build();
//
//    }


}
