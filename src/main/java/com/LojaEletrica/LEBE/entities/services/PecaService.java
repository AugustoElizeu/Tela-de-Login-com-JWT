package com.LojaEletrica.LEBE.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LojaEletrica.LEBE.entities.Peca;
import com.LojaEletrica.LEBE.entities.DTO.PecaDTO;
import com.LojaEletrica.LEBE.entities.repositories.PecaRepository;

@Service
public class PecaService {
	
	@Autowired
    private PecaRepository pr;
	
	@Transactional(readOnly = true)
	public List<PecaDTO> findAll(){
		List<Peca> result = pr.findAll();
		return result.stream().map(x -> new PecaDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public PecaDTO findById(String PecaId) {
		Peca result = pr.findById(PecaId).get();
		return new PecaDTO(result);
	}
}
