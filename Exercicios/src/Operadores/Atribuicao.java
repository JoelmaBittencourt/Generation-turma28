package Operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3, b = a, c = a + b;
		c += b;//c =c+b
		c -= a;//c=c-a
		c *= b;//c=c*b
		c /= a;//c=c/a
		c %= 2;//c=c%2;0 ou 1- impar ou par

		c++;//c=c+1
		System.out.println(c);
	}

}
