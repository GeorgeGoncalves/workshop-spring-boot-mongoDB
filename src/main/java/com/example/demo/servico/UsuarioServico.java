package com.example.demo.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UsuarioDTO;
import com.example.demo.entidade.Usuario;
import com.example.demo.repositorio.UsuarioRepositorio;
import com.example.demo.servico.exception.ObjetoNaoEncontrado;

@Service
public class UsuarioServico {

	@Autowired
	private UsuarioRepositorio ur;
	
	public List<Usuario> findAll(){
		return ur.findAll();
	}
	
	public Usuario findById(String id) {
		Optional<Usuario> usuario = ur.findById(id);
		return usuario.orElseThrow(() -> new ObjetoNaoEncontrado(
				"Objeto não encontrado"));
	}
	
	public Usuario insert(Usuario obj) {
		return ur.insert(obj);
	}
	
	public void delete(String id) {
		ur.findById(id);
		ur.deleteById(id);
	}
	
	public Usuario upDate(Usuario obj) {
		Usuario novoObj = findById(obj.getId());
		updateData(novoObj, obj);
		return ur.save(novoObj);		
	}
	
	private void updateData(Usuario novoObj, Usuario obj) {
		novoObj.setNome(obj.getNome());
		novoObj.setEmail(obj.getEmail());
	}

	public Usuario fromDTO(UsuarioDTO objDTO) {
		return new Usuario(objDTO.getId(), objDTO.getNome(),
				objDTO.getEmail());
	}
}
