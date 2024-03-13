package com.LojaEletrica.LEBE.entities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LojaEletrica.LEBE.entities.Usuario;
import com.LojaEletrica.LEBE.entities.DTO.UsuarioDTO;
import com.LojaEletrica.LEBE.entities.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
    private UsuarioRepository ur;
	
	@Transactional(readOnly = true)
	public List<UsuarioDTO> findAll(){
		List<Usuario> result = ur.findAll();
		return result.stream().map(x -> new UsuarioDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public UsuarioDTO findById(Long UsuarioId) {
		Usuario result = ur.findById(UsuarioId).get();
		return new UsuarioDTO(result);
	}
}
