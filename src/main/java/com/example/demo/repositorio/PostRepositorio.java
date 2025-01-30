package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entidade.Post;

@Repository
public interface PostRepositorio extends MongoRepository<Post, String>{

	@Query("{ 'titulo': { $regex: ?0, $options: 'i' } }")
	List<Post> procuraTitulo(String texto);
	
	List<Post> findByTituloContainingIgnoreCase(String texto);
}
