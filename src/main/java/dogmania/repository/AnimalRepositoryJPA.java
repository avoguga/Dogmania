package dogmania.repository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import dogmania.model.Animal;

import java.io.Serializable;
import java.util.List;


public class AnimalRepositoryJPA implements Serializable {
	 private static final long serialVersionUID = 1L;

	 @Inject
	 private EntityManager manager;

	 public AnimalRepositoryJPA () {}
	 public void AnimalaRepositoryJPA (EntityManager manager) {
	    this.manager = manager ;
	 }
	 public void salvar(Animal animal) {
        manager.getTransaction().begin() ;
        manager.merge(animal) ;
        manager.getTransaction().commit() ;
	 }
	 public List<Animal> listarTodos () {
        CriteriaQuery<Animal> query = manager.getCriteriaBuilder().createQuery(Animal.class);
        query.select(query.from(Animal.class));
        
        List<Animal> lista = manager.createQuery(query).getResultList() ;

        return lista;
	 }
	public void remover(Animal animal) {
		// TODO Auto-generated method stub
		
	}
	}