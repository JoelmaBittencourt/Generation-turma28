package Fundamentos;

public class TipoString {

	public static void main(String[] args) {
		//PARA DESCOBRIR  A LETRA CORRESPONDENTE A UM NUMERO " ".charAt
		System.out.println("Ola pessoal".charAt(7));//7=LETRA S

		String s="Boa tarde";
		s=s.toUpperCase();
		s="Bom dia";//modificando S
		System.out.println(s.concat("!!!"));
		//boolean
		System.out.println(s.startsWith("Boa"));
		
		System.out.println(s.toLowerCase().startsWith("tarde!!!"));
		System.out.println(s.length());
		System.out.println(s.equals("BOA TARDE"));//COMPARAÇAO
		
		var nome = "pedro";
		var sobrenome= "santos";
		var idade= 33;
		var salario= 1234.547;
		//System.out.println("nome:"+ nome+ "\nsobrenome:" + sobrenome + "\nidade:" 
		//+ idade + "\nsalario:"+ salario);
		
		System.out.printf("nome: %s %s tem %d anos e ganha R$%.2f",nome,sobrenome,idade,salario);// para imprimir com espaço
		
		
	}

}
