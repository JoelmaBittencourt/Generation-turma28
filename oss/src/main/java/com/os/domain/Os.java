package com.os.domain;

import java.time.LocalDateTime;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


public class Os {
	
private Integer id;
	
	private LocalDateTime dataAbertura;

	private LocalDateTime dataFechamento;
	private Integer prioridade;
	private String observacoes;
	private Integer status;
	
	
	private Colaboradora colaboradora;
	private Cliente cliente;


	public OrdemServico() {
		super();

		this.setDataAbertura(LocalDateTime.now()); 
		this.setPrioridade(Prioridade.BAIXA);
		this.setStatus(Status.ABERTO);/

	}

//adiciona o constructor com parametros
	public OrdemServico(Integer id, LocalDateTime dataAbertura, LocalDateTime dataFechamento, Prioridade prioridade,
			String observacoes, Status status, Colaboradora colaboradora, Cliente cliente) {
		super();
		this.id = id;
		// this.dataAbertura = dataAbertura;
		this.setDataAbertura(LocalDateTime.now());// pegar data automaticamente sem precisar inserir
		this.dataFechamento = dataFechamento;
		this.prioridade = (prioridade == null) ? 0 : prioridade.getCod();// validaçao do codigo,se digitar outros
																			// codigos entra no 0
		this.observacoes = observacoes;
		this.status = (status == null) ? 0 : status.getCod();// validaçao do codigo,se digitar outros codigos entra no 0
		this.colaboradora = colaboradora;
		this.cliente = cliente;

		// adiciona os getter e setter
	}

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
		return Prioridade.toEnum(this.prioridade);
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade.getCod();
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Status getStatus() {
		return Status.toEnum(this.status);
	}

	public void setStatus(Status status) {
		this.status = status.getCod();
	}

	public Colaboradora getColaboradora() {
		return colaboradora;
	}

	public void setColaboradora(Colaboradora colaboradora) {
		this.colaboradora = colaboradora;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;

//cria o hashCod and equals somente do id
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemServico other = (OrdemServico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}
