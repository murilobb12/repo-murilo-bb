package br.com.murilo.jwt;

import br.com.murilo.restClient.Pet;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/animais")
public class AnimalResource {

    @Inject
    PetExternalService petExternalService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Animal> buscarTodos() {
        return Animal.listAll();
    }

    @GET
    @Path("/{idAnimal}")
    public Animal buscarUm(@PathParam("idAnimal") Long idAnimal) {
        Animal animal = Animal.findById(idAnimal);
        if (animal == null) {
            throw new NotFoundException();
        }
        return animal;
    }

    @POST
    @Transactional
    public Animal cadastrarAnimal(CadastrarAnimalDTO dto) {
        Animal animal = new Animal();
        animal.setNome(dto.getNome());
        animal.setPeso(dto.getPeso());
        animal.persist();
        return animal;
    }

    @DELETE
    @Path("/{idAnimal}")
    @Transactional
    public void apagar(@PathParam("idAnimal") Long idAnimal) {
        Animal.findById(idAnimal).delete();

    }

    @PUT
    @Path("/{idAnimal}")
    @Transactional
    public Animal atualizar(@PathParam("idAnimal") Long idAnimal, AtualizarAnimalDTO dto) {
        Animal animal = Animal.findById(idAnimal);
        animal.setNome(dto.getNome());
        animal.persist();
        return animal;
    }

    @GET
    @Path("dados-externos")
    public List<Pet> buscarUmExterno() {
        return petExternalService.findByStatus("available");
    }




}
