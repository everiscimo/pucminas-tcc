package br.com.puc.tcc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.puc.tcc.model.Usuario;
import br.com.puc.tcc.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario login(Usuario user){
		
		Usuario usuario = repository.findByEmailAndSenha(user.getEmail(), user.getSenha());
		return usuario;
	}
}
