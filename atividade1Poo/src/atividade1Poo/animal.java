package atividade1Poo;

public class animal {
//primeiro escolhe public ou private, com privado so a classe que esta pode usar,no publico pode ser usado em qualquer pack
	//depois definir os atributos e formato(string,int etc)
	public String nome;
	public int idade;
	public String Emitirsom;
	public String corre;
	public String subirEmArvore;
	//criar get set,botao direito source, o get mostra,o set insere a informaçao
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmitirsom() {
		return Emitirsom;
	}
	public void setEmitirsom(String emitirsom) {
		Emitirsom = emitirsom;
	}
	public String getCorre() {
		return corre;
	}
	public void setCorre(String corre) {
		this.corre = corre;
	}
	public String getSubirEmArvore() {
		return subirEmArvore;
	}
	public void setSubirEmArvore(String subirEmArvore) {
		this.subirEmArvore = subirEmArvore;
	}
	// criar constructor, vai escolher quais atributos vai querer ultilizar,sem uma subclasse nao teria 
	//construtor,botao direio,source,constructor
	public animal(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
		
	}// criar constructor, vai escolher quais atributos vai querer ultilizar,sem uma subclasse nao teria 
	//construtor,botao direio,source,constructor,escrever nome diferente pra nao ficar duplicado e void pra reconhecer
	public void animal2 (String nome, int idade, String emitirsom, String subirEmArvore) {
		
		this.nome = nome;
		this.idade = idade;
		Emitirsom = emitirsom;
		this.subirEmArvore = subirEmArvore;
	}// cria uma terceira por padrao
	public animal() {
		
	}
	
	
	
	
	
}
