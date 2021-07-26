package Fundamentos;

public class TiposPrimitivos {

	private static final double pontosAcumulados = 0;

	public static void main(String[] args) {
		//TIPOS NUMERICOS INTEIROS
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumiulados = 3_134_845_223L;
	
		// TIPOS NUMERICOS REAIS
		
		float salario=11_445.F;
		double vendasAcumuladas=2_991_797_103.01;
		
		//TIPO BOOLEANO
		boolean estaDeFerias=false; //true
		
		//TIPO CARACTERE
		char status= 'a'; //ativo
		//quantos dias trabalhados na empresa
		System.out.println(anosDeEmpresa*365);
		
		//NUMERO DE VIAGENS
		System.out.println(numeroDeVoos/2);
		
		// PONTOS POR REAL
		System.out.println(pontosAcumulados/ vendasAcumuladas);
		
		System.out.println(id+": ganha ->"+ salario);
		System.out.println("ferias?"+ estaDeFerias);
		System.out.println("status\t"+ status);
		
	}

}
