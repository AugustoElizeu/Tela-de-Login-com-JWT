package com.LojaEletrica.LEBE.infra.usuarioAuthenticator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.Usuario;
import com.LojaEletrica.LEBE.entities.repositories.UsuarioRepository;

import jakarta.validation.Valid;

@RestController()
@RequestMapping("auth")
public class AutenticacaoControle {
	
	@Autowired
	private AuthenticationManager authMenager;
	@Autowired
	private UsuarioRepository rep;
	
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody @Valid AutenticacaoDTO data) {
		//Pra que um nome gigante desse pelo amor de deus
		//Isso é uma clase de autenticação do spring security
		var userPassword = new UsernamePasswordAuthenticationToken(data.apelido(), data.senha());
		var auth = this.authMenager.authenticate(userPassword);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody @Valid RegisterDTO data) {
		if(this.rep.findByApelido(data.apelido()) != null) return ResponseEntity.badRequest().build();
		String encryptedPassword = new BCryptPasswordEncoder().encode(data.senha());
		Usuario novoUsuario = new Usuario(data.apelido(),encryptedPassword,data.papel());
		
		this.rep.save(novoUsuario);
		return ResponseEntity.ok().build();
	}
}
