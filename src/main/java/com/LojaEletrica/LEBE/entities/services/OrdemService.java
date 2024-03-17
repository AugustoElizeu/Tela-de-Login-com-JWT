package com.LojaEletrica.LEBE.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LojaEletrica.LEBE.entities.Ordem;
import com.LojaEletrica.LEBE.entities.DTO.OrdemDTO;
import com.LojaEletrica.LEBE.entities.repositories.OrdemRepository;

@Service
public class OrdemService {
	
	@Autowired
    private OrdemRepository rep;
	
	@Transactional(readOnly = true)
	public List<OrdemDTO> findAll(){
		List<Ordem> result = rep.findAll();
		return result.stream().map(x -> new OrdemDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public OrdemDTO findById(Long OrdemId) {
		Ordem result = rep.findById(OrdemId).get();
		return new OrdemDTO(result);
	}
}
