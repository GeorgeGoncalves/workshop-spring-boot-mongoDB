package com.example.demo.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidade.Usuario;

@Repository
public interface UsuarioRepositorio extends MongoRepository<Usuario, String>{

}
