package com.joelma.os.domain;

public class Tecnico extends Pessoa {

	public Tecnico() {
		super();
	
	}
//gerar o constructor da classe mae
	public Tecnico(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
		
	}

}
