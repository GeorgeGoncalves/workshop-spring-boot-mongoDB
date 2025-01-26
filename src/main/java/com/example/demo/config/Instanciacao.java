package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entidade.Usuario;
import com.example.demo.repositorio.UsuarioRepositorio;

@Configuration
public class Instanciacao implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio ur;
	
	@Override
	public void run(String... args) throws Exception {
		ur.deleteAll();
		
		Usuario maria = new Usuario(
				null, "Maria Brown", "maria@gmail.com"); 
		Usuario alex = new Usuario(
				null, "Alex Green", "alex@gmail.com"); 
		Usuario bob = new Usuario(
				null, "Bob Grey", "bob@gmail.com");
		ur.saveAll(Arrays.asList(maria, alex, bob));
	}

}
