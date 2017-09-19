package br.com.puc.tcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.puc.tcc.integracao.IntegracaoMEC;
import br.com.puc.tcc.model.Aluno;
import br.com.puc.tcc.service.AlunoService;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@Autowired
	private IntegracaoMEC integracaoMEC;
	@RequestMapping("CadastroAluno")
	public String cadastroAluno(Model model){
		Iterable<Aluno> alunos = alunoService.listar();
		model.addAttribute("alunos", alunos);
		return "CadastroAlunos"; 
	}
	
	@RequestMapping(value="salvar", method= RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome,
			@RequestParam("cpf") String cpf,
			@RequestParam("telefone") String telefone,
			@RequestParam("email") String email,
			@RequestParam("senha") String senha, Model model){
		Aluno a = new Aluno(cpf,nome,email,telefone,senha);
		alunoService.salvar(a);
		integracaoMEC.addAluno(a);
		Iterable<Aluno> alunos = alunoService.listar();
		model.addAttribute("alunos", alunos);
		return "CadastroAlunos"; 
	}
}
