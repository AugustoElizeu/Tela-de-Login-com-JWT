package com.LojaEletrica.LEBE.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ordem")
public class Ordem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.UUID)
	@Column(name="ID_Ordem")
	private UUID ordemId;
	private Integer codigo;
	private Date data;
	private Double Orçamento;
	private String Descrição;
	
	public Ordem() {
		
	}
	
	public Ordem(UUID ordemId, Integer codigo, Date data, Double orçamento, String descrição) {
		super();
		this.ordemId = ordemId;
		this.codigo = codigo;
		this.data = data;
		Orçamento = orçamento;
		Descrição = descrição;
	}

	public UUID getOrdemId() {
		return ordemId;
	}

	public void setOrdemId(UUID ordemId) {
		this.ordemId = ordemId;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getOrçamento() {
		return Orçamento;
	}

	public void setOrçamento(Double orçamento) {
		Orçamento = orçamento;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, ordemId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordem other = (Ordem) obj;
		return Objects.equals(data, other.data) && Objects.equals(ordemId, other.ordemId);
	}
	
 
	
	
	
	
}
