package com.oberdan.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.oberdan.livraria.modelo.Autor;

@Stateless
//@Interceptors({LogInterceptor.class})
public class AutorDao {

	//@Inject
	//private Banco banco;

	@PersistenceContext
	EntityManager manager;

	public void salva(Autor autor) {
		//banco.save(autor);
		manager.persist(autor);

		// Chamada service externo que gera erro
		//throw new RuntimeException("Serviço externo com erro!");
	}

	public List<Autor> todosAutores() {
		//return banco.listaAutores();
		return manager.createQuery("select a from Autor a", Autor.class).getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		//Autor autor = this.banco.buscaPelaId(autorId);
		Autor autor = manager.find(Autor.class, autorId);
		return autor;
	}

	@PostConstruct
	void aposCriacao() {
		System.out.println("AutorDao foi criado");
	}

}
