package com.LojaEletrica.LEBE.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.DTO.ClienteDTO;
import com.LojaEletrica.LEBE.entities.services.ClienteService;

@RestController
@RequestMapping(value="/usuarios")
public class ClienteController {

	@Autowired
	private ClienteService cs;
	
	@GetMapping(value="/{id}")
	public ClienteDTO findById(@PathVariable Long id) {
		ClienteDTO result = cs.findById(id);
		return result;
	}
	@GetMapping
	public List<ClienteDTO> findAllGames() {
		List<ClienteDTO> result = cs.findAll();
		return result;
	}
	
}
