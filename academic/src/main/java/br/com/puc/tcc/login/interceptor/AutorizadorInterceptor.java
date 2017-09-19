package br.com.puc.tcc.login.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.puc.tcc.model.Usuario;


@Component
public class AutorizadorInterceptor extends HandlerInterceptorAdapter{

	@Override
	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		String uri = request.getRequestURI();
	      if(uri.endsWith("/") || 
	          uri.endsWith("efetuaLogin") || 
	              uri.contains("resources")){
	        return true;
	      }
		if(request.getSession().getAttribute("usuarioLogado") != null) {
	        Usuario usuario = (Usuario) request.getSession().getAttribute("usuarioLogado") ;
	        if(usuario.isFuncionario()){
	        	return true;
	        }
	        if(uri.endsWith("principal")){
	        	return true;
	        }

	        response.sendRedirect("/academic/");
	        return false;
	    }
		response.sendRedirect("/academic/");
		return false;
	}
}
