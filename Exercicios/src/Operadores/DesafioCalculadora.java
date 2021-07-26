package Operadores;
import java.util.*;
public class DesafioCalculadora {

	private static Scanner entrada;

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		int num1,num2;
System.out.println("Digite o primeiro numero");
num1=leia.nextInt();
System.out.println("Digite o segundo numero");
num2=leia.nextInt();
System.out.println("escolha a operaçao");
String op=leia.next();

System.out.println(num1+ op+ num2);

double resultado="+".equals(op)? num1+num2:0;
resultado="-".equals(op) ? num1- num2: resultado;
resultado="*".equals(op) ? num1* num2: resultado;
resultado="/".equals(op) ? num1/ num2: resultado;
resultado="%".equals(op) ? num1% num2: resultado;

System.out.printf("%.2f %s %.2f=%.2f", num1,op,num2,resultado);

entrada.close();
	}

}
