package br.com.puc.mec.emuladormec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class EmuladormecApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EmuladormecApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
			return builder.sources(EmuladormecApplication.class);
	}
}
