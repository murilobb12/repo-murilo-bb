package br.com.murilo.service;

import br.com.murilo.model.Pessoa;
import br.com.murilo.model.dto.IncluirPessoaDTO;
import br.com.murilo.repository.PessoaRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PessoaService {

    @Inject
    EntityManager entityManager;

    @Inject
    PessoaRepository pessoaRepository;

    public List<Pessoa> findPerson() {
        return pessoaRepository.listAll();
    }

    @Transactional
    public void insertPerson(List<IncluirPessoaDTO> dto) {


        for (int i = 0; i < dto.size(); i++) {
            Pessoa pessoa = new Pessoa();

            pessoa.setNome(dto.get(i).getNome());
            pessoa.setTipo(dto.get(i).getTipo());
            entityManager.persist(pessoa);

        }



//        pessoa.setNome(dto.getNome());
//        pessoa.setTipo(dto.getTipo());






    }

    public Pessoa findPersonById(Long id) {

        return pessoaRepository.findByIdOptional(id).orElseThrow(NotFoundException::new);

    }

}
