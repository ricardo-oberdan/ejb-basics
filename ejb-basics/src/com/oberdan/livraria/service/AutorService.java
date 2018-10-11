package com.oberdan.livraria.service;

import java.util.List;

import javax.inject.Inject;

import com.oberdan.livraria.dao.AutorDao;
import com.oberdan.livraria.modelo.Autor;

public class AutorService {

	@Inject
	AutorDao dao;

	public void salva(Autor autor) {
		dao.salva(autor);

		//Regra de negocio deu erro
		//throw new LivrariaException();
	}

	public List<Autor> lista() {
		return dao.todosAutores();
	}

	public Autor buscaPorId(Integer autorId) {
		return dao.buscaPelaId(autorId);
	}

}
