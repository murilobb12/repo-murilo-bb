package br.com.murilo.resource;

import br.com.murilo.model.Produto;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Path("/produtos")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class ProdutosResource {

    @Inject
    EntityManager em;

    @GET
    public List<Produto> getProduto(){
        return em.createQuery("SELECT p FROM PRODUTO p", Produto.class).getResultList();
    }

    @Transactional
    @POST
    public void insertProduct(Produto produto){
        produto.setNome(produto.getNome());
        em.persist(produto);
    }

    @Transactional
    @PUT
    @Path("/{id}/{novoNome}")
    public void updateProduct(@PathParam("id")Long id, @PathParam("novoNome")String novoNome){


        try {
            Produto produtoEncontrado = em.createQuery("SELECT p FROM PRODUTO p WHERE p.id LIKE :id", Produto.class).setParameter("id", id).getSingleResult();
            produtoEncontrado.setNome(novoNome);
            em.persist(produtoEncontrado);
        }catch (NoResultException e){
            throw new NotFoundException();
        }


    }

}
