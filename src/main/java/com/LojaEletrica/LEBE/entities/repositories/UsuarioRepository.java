package com.LojaEletrica.LEBE.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.LojaEletrica.LEBE.entities.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario,String> {
	
	UserDetails findByApelido(String apelido);
}

