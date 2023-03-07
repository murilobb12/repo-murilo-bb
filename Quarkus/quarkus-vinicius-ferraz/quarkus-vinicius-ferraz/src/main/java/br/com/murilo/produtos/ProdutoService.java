package br.com.murilo.produtos;

import br.com.murilo.produtos.Produto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import java.util.List;
@ApplicationScoped
public class ProdutoService implements PanacheRepository<Produto> {


    @Inject
    EntityManager em;


    @GET
    public List<Produto> getProduto() {
        return em.createQuery("SELECT p FROM PRODUTO p", Produto.class).getResultList();
    }

//    @Transactional
//    public void insertProduct(Produto produto) {
//        produto.setNome(produto.getNome());
//        em.persist(produto);
//    }


    public Produto getProdutoById(Long id) {

        try {
            return em.createQuery("SELECT p FROM PRODUTO p WHERE p.id = :id", Produto.class).setParameter("id", id).getSingleResult();
        } catch (NoResultException e) {
            throw new NotFoundException(e);
        }
    }

    @Transactional
    public Produto updateProduct(Long id, String novoNome) {

        try {
            Produto produtoEncontrado = em.createQuery("SELECT p FROM PRODUTO p WHERE p.id LIKE :id", Produto.class).setParameter("id", id).getSingleResult();
            produtoEncontrado.setNome(novoNome);
            em.persist(produtoEncontrado);
            return produtoEncontrado;
        } catch (NoResultException e) {
            throw new NotFoundException();
        }

    }

    @Transactional
    public void deleteProductById(Long id){

        TypedQuery<Produto> produtoEncontrado = em.createQuery("SELECT p FROM PRODUTO p WHERE p.id LIKE :id", Produto.class).setParameter("id", id);

        delete(produtoEncontrado.getSingleResult());


    }



}