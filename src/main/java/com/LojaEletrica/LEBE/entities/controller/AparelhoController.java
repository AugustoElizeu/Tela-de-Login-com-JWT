package com.LojaEletrica.LEBE.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LojaEletrica.LEBE.entities.DTO.AparelhoDTO;
import com.LojaEletrica.LEBE.entities.services.AparelhoService;


@RestController
@RequestMapping(value="/aparelhos")
public class AparelhoController {

	@Autowired
	private AparelhoService servico;
	
	@GetMapping(value="/{id}")
	public AparelhoDTO findById(@PathVariable String id) {
		AparelhoDTO result = servico.findById(id);
		return result;
	}
	@GetMapping
	public List<AparelhoDTO> findAllGames() {
		List<AparelhoDTO> result = servico.findAll();
		return result;
	}
	
}
