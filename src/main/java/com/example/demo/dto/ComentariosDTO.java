package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

public class ComentariosDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String texto;
	private Date data;
	private AutorDTO autor;
	
	public ComentariosDTO() {
	}

	public ComentariosDTO(String texto, Date data, AutorDTO autor) {
		this.texto = texto;
		this.data = data;
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public AutorDTO getAutor() {
		return autor;
	}

	public void setAutor(AutorDTO autor) {
		this.autor = autor;
	}	
}
