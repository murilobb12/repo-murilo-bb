package br.com.murilo.produtos;

import org.eclipse.microprofile.opentracing.Traced;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/produtos")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
@Traced
public class ProdutosResource {

    @Inject
    ProdutoService produtoService;

    @GET
    public Response getProduct(){
        return Response.status(Response.Status.OK.getStatusCode()).entity(produtoService.getProduto()).build();
    }

    @Path("/{id}")
    @GET
    public Response getProductById(@PathParam("id")Long id){
        return Response.status(Response.Status.OK.getStatusCode()).entity(produtoService.getProdutoById(id)).build();
    }

    @Path("/{id}")
    @PUT
    public Response updateProductById(@PathParam("id")Long id, Produto produto){
        return Response.status(Response.Status.OK).entity(produtoService.updateProduct(id, produto.getNome())).build();
    }

    @Path("/{id}")
    @DELETE
    public Response deleteProductById(@PathParam("id")Long id){

        produtoService.deleteProductById(id);

        return Response.status(Response.Status.OK.getStatusCode()).build();
    }



}
