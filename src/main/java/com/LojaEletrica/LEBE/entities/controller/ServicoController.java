package com.LojaEletrica.LEBE.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.DTO.ServicoDTO;
import com.LojaEletrica.LEBE.entities.services.ServicoService;

@RestController
@RequestMapping(value="/servicos")
public class ServicoController {

	@Autowired
	private ServicoService servico;
	
	@GetMapping(value="/{id}")
	public ServicoDTO findById(@PathVariable String id) {
		ServicoDTO result = servico.findById(id);
		return result;
	}
	@GetMapping
	public List<ServicoDTO> findAllGames() {
		List<ServicoDTO> result =servico.findAll();
		return result;
	}
	
}
