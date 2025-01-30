package com.example.demo.controle;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controle.util.URL;
import com.example.demo.entidade.Post;
import com.example.demo.servico.PostServico;

@RestController
@RequestMapping(value = "/posts")
public class PostControle {

	@Autowired
	private PostServico pc;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(
			@PathVariable String id){
		Post obj = pc.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/tituloprocura")
	public ResponseEntity<List<Post>> findByTitulo(
			@RequestParam String texto){
		texto = URL.parametroDecodificacao(texto);
		List<Post> lista = pc.findByTexto(texto);
		return ResponseEntity.ok().body(lista);
	}	
	
	@GetMapping(value = "/pesquisacompleta")
	public ResponseEntity<List<Post>> pesquisaCompleta(
 			@RequestParam(defaultValue = "") String texto,
 			@RequestParam(defaultValue = "") String minData,
 			@RequestParam(defaultValue = "") String maxData) {
		texto = URL.parametroDecodificacao(texto);
		Date min = URL.converterData(minData, new Date(0L));
		Date max = URL.converterData(maxData, new Date());;
		List<Post> lista = pc.pesquisaCompleta(texto,min, max);
		return ResponseEntity.ok().body(lista);
	}	
}
