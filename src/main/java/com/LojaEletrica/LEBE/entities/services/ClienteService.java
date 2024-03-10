package com.LojaEletrica.LEBE.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LojaEletrica.LEBE.entities.Cliente;
import com.LojaEletrica.LEBE.entities.DTO.ClienteDTO;
import com.LojaEletrica.LEBE.entities.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
    private ClienteRepository cr;
	
	@Transactional(readOnly = true)
	public List<ClienteDTO> findAll(){
		List<Cliente> result = cr.findAll();
		return result.stream().map(x -> new ClienteDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long clienteId) {
		Cliente result = cr.findById(clienteId).get();
		return new ClienteDTO(result);
	}
}
