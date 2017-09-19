package br.com.puc.tcc.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.puc.tcc.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

	public Usuario findByEmailAndSenha(String email, String senha);
}
