package com.LojaEletrica.LEBE.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.DTO.PecaDTO;
import com.LojaEletrica.LEBE.entities.services.PecaService;

@RestController
@RequestMapping(value="/pecas")
public class PecaController {

	@Autowired
	private PecaService servico;
	
	@GetMapping(value="/{id}")
	public PecaDTO findById(@PathVariable String id) {
		PecaDTO result = servico.findById(id);
		return result;
	}
	@GetMapping
	public List<PecaDTO> findAllGames() {
		List<PecaDTO> result = servico.findAll();
		return result;
	}
	
}
