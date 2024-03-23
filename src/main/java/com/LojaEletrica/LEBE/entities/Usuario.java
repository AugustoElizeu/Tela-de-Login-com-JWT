package com.LojaEletrica.LEBE.entities;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.LojaEletrica.LEBE.entities.enums.UserRoles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario implements UserDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="ID_Usuario")
	//UUID java.util.UUID = cria uma ID criptografada
	private String usuarioId;
	private String apelido;
	private String senha;
	private UserRoles papel;
	
	
	public Usuario() {
		
	}
	public Usuario(String apelido, String senha, UserRoles papel) {
		super();
		this.apelido = apelido;
		this.senha = senha;
	}
	
	public String getUsuarioId() {

		return usuarioId;
	}
	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public UserRoles getPapel() {
		return papel;
	}
	public void setPapel(UserRoles papel) {
		this.papel = papel;
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
		Usuario other = (Usuario) obj;
		return Objects.equals(apelido, other.apelido) && Objects.equals(senha, other.senha);
	}
	
	//UserDetals mandatory methods
	
	 @Override
	    public Collection<? extends GrantedAuthority> getAuthorities() {
	        if(this.papel == UserRoles.ADMIN) return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
	        else return List.of(new SimpleGrantedAuthority("ROLE_USER"));
	    }

	    @Override
	    public boolean isAccountNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;
	    }
		@Override
		public String getPassword() {
			// TODO Auto-generated method stub
			return senha;
		}
		@Override
		public String getUsername() {
			// TODO Auto-generated method stub
			return apelido;
		}
	   
	
}
