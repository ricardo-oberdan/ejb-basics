package com.oberdan.livraria.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.oberdan.livraria.modelo.Usuario;

@Stateless
public class UsuarioDao {

	// private Banco banco = new Banco();

	@PersistenceContext
	EntityManager manager;

	public Usuario buscaPeloLogin(String login) {
		// return this.banco.buscaPeloNome(login);

		return manager.createQuery("select u from Usuario u where u.login=:pLogin", Usuario.class)
				.setParameter("pLogin", login).getSingleResult();
	}

}
