package br.com.puc.tcc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.puc.tcc.model.Aluno;
import br.com.puc.tcc.model.Usuario;
import br.com.puc.tcc.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	public Iterable<Aluno> listar(){
		return repository.findAll();
	}
	
	public void salvar(Aluno aluno){
		repository.save(aluno);
	}
	
	public Aluno findByUser(Usuario usuario){
		return repository.findByUsuario(usuario);
	}
}
