package com.joelma.os.domain;

public class Cliente extends Pessoa {//extender pessoa
//criar constructor da classe mae
	public Cliente() {
		super();
		
	}

	public Cliente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
		
	}

}
