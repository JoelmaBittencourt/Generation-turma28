package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		System.out.println("digite sair para interromper o programa");
		
		String valor="";
		while(!valor.equalsIgnoreCase("sair")) {//pare quando digitar sair
		System.out.println("voce diz;");
		valor=leia.nextLine();
	
		}

	}

}
