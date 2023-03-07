package br.com.murilo.pessoa;

import br.com.murilo.model.dto.IncluirPessoaDTO;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/pessoas")
public class PessoaResource {

    @Inject
    PessoaService pessoaService;

    @GET
    public Response findPerson() {
        return Response.status(Response.Status.OK).entity(pessoaService.findPerson()).build();
    }

    @Consumes(MediaType.APPLICATION_JSON)

    @POST
    public Response insertPerson(List<IncluirPessoaDTO> dto) {
        pessoaService.insertPerson(dto);
        return Response.status(Response.Status.CREATED.getStatusCode()).build();
    }


    @GET
    @Path("/{id}")
    public Response findPersonById(@PathParam("id") Long id){
        return Response.status(Response.Status.OK).entity(pessoaService.findPersonById(id)).build();
    }


}
