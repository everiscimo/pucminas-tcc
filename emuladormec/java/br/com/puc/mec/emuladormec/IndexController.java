package br.com.puc.mec.emuladormec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.puc.mec.emuladormec.service.AlunoService;

@Controller
public class IndexController {

	@Autowired
	private AlunoService alunoService;
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("alunos", alunoService.listarAlunos());
		return "index";
	}
	
	
}
