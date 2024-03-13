package com.LojaEletrica.LEBE.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.DTO.UsuarioDTO;
import com.LojaEletrica.LEBE.entities.services.UsuarioService;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService cs;
	
	@GetMapping(value="/{id}")
	public UsuarioDTO findById(@PathVariable Long id) {
		UsuarioDTO result = cs.findById(id);
		return result;
	}
	@GetMapping
	public List<UsuarioDTO> findAllGames() {
		List<UsuarioDTO> result = cs.findAll();
		return result;
	}
	
}
