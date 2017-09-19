package br.com.puc.tcc;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.puc.tcc.model.Aluno;
import br.com.puc.tcc.model.Usuario;
import br.com.puc.tcc.service.AlunoService;

@Controller
public class PrincipalController {

	@Autowired
	AlunoService alunoService;
	@RequestMapping("principal")
	public String principal(HttpSession session, Model model){
		Usuario user = (Usuario) session.getAttribute("usuarioLogado");
		if(!user.isFuncionario()){
			Aluno a = alunoService.findByUser(user);
			model.addAttribute("aluno", a);
		}else{
			Aluno a = new Aluno();
			a.setNome("Admin");
			model.addAttribute("aluno", a);
		}
		return "Principal";
	}
}
