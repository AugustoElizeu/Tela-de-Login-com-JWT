package com.LojaEletrica.LEBE.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//Eu falo aonde eu configuro as coisas
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Bean
	public SecurityFilterChain sfc(HttpSecurity http) throws Exception{
		return http
			//Desativa o CSFR(Cross-Site Request Forgery)
			.csrf(csfr -> csfr.disable())
			//Cria uma politica de autenticação STATELESS
			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
			//Aqui eu to autorizando meu endpoint do tipo post
			.authorizeHttpRequests(authorize -> authorize
					.requestMatchers(HttpMethod.POST, "/auth/login").permitAll()
                    .requestMatchers(HttpMethod.POST, "/auth/register").permitAll()
					.requestMatchers(HttpMethod.POST,"/usuarios").hasRole("Usuoque?")
					.anyRequest()
					.authenticated())
			.build();
		
	}
	@Bean
	public AuthenticationManager authMen(AuthenticationConfiguration authConf) throws Exception {
		
		return authConf.getAuthenticationManager();
	}
	@Bean
	public PasswordEncoder cryptPassword() { return new BCryptPasswordEncoder(); }
}
