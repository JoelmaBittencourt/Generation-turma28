package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print("dia!!!\n\n");

		System.out.println("Bom");
		System.out.println("dia");

		System.out.printf("Megasena %d %d %d %d %d %n", 1, 2, 3, 4, 5);// dar espaço e pular linha

		System.out.printf("Salario: %.1f %n", 12134.5678);// 1 mumero depois da virgula

		System.out.printf("nome: %s\n", 1234.5678);// dar espaço

		Scanner leia = new Scanner(System.in);// pra usar precisa do java.util (ctrl+shift+o)
		System.out.println("Digite seu nome");
		String nome = leia.nextLine();

		System.out.println("\n\nnome=" + nome);

	}

}
