package com.LojaEletrica.LEBE.entities.DTO;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.LojaEletrica.LEBE.entities.Cliente;

public class ClienteDTO {
		//Atributos
		private Long idCliente;
		private String nomeCliente;
		private String cpf;
		private String telefone;
		
		//Construtores
		public ClienteDTO(){
			
		}
		//Construtor usando campos
		public ClienteDTO(Cliente entidade) {
			super();
			BeanUtils.copyProperties(entidade, this);
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
		public String getcpf() {
			return cpf;
		}
		public void setcpf(String cpf) {
			this.cpf = cpf;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
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
			ClienteDTO other = (ClienteDTO) obj;
			return Objects.equals(idCliente, other.idCliente) && Objects.equals(nomeCliente, other.nomeCliente);
		}
			
}
