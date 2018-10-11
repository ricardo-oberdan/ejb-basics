package com.oberdan.livraria.service;

import java.util.List;

import javax.inject.Inject;

import com.oberdan.livraria.dao.LivroDao;
import com.oberdan.livraria.modelo.Livro;

public class LivroService {

	@Inject
	LivroDao dao;
	
	public void salva(Livro livro) {
		dao.salva(livro);
	}

	public List<Livro> lista() {
		return dao.todosLivros();
	}

}
