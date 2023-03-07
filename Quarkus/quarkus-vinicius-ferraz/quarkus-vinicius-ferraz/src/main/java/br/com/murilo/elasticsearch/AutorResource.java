package br.com.murilo.elasticsearch;

import io.quarkus.runtime.StartupEvent;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/autores")
public class AutorResource {

    @Inject
    ElasticSearchService elasticsearchService;
    @Transactional
    void onStart(@Observes StartupEvent ev) throws InterruptedException {
        // elasticsearchService.rebuildIndexes();
    }

    // @GET
    // @Transactional
    // @Produces(MediaType.APPLICATION_JSON)
    // public List<Autor> searchAuthors(@QueryParam("termo") String termo, @QueryParam("tamanho") Optional<Integer> tamanho) {
    // 	return elasticsearchService.search(Autor.class, termo, tamanho, "nome", "livros.titulo", "livros.conteudo");
    // }

    @DELETE
    @Path("{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Autor.findById(id).delete();
    }
}