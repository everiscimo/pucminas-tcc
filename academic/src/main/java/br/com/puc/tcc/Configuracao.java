package br.com.puc.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Configuracao  extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
			return builder.sources(Configuracao.class);
	}
	
}
