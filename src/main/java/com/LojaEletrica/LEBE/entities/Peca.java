package com.LojaEletrica.LEBE.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Peca")
public class Peca implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pecaId;
	
	private String nomePeca;
	private Integer codigoPeca;
	private String tipoPeca;
	private String marca;
	private String tipoEstoque;
	private Integer Estoque;
	
	public Peca(){
		
	}
	
	public Peca(Long pecaId, String nomePeca, Integer codigoPeca, String tipoPeca, String marca, String tipoEstoque,
			Integer estoque) {
		super();
		this.pecaId = pecaId;
		this.nomePeca = nomePeca;
		this.codigoPeca = codigoPeca;
		this.tipoPeca = tipoPeca;
		this.marca = marca;
		this.tipoEstoque = tipoEstoque;
		Estoque = estoque;
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
		Peca other = (Peca) obj;
		return Objects.equals(codigoPeca, other.codigoPeca) && Objects.equals(nomePeca, other.nomePeca);
	}
	
	
	
}
