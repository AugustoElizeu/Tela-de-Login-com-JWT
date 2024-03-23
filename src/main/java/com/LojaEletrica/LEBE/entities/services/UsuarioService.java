package com.LojaEletrica.LEBE.entities.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.LojaEletrica.LEBE.entities.Usuario;
import com.LojaEletrica.LEBE.entities.repositories.UsuarioRepository;
import com.LojaEletrica.LEBE.entities.services.exceptions.NotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
    private UsuarioRepository rep;
	
	@Transactional(readOnly = true)
	public List<Usuario> findAll(){
		return  rep.findAll();
	}
	
	@Transactional(readOnly = true)
	public Usuario findById(String usuarioId) {
		Optional<Usuario> obj = rep.findById(usuarioId);
		return obj.orElseThrow(() -> new NotFoundException(usuarioId));
	}
}
