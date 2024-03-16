package com.LojaEletrica.LEBE.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	//Atributos
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Cliente")
	private Long idCliente;
	private String nomeCliente;
	private Long cpf;
	private String telefone;
	private Long cep;
	private String cidade;
	private String endereço;
	private String complemento;
	
	//Construtores
	public Cliente(){
		
	}
	
	public Cliente(Long idCliente, String nomeCliente, Long cpf, String telefone, Long cep, String cidade,
			String endereço, String complemento) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.cidade = cidade;
		this.endereço = endereço;
		this.complemento = complemento;
	}




	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Long getcpf() {
		return cpf;
	}

	public void setcpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	public Long getCep() {
		return cep;
	}

	public void setCep(Long cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente, nomeCliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(idCliente, other.idCliente) && Objects.equals(nomeCliente, other.nomeCliente);
	}
	

	
}
