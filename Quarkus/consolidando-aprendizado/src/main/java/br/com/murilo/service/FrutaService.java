package br.com.murilo.service;

import br.com.murilo.model.Fruta;
import br.com.murilo.repository.FrutaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class FrutaService {

    @Inject
    FrutaRepository repository;

    @Inject
    EntityManager em;

    @Transactional
    public Fruta insertFruit(Fruta fruta) {
        em.persist(fruta);
        return fruta;
    }

    @Transactional
    public Fruta deleteFruit(Long id) {
        Fruta fruta = repository.findByIdOptional(id).orElseThrow(NotFoundException::new);
        repository.delete(fruta);
        return fruta;
    }

    public List<Fruta> listFruits() {
        return repository.listAll();
    }

    @Transactional
    public Fruta updateFruit(Fruta fruta, Long id){
        Fruta frutaId = repository.findByIdOptional(id).orElseThrow(NotFoundException::new);
        frutaId.setNome(fruta.getNome());
        frutaId.setPeso(fruta.getPeso());
        em.persist(frutaId);
        return frutaId;
    }

    public Fruta listFruitById(Long id){
        return repository.findByIdOptional(id).orElseThrow(NotFoundException::new);
    }



}
