package com.LojaEletrica.LEBE.entities.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.dao.InvalidDataAccessResourceUsageException;

import com.LojaEletrica.LEBE.entities.Cliente;
import com.LojaEletrica.LEBE.entities.Usuario;
import com.LojaEletrica.LEBE.entities.enums.UserRoles;
import com.LojaEletrica.LEBE.entities.repositories.ClienteRepository;
import com.LojaEletrica.LEBE.entities.repositories.UsuarioRepository;

@Configuration
@Profile("teste")
public class teste implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository cr;
	@Autowired
	private UsuarioRepository ur;
	
	@Override
    public void run(String... args) {
		try {
			Cliente c1 = new Cliente(null,"cano","10485435799","ashi ashi","102312","HEHE","PIZZA","CALABANGA");
			cr.save(c1);
		}catch(InvalidDataAccessResourceUsageException e) {
			e.printStackTrace();
		}
		Usuario u1 = new Usuario("admin","admin",UserRoles.ADMIN);
		ur.save(u1);
	}
}
