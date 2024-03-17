package com.LojaEletrica.LEBE.entities.DTO;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.LojaEletrica.LEBE.entities.Aparelho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AparelhoDTO")
public class AparelhoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Aparelho")
	private Long aparelhoId;
	private String nomeAparelho;
	private String marca;
	private String tipoAparelho;
	
	public AparelhoDTO() {
		
	}

	public AparelhoDTO(Aparelho aparelho) {
		BeanUtils.copyProperties(aparelho, this);
	}

	public Long getAparelhoId() {
		return aparelhoId;
	}

	public void setAparelhoId(Long aparelhoId) {
		this.aparelhoId = aparelhoId;
	}

	public String getNomeAparelho() {
		return nomeAparelho;
	}

	public void setNomeAparelho(String nomeAparelho) {
		this.nomeAparelho = nomeAparelho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoAparelho() {
		return tipoAparelho;
	}

	public void setTipoAparelho(String tipoAparelho) {
		this.tipoAparelho = tipoAparelho;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aparelhoId, nomeAparelho);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AparelhoDTO other = (AparelhoDTO) obj;
		return Objects.equals(aparelhoId, other.aparelhoId) && Objects.equals(nomeAparelho, other.nomeAparelho);
	}
	
	
}
