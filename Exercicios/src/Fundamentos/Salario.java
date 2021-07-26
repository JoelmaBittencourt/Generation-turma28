package Fundamentos;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// 3 salarios e a madia deles

		float salario, salario2, salario3, media;
		Scanner leia = new Scanner(System.in);

		System.out.println("qual o seu primeiro salario");
		salario = leia.nextFloat();
		System.out.println("qual o seu segundo salario");
		salario2 = leia.nextFloat();
		System.out.println("qual o seu terceiro salario");
		salario3 = leia.nextFloat();

		media = (salario + salario2 + salario3) / 3;
		System.out.printf("a media é  R$%.2f", media);
	}

}
