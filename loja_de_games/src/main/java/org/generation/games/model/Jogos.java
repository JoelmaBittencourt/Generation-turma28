package org.generation.games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="jogos")
public class Jogos {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min=5,max=20)
	private String jogos;
	@NotNull
	@Size(min=5,max=50)
	private String descriçao;
	@NotNull
	private double preço;
	
	
@ManyToOne
@JsonIgnoreProperties("jogos")//relaçao entre tabelas
private Categoria categoria;


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getJogos() {
	return jogos;
}


public void setJogos(String jogos) {
	this.jogos = jogos;
}


public String getDescriçao() {
	return descriçao;
}


public void setDescriçao(String descriçao) {
	this.descriçao = descriçao;
}


public double getPreço() {
	return preço;
}


public void setPreço(double preço) {
	this.preço = preço;
}


public Categoria getCategoria() {
	return categoria;
}


public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

	
	
	
	
}
