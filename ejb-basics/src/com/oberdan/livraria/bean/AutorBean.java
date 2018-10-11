package com.oberdan.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import com.oberdan.livraria.exception.LivrariaException;
import com.oberdan.livraria.modelo.Autor;
import com.oberdan.livraria.service.AutorService;

@Model
public class AutorBean {
	
	private Autor autor = new Autor();
	
	@Inject
	private AutorService service;
	
	public Autor getAutor() {
		return autor;
	}
	
	public void cadastra() {
		this.service.salva(autor);
		this.autor = new Autor();
	}
	
	public List<Autor> getAutores() {
		return this.service.lista();
	}
}
