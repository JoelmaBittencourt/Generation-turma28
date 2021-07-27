package Controle;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String texto = "";
		do {
			System.out.println("voce precisa falar as palavras magicas");
			System.out.println("quer sair");
			texto = leia.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));// enquanto for diferente de por favor
		System.out.println("obrigada");
	}

}

