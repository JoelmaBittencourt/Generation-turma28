package atividade1Poo;

public class testeAnimais {
//cria com main pra compilar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//instanciou a classe cachorro
	cachorro doguinho=new cachorro("Danadinho", 4,"au-au-au","sim ele corre");
	//getNome foi pegar a informaçao e trouxe para ca
	System.out.println(doguinho.getNome());
	System.out.println(doguinho.getIdade());
	System.out.println(doguinho.getEmitirsom());
	System.out.println(doguinho.getCorre());
}
}
