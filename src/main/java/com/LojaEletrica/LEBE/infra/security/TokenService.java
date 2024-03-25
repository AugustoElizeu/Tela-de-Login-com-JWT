package com.LojaEletrica.LEBE.infra.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.LojaEletrica.LEBE.entities.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;

@Service
public class TokenService {	
	@Value("${api.security.token.secret}")
	private String senhaHash;
	
	public String generateToken(Usuario usuario) {
		 try{
	            Algorithm algorithm = Algorithm.HMAC256(senhaHash);
	            String token = JWT.create()
	                    .withIssuer("auth-api")
	                    .withSubject(usuario.getApelido())
	                    .withExpiresAt(expiratedDate())
	                    .sign(algorithm);
	            return token;
	        } catch (JWTCreationException exception) {
	            throw new RuntimeException("Error while generating token", exception);
	        }
	}
	
	public String ValidarToken(String token) {
		  try {
	            Algorithm algorithm = Algorithm.HMAC256(senhaHash);
	            return JWT.require(algorithm)
	                    .withIssuer("auth-api")
	                    .build()
	                    .verify(token)
	                    .getSubject();
	        } catch (JWTVerificationException exception){
	            return "";
	        }
	}
	
	public Instant expiratedDate() {
		return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
	}
		
}
