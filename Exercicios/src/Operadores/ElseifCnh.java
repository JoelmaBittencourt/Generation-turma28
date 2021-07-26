package Operadores;

import java.util.Scanner;

public class ElseifCnh {

	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);

		System.out.println("Qual a sua idade?");
		idade = leia.nextInt();

		if (idade < 18) {
			System.out.println("Menor de idade não pode tirar Cnh!!");
		} else if (idade >= 18 && idade <= 100) {
			System.out.println("Apto a tirar Cnh");
		} else {
			System.out.println("Idade ivalida");
		}
	}

}
