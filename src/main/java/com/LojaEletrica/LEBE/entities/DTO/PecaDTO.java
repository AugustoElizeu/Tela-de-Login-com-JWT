package com.LojaEletrica.LEBE.entities.DTO;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.LojaEletrica.LEBE.entities.Peca;

public class PecaDTO {
private Long pecaId;
	
	private String nomePeca;
	private Integer codigoPeca;
	private String tipoPeca;
	private String marca;
	private String tipoEstoque;
	private Integer Estoque;
	
	public PecaDTO(){
		
	}
	
	public PecaDTO(Peca peca) {
		BeanUtils.copyProperties(peca, this);
	}
	
	public Long getPecaId() {
		return pecaId;
	}

	public void setPecaId(Long pecaId) {
		this.pecaId = pecaId;
	}

	public String getNomePeca() {
		return nomePeca;
	}

	public void setNomePeca(String nomePeca) {
		this.nomePeca = nomePeca;
	}

	public Integer getCodigoPeca() {
		return codigoPeca;
	}

	public void setCodigoPeca(Integer codigoPeca) {
		this.codigoPeca = codigoPeca;
	}

	public String getTipoPeca() {
		return tipoPeca;
	}

	public void setTipoPeca(String tipoPeca) {
		this.tipoPeca = tipoPeca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoEstoque() {
		return tipoEstoque;
	}

	public void setTipoEstoque(String tipoEstoque) {
		this.tipoEstoque = tipoEstoque;
	}

	public Integer getEstoque() {
		return Estoque;
	}

	public void setEstoque(Integer estoque) {
		Estoque = estoque;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPeca, nomePeca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PecaDTO other = (PecaDTO) obj;
		return Objects.equals(codigoPeca, other.codigoPeca) && Objects.equals(nomePeca, other.nomePeca);
	}
	
}
