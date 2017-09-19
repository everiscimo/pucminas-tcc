package br.com.puc.tcc;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.puc.tcc.model.Usuario;
import br.com.puc.tcc.service.UsuarioService;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/academic/")
	public String inicio(){
		return "index";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuarLogin(Usuario user, HttpSession session){
		user = usuarioService.login(user);
		if(user!=null) {
		    session.setAttribute("usuarioLogado", user);
		    if(user.isFuncionario()){
		    	return "redirect:CadastroAluno";
		    }else{
		    	return "redirect:principal";
		    }
		}
		session.invalidate();  
		return "/academic/";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
	  session.invalidate();
	  return "redirect:/";
	}
}
