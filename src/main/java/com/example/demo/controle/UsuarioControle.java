package com.example.demo.controle;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entidade.Usuario;
import com.example.demo.servico.UsuarioServico;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioControle {

	@Autowired
	private UsuarioServico us;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> lista = us.findAll();
		List<UsuarioDTO> dto = lista.stream().map(
				x -> new UsuarioDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(lista);
	}
}
