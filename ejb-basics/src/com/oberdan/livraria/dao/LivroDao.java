package com.oberdan.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.oberdan.livraria.modelo.Livro;

@Stateless
//@Interceptors({LogInterceptor.class})
public class LivroDao {

	// @Inject
	// private Banco banco;

	@PersistenceContext
	EntityManager manager;

	public void salva(Livro livro) {
		// banco.save(livro);
		manager.persist(livro);
	}

	public List<Livro> todosLivros() {
		// return banco.listaLivros();
		return manager.createQuery("select l from Livro l", Livro.class).getResultList();
	}

	public List<Livro> buscaLivrosPeloNome(String nome) {
		return manager.createQuery("select l from Livro l where upper(l.titulo) like :pNome", Livro.class)
				.setParameter("pNome", "%" + nome.toUpperCase() + "%").getResultList();
	}

}
