package com.oberdan.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.oberdan.livraria.dao.LivroDao;
import com.oberdan.livraria.modelo.Livro;

@WebService
@Stateless
public class LivrariaWS {
	
	@Inject
	LivroDao dao;
	
	@WebResult(name="autores")
	public List<Livro> getLivrosPeloNome(@WebParam(name="titulo") String nome) {
		
		System.out.println("LivrariaWS: procurando pelo nome " + nome);
		
		return dao.buscaLivrosPeloNome(nome);

	}
}
