package com.LojaEletrica.LEBE.entities.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.Usuario;
import com.LojaEletrica.LEBE.entities.DTO.UsuarioDTO;
import com.LojaEletrica.LEBE.entities.repositories.UsuarioRepository;
import com.LojaEletrica.LEBE.entities.services.UsuarioService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService servico;
	@Autowired
	private UsuarioRepository rep;
	@GetMapping(value="/{id}")
	public Usuario findById(@PathVariable Long id) {
		Usuario result = servico.findById(id);
		return result;
	}
	@PostMapping
	public Usuario criarUsuario(@RequestBody Usuario usuario) {
		System.out.println(usuario.toString());
		Usuario usuarioNovo = rep.save(usuario);
		return usuarioNovo;
	}
	
	@GetMapping
	public List<Usuario> findAllGames() {
		List<Usuario> result = servico.findAll();
		return result;
	}
	
}
