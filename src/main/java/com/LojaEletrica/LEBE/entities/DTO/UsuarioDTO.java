package com.LojaEletrica.LEBE.entities.DTO;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.LojaEletrica.LEBE.entities.Usuario;

public class UsuarioDTO {
	
	private Long usuarioId;
	private Long apelido;
	private Long senha;
	
	
	public UsuarioDTO() {
		
	}
	
	public UsuarioDTO(Usuario usuario) {
		super();
		BeanUtils.copyProperties(usuario, this);
	}
	public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Long getApelido() {
		return apelido;
	}
	public void setApelido(Long apelido) {
		this.apelido = apelido;
	}
	public Long getSenha() {
		return senha;
	}
	public void setSenha(Long senha) {
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apelido, senha);
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
		return Objects.equals(apelido, other.apelido) && Objects.equals(senha, other.senha);
	}
	
			
}
