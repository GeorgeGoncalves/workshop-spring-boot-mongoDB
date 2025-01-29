package com.example.demo.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidade.Post;

@Repository
public interface PostRepositorio extends MongoRepository<Post, String>{

}
