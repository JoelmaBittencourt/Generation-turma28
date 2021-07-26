package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String dia, segunda, terca, quarta, quinta, sexta, sabado;
		System.out.println("Digite um dia da semana");
		dia = leia.next();

//ignorando letras maiusculas eminusculas
		if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("1");
		}

		else if (dia.equalsIgnoreCase("terca")) {// substitui==
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("3");
		}

		else if (dia.equalsIgnoreCase("quinta")) {// substitui==
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("5");
		}

		else if (dia.equalsIgnoreCase("sabado")) {// substitui==
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("7");
		}

		else {// substitui==
			System.out.println("Dia invalido");

		}
	}

}
