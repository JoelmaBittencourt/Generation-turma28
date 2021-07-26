package Operadores;

import java.util.Scanner;

public class IfElseCasamento {

	public static void main(String[] args) {
		Float ana,joao;
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Quanto voce tem Ana?");
		ana=leia.nextFloat();
		
		System.out.println("Quanto voce tem jão?");
		joao=leia.nextFloat();
		
		
		if(ana+joao<25000) {
			System.out.println(" nao tera casamento");
		}
		else if(ana+joao>25000);
		System.out.println("tera casamento");
	}

		int idade;

}
