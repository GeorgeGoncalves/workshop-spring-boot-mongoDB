package com.example.demo.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidade.Usuario;
import com.example.demo.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepositorio ur;
	
	
	public List<Usuario> findAll(){
		return ur.findAll();
	}
}
