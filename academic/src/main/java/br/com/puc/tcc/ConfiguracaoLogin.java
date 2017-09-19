package br.com.puc.tcc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.com.puc.tcc.login.interceptor.AutorizadorInterceptor;

@Configuration
public class ConfiguracaoLogin extends WebMvcConfigurerAdapter {

	 @Autowired 
	 AutorizadorInterceptor interceptor;

	 
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
