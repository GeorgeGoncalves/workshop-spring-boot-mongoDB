package com.example.demo.controle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entidade.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioControle {

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> lista = new ArrayList<>(); 
		Usuario maria = new Usuario(
				"1001", "Maria Brown", "maria@gmail.com"); 
		Usuario alex = new Usuario(
				"1002", "Alex Green", "alex@gmail.com"); 
		lista.addAll(Arrays.asList(maria, alex)); 
		return ResponseEntity.ok().body(lista);
	}
}
