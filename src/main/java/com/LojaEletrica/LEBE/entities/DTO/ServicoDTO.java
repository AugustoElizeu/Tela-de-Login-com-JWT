package com.LojaEletrica.LEBE.entities.DTO;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.LojaEletrica.LEBE.entities.Servico;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ServicoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Serviço")
	private Long servicoId;
	
	private String nomeServico;
	private Double valorServico;
	private String Descricao;
	
	public ServicoDTO() {
		
	}

	public ServicoDTO(Servico servico) {
		super();
		BeanUtils.copyProperties(servico, this);
	}

	public Long getservicoId() {
		return servicoId;
	}

	public void setservicoId(Long servicoId) {
		this.servicoId = servicoId;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeServico, servicoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServicoDTO other = (ServicoDTO) obj;
		return Objects.equals(nomeServico, other.nomeServico) && Objects.equals(servicoId, other.servicoId);
	}
	
	
	
}
