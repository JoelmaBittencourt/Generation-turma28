package Controle;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
String frase= "";

do {
	System.out.println("digite sair para encerrar");
	frase=leia.nextLine();//sem leia laço infinito
}
while(!frase.equalsIgnoreCase("sair"));



	}

}
