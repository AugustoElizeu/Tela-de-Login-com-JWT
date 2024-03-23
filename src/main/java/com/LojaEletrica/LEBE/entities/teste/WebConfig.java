package com.LojaEletrica.LEBE.entities.teste;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	            .allowedOrigins("*")
	            .allowedMethods("*")
	            .allowedHeaders("*");
	    }
	 //Essa configuração é usada para habilitar o suporte a CORS (Cross-Origin Resource Sharing) em sua aplicação Spring Boot. 
	 //O CORS é um mecanismo de segurança que permite que recursos da web em um navegador sejam solicitados a partir de um domínio 
	 //diferente do domínio onde o recurso originalmente reside.
	 
	 
}