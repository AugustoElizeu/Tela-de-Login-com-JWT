package com.LojaEletrica.LEBE.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaEletrica.LEBE.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
