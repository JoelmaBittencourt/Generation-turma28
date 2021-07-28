package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
int totalN=0;
double nota=0,total=0;

while(nota!=-1) {
	System.out.println("digite -1 para sair");
	System.out.println("informe a nota");
	nota=leia.nextDouble();
	if(nota<=10 && nota>=0){
	
	total+=nota;
	totalN++;
	}
	else if(nota!=-1){
		System.out.println("nota invalida");
	}
	}
double media=total/totalN;
System.out.println("media="+ media);
	}

}
