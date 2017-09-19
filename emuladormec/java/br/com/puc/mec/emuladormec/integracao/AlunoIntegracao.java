package br.com.puc.mec.emuladormec.integracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.puc.mec.emuladormec.model.Aluno;
import br.com.puc.mec.emuladormec.service.AlunoService;

@RestController
public class AlunoIntegracao {

	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping(path="/addAluno",method=RequestMethod.POST, headers = "Accept=application/json")
	public Aluno addAluno(@RequestBody Aluno aluno){
		return alunoService.addAluno(aluno);
	}
	
	@RequestMapping(path="/listarAluno",method=RequestMethod.GET)
	public ResponseEntity<Iterable<Aluno>> listar(){
		return new ResponseEntity<Iterable<Aluno>>(alunoService.listarAlunos(), HttpStatus.OK);
	}
}
