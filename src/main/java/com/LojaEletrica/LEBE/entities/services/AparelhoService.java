package com.LojaEletrica.LEBE.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LojaEletrica.LEBE.entities.Aparelho;
import com.LojaEletrica.LEBE.entities.DTO.AparelhoDTO;
import com.LojaEletrica.LEBE.entities.repositories.AparelhoRepository;

@Service
public class AparelhoService {
	
	@Autowired
    private AparelhoRepository rep;
	
	@Transactional(readOnly = true)
	public List<AparelhoDTO> findAll(){
		List<Aparelho> result = rep.findAll();
		return result.stream().map(x -> new AparelhoDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public AparelhoDTO findById(String AparelhoId) {
		Aparelho result = rep.findById(AparelhoId).get();
		return new AparelhoDTO(result);
	}
}
