package com.joelma.os.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.joelma.os.domain.enuns.Prioridade;
import com.joelma.os.domain.enuns.Status;

//os importes tem que ser enums
//atributos

public class Os {

	private Integer id;

	private LocalDateTime dataAbertura;

	private LocalDateTime dataFechamento;
	private Integer prioridade;// numero correspondente
	private String observacoes;
	private Integer status;// numero correspondente
	

	private Tecnico tecnico;// nao precisa importar por estar no mesmo pacote de OrdemServiço

	private Cliente cliente;// nao precisa importar tambem

	// constructor da superclasse
	public Os() {
		super();
		this.setDataAbertura(LocalDateTime.now()); // pra data não se iniciar do 0
		this.setPrioridade(Prioridade.BAIXA);//
		this.setStatus(Status.ABERTO);//
	}

	// constructor com parametros
	public Os(Integer id, Prioridade prioridade, String observacoes, Status status, Tecnico tecnico, Cliente cliente) {
		super();
		this.id = id;
		this.setDataAbertura(LocalDateTime.now());// pegar data automaticamente sem precisar inserir
		this.prioridade = (prioridade == null) ? 0 : prioridade.getCod();// validador,se nao escolher começa do 0
		this.observacoes = observacoes;
		this.status = (status == null) ? 0 : status.getCod();// validador,se nao escolher começa do 0
		this.tecnico = tecnico;
		this.cliente = cliente;
	}

//getter e setter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDateTime dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDateTime getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDateTime dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Prioridade getPrioridade() {
		return Prioridade.toEnum(this.prioridade);//
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade.getCod();//
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Status getStatus() {
		return Status.toEnum(this.status);//
	}

	public void setStatus(Status status) {
		this.status = status.getCod();//
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	// hashCod somente do id

//	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

//	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Os other = (Os) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
