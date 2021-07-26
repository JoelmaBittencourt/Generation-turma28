package Operadores;

public class DesafioLogicoBoolean {

	public static void main(String[] args) {
		boolean trabalho1 = false, trabalho2 = true;

		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean saudavel = !sorvete;
		System.out.println("comprou tv 50? " + comprouTv50);
		System.out.println("comprou tv 32? " + comprouTv32);
		System.out.println("comprou sorvete " + sorvete);
		System.out.println("mais saudavel " + saudavel);
	}

}
