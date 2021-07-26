package Controle;

public class WhileDeterminado {

	public static void main(String[] args) {

		// System.out.println("Bon dia!");
		// System.out.println("Bon dia!");
		// System.out.println("Bon dia!");
		// System.out.println("Bon dia!");
		// System.out.println("Bon dia!");
		// System.out.println("Bon dia!");
		// System.out.println("Bon dia!");

		int contador = 1;
		while (contador <= 10) {// laço infinito por que nunca dara falso
			System.out.println("Bom dia");
			contador++;// para repetir 10*
			// contador=20;//vai parar por que 20 é maior que 10
		}
		int contador1 = 2;
		while (contador1 <= 10) {// laço infinito por que nunca dara falso
			System.out.printf("i=%d\n");
			contador1++;// para repetir 10*
			contador1 += 2;// vai contar de 2 em 2 a partir do1
		}
	}

}
