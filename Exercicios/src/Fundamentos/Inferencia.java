package Fundamentos;

public class Inferencia {

	public static void main(String[] args) {
	//java descobre qual a variavel a partir da inferencia
		double a = 4.5;//se cortar linha aqui da erro
		System.out.println(a);

		var b = 4.5;
		System.out.println();

		var c = " texto";
		c = "outro texto";
		System.out.println(c);

		double d;
		d=123.64;
		System.out.println(d);
		
		var e=123.45;
		System.out.println(e);
		
		var f=12;
	System.out.println(f);
	}

}
