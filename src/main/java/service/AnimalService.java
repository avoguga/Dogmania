package service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import dogmania.model.Animal;
import dogmania.repository.AnimalRepositoryJPA;

import java.util.List;

@ApplicationScoped
public class AnimalService {

    @Inject
    AnimalRepositoryJPA animalRepository;

    public List<Animal> listarTodos() {
        return this.animalRepository.listarTodos();
    }

    public void salvar(Animal animal) {
        this.animalRepository.salvar(animal);
    }

    public void remover(Animal animal) {
        this.animalRepository.remover(animal);
    }

}