package br.com.murilo.jwt;

import br.com.murilo.restClient.Pet;
import br.com.murilo.restClient.PetsProxy;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;


@ApplicationScoped
public class PetExternalService {

    @Inject
    @RestClient
    PetsProxy petService;

    public List<Pet> findByStatus(String status) {
        return petService.findByStatus(status);
    }

}
