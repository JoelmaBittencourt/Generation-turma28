package com.joelma.os.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity//tabela
public class Cliente extends Pessoa  implements Serializable{
private static final long seriaVersionUID=1L;
@OneToMany(mappedBy = "cliente" )//muitas ordem um tecnico
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