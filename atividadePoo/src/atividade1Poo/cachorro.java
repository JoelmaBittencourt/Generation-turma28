package atividade1Poo;
//cria na classe mae o nome da segunda classe,extendes para entender que cachorro e extensao de animal
public class cachorro extends animal {
	//cachorro e tipos de variavel do construtor cachorro
public cachorro(String nome, int idade) {
	//super pra informar que e uma extensao de animal
	super(nome,idade);
}// atributo da subclasse, herdou 2 da super classe e criou dois 
	String Devecorrer;
	String EmitirSom;
	
	
	public cachorro(String nome, int idade, String devecorrer, String emitirSom) {
		super(nome, idade);
		Devecorrer = devecorrer;
		EmitirSom = emitirSom;
	}
	


}
