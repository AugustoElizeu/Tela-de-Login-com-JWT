package com.LojaEletrica.LEBE.entities.DTO;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.LojaEletrica.LEBE.entities.Usuario;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class UsuarioDTO {
	//Atributos
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long idUsuario;
		private String nomeUsuario;
		private String cpf;
		private String telefone;
		
		//Construtores
		public UsuarioDTO(){
			
		}
		//Construtor usando campos
		public UsuarioDTO(Usuario entidade) {
			super();
			BeanUtils.copyProperties(entidade, this);
		}
		
		public Long getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(Long idUsuario) {
			this.idUsuario = idUsuario;
		}
		public String getNomeUsuario() {
			return nomeUsuario;
		}
		public void setNomeUsuario(String nomeUsuario) {
			this.nomeUsuario = nomeUsuario;
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
			return Objects.hash(idUsuario, nomeUsuario);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UsuarioDTO other = (UsuarioDTO) obj;
			return Objects.equals(idUsuario, other.idUsuario) && Objects.equals(nomeUsuario, other.nomeUsuario);
		}
			
}
