package Operadores;

public class Unarios {

	public static void main(String[] args) {
		int a=1, b=2;
		a++;//a=a+1
		a--;//a=a=1

		++b;//b=b+1
		--b;//b=b-1
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a== b--);//vai comparar com b antes de comparar com b-- por isso verdadeiro
		
		System.out.println(a==b);//resposta correta
		System.out.println(b);
	}

}
