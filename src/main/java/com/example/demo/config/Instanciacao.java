package com.example.demo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dto.AutorDTO;
import com.example.demo.entidade.Post;
import com.example.demo.entidade.Usuario;
import com.example.demo.repositorio.PostRepositorio;
import com.example.demo.repositorio.UsuarioRepositorio;

@Configuration
public class Instanciacao implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio ur;
	
	@Autowired
	private PostRepositorio pr;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public void run(String... args) throws Exception {
		
		ur.deleteAll();
		pr.deleteAll();
		
		Usuario maria = new Usuario(
				null, "Maria Brown", "maria@gmail.com"); 
		Usuario alex = new Usuario(
				null, "Alex Green", "alex@gmail.com"); 
		Usuario bob = new Usuario(
				null, "Bob Grey", "bob@gmail.com");
		ur.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), 
				"Partiu viagem", "Vou viajar para São Paulo. Abraços!",
				new AutorDTO(maria));
		
		Post post2 = new Post(null, sdf.parse("23/03/2018"), 
				"Bom dia", "acordei feliz hoje", new AutorDTO(maria));
		
		pr.saveAll(Arrays.asList(post1, post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		ur.save(maria);
	}

}
