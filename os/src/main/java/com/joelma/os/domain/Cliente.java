package com.joelma.os.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa  {




private List<Os> List=new ArrayList<>();
	public Cliente() {
		super();
	
	}
//gerar o constructor da classe mae
	public Cliente(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
		
	}//getter e setter da list
	public List<Os> getList() {
		return List;
	}
	public void setList(List<Os> list) {
		List = list;

}
}