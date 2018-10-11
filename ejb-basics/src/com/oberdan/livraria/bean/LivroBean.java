package com.oberdan.livraria.bean;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import com.oberdan.livraria.modelo.Autor;
import com.oberdan.livraria.modelo.Livro;
import com.oberdan.livraria.service.AutorService;
import com.oberdan.livraria.service.LivroService;

@Model
public class LivroBean {
	
	private Livro livro = new Livro();
	private Integer autorId;
	
	@Inject
	private LivroService livroService;
	
	@Inject
	private AutorService autorService;

	public void cadastra() {
		
		Autor autor = this.autorService.buscaPorId(this.autorId);
		this.livro.setAutor(autor);
		
		this.livroService.salva(livro);
		
		this.livroService.lista();
		
		//this.livro = null;	
		
	}

	public List<Autor> getAutores() {
		return autorService.lista();
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}
	
	public Integer getAutorId() {
		return autorId;
	}
	
	public List<Livro> getLivros() {
		return this.livroService.lista();
	}
}
