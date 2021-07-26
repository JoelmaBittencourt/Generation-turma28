package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	String Resposta;
     int contador=1;
	
  do{//faça
		contador++;
		System.out.println(contador); 
		
	System.out.println("Continuar?");   
     Resposta= leia.next();
	}
    while(Resposta.equals("sim"));
  
  
  System.out.println("encerrado " +contador);   
	}

}
