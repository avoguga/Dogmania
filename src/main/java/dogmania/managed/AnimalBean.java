package dogmania.managed;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dogmania.model.Animal;
import service.AnimalService;

@Named
@ViewScoped
public class AnimalBean implements Serializable {
	
 private static final long serialVersionUID = 1L;
 
 private Animal animal;
 
 @Inject
 private AnimalService animalService;
 
 public AnimalBean() {
	 
 this.animal = new Animal();
 }
 
 public List<Animal> getAnimais() {
 return this.animalService.listarTodos();
 }
 public String salvar() {
 this.animalService.salvar(animal);
 return "consultar?faces-redirect=true";
 }
 public Animal getAnimal() {
 return animal;
 }
 public void setAnimal(Animal animal) {
 this.animal = animal;
}
}