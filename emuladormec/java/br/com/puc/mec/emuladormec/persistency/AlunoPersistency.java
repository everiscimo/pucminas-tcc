package br.com.puc.mec.emuladormec.persistency;

import org.springframework.data.repository.CrudRepository;

import br.com.puc.mec.emuladormec.model.Aluno;

public interface AlunoPersistency extends CrudRepository<Aluno, Long> {

}
