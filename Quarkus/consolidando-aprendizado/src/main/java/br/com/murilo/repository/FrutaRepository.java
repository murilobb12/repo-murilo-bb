package br.com.murilo.repository;

import br.com.murilo.model.Fruta;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FrutaRepository implements PanacheRepository<Fruta> {


}
