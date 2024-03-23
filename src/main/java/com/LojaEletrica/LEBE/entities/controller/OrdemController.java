package com.LojaEletrica.LEBE.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.DTO.OrdemDTO;
import com.LojaEletrica.LEBE.entities.services.OrdemService;

@RestController
@RequestMapping(name="/Ordens")
public class OrdemController {
	@Autowired
	private OrdemService servico;
	
	@GetMapping(value="/{id}")
	public OrdemDTO findById(@PathVariable String id) {
		OrdemDTO result = servico.findById(id);
		return result;
	}
	@GetMapping
	public List<OrdemDTO> findAllGames() {
		List<OrdemDTO> result = servico.findAll();
		return result;
	}
}
