package br.com.puc.mec.emuladormec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.puc.mec.emuladormec.model.Aluno;
import br.com.puc.mec.emuladormec.persistency.AlunoPersistency;

@Service
public class AlunoService {

	@Autowired
	private AlunoPersistency persistency;
	public Iterable<Aluno> listarAlunos(){
		return persistency.findAll();
	}
	public Aluno addAluno(Aluno aluno){
		try {
			if(aluno==null || aluno.getCpf()==null || aluno.getCpf().length()<4){
				return null;
			}
			persistency.save(aluno);
			return aluno;
		} catch (Exception e) {
			return null;
		}
	}
}
