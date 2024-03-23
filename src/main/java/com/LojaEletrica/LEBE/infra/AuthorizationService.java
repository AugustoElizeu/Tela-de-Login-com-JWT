package com.LojaEletrica.LEBE.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.LojaEletrica.LEBE.entities.repositories.UsuarioRepository;

@Service
public class AuthorizationService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository rep;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return rep.findByApelido(username);
	}
		
		
}
