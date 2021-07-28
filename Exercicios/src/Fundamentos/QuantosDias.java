package Fundamentos;

import java.util.Scanner;

public class QuantosDias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias;
		System.out.println("Quantos anos voce tem");
		anos = leia.nextInt();
		System.out.println("Quantos meses voce tem");
		meses = leia.nextInt();
		System.out.println("Quantos dias voce tem");
		dias = leia.nextInt();

		System.out.println("voce tem : " + anos + meses + dias + "dias");

	}

}
