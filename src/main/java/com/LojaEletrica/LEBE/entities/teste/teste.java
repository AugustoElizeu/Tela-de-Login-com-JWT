package com.LojaEletrica.LEBE.entities.teste;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.LojaEletrica.LEBE.entities.Cliente;
import com.LojaEletrica.LEBE.entities.repositories.ClienteRepository;

@Configuration
@Profile("teste")
public class teste implements CommandLineRunner {
	
	@Autowired
	private ClienteRepository cr;
	
	@Override
    public void run(String... args) {
		
		Cliente c1 = new Cliente(null,"Sugoma","3214124214","123213213");
		Cliente c2 = new Cliente(null,"BRENNO","BAITOLA","GAY");
		cr.saveAll(Arrays.asList(c1,c2));
		
	}
}
