package com.LojaEletrica.LEBE.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LojaEletrica.LEBE.entities.Servico;
import com.LojaEletrica.LEBE.entities.DTO.ServicoDTO;
import com.LojaEletrica.LEBE.entities.repositories.ServicoRepository;

@Service
public class ServicoService {
	
	@Autowired
    private ServicoRepository rep;
	
	@Transactional(readOnly = true)
	public List<ServicoDTO> findAll(){
		List<Servico> result = rep.findAll();
		return result.stream().map(x -> new ServicoDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public ServicoDTO findById(Long ServicoId) {
		Servico result = rep.findById(ServicoId).get();
		return new ServicoDTO(result);
	}
}
