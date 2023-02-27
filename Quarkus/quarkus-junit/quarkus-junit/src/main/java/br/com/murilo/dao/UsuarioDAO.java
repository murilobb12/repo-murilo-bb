package br.com.murilo.dao;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@RequestScoped
public class UsuarioDAO {

    @Inject
    EntityManager em;




}
