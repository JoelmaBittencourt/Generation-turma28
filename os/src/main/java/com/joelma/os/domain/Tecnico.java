package com.joelma.os.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Tecnico extends Pessoa {
@OneToMany(mappedBy = "tecnico")
private List<Os> List=new ArrayList<>();
	public Tecnico() {
		super();
	
	}
//gerar o constructor da classe mae
	public Tecnico(Integer id, String nome, String cpf, String telefone) {
		super(id, nome, cpf, telefone);
		
	}//getter e setter da list
	public List<Os> getList() {
		return List;
	}
	public void setList(List<Os> list) {
		List = list;
	}

}
