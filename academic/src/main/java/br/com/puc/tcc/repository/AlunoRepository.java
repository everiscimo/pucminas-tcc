package br.com.puc.tcc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.puc.tcc.model.Aluno;
import br.com.puc.tcc.model.Usuario;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {

	public List<Aluno> findByCpf(String cpf);
	public Aluno findByUsuario(Usuario usuario);
}
