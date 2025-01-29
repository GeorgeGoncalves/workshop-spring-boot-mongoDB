package com.example.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidade.Post;
import com.example.demo.servico.PostServico;

@RestController
@RequestMapping(value = "/posts")
public class PostControle {

	@Autowired
	private PostServico ps;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(
			@PathVariable String id){
		Post obj = ps.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
