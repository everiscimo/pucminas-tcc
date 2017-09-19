package br.com.puc.tcc.integracao;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.puc.tcc.model.Aluno;
import br.com.puc.tcc.model.AlunoMEC;

@Service
public class IntegracaoMEC {

	public boolean addAluno(Aluno aluno) {
		RestTemplate restTemplate = new RestTemplate();
		AlunoMEC aMec = new AlunoMEC(aluno);
		AlunoMEC retorno = restTemplate.postForObject(
				"http://54.203.20.190:8080/emuladormec-0.0.1-SNAPSHOT/addAluno", aMec, AlunoMEC.class);
		
		return retorno!=null;
	}
}
