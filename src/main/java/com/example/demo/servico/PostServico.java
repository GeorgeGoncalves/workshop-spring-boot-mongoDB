package com.example.demo.servico;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidade.Post;
import com.example.demo.repositorio.PostRepositorio;
import com.example.demo.servico.exception.ObjetoNaoEncontrado;

@Service
public class PostServico {

	@Autowired
	private PostRepositorio pr;
	
	public Post findById(String id) {
		Optional<Post> usuario = pr.findById(id);
		return usuario.orElseThrow(() -> new ObjetoNaoEncontrado(
				"Objeto não encontrado"));
	}
	
	public List<Post> findByTexto(String texto){
		return pr.findByTituloContainingIgnoreCase(texto);
	}
	
	public List<Post> findByTexto1(String texto){
		return pr.procuraTitulo(texto);
	}	
	
	public List<Post> pesquisaCompleta(String texto, Date minData, Date maxData){
		maxData = new Date(maxData.getTime() + 24 * 60 * 60 * 1000);
		return pr.pesquisaCompleta(texto, minData, maxData);
	}
}
