package Controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("informe a media");
		double media = leia.nextDouble();
		if (media >= 7 && media <= 10) {
			System.out.println("Aprovade!!!");
		
		}
		if (media<7 && media>=4.5) {
			System.out.println("Recuperaçao");
		}
		if (media<4.5 && media>0) {
			System.err.println("Reprovado");
			leia.close();
		}
	}

}
