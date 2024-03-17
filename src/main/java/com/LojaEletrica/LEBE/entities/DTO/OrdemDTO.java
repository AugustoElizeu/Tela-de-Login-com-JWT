package com.LojaEletrica.LEBE.entities.DTO;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.LojaEletrica.LEBE.entities.Ordem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ordem")
public class OrdemDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Ordem")
	private Long ordemId;
	private Integer codigo;
	private Date data;
	private Double Orçamento;
	private String Descrição;
	
	public OrdemDTO() {
		
	}

	public OrdemDTO(Ordem ordem) {
		BeanUtils.copyProperties(ordem, this);
	}

	public Long getOrdemId() {
		return ordemId;
	}

	public void setOrdemId(Long ordemId) {
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
		OrdemDTO other = (OrdemDTO) obj;
		return Objects.equals(data, other.data) && Objects.equals(ordemId, other.ordemId);
	}
	
 
	
	
	
	
}
