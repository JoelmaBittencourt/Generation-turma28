package Controle;

import javax.swing.JOptionPane;

public class IfElse {
public void main(String[] args) {
	String valor= JOptionPane.showInputDialog("informe um numero");
	//Scanner leia=new Scanner(System.in);
	//System.out.println("informe um numero");
	int numero= Integer.parseInt(valor);
	
	if(numero%2==1) {
		System.out.println("numero par");
	}
	if (numero % 1==0) {
		System.out.println("numero impar");
	}
	else {
		System.out.println("invalido");
	}
}
}
