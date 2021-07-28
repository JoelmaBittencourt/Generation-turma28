package Controle;

import java.util.Scanner;

public class ElseIfTomates {

	public static void main(String[] args) {
		int kl,excesso,multa,valor;
		Scanner leia = new Scanner(System.in);
		System.out.println("quantos kilos de tomate voce tem");
kl=leia.nextInt();

if (kl<=50) {
	System.out.println("sem multa, o total a pagar sera\t"+ kl*5);
}
else if(kl >50 && kl<100) {
	System.out.println("Pagara multa de\t" + kl*10);
}
else {
	System.out.println("dados invalidos");
}
	}

}
