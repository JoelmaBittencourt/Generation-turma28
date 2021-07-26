package Fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		double a = 2.3;
		String s = "bom dia x";
		int a1;

//s.replace para renomear uma string
		// sem s=s não funciona
		s = s.replace("x", "Senhora");
//sem s=s não funciona
//s.toUpperCase faz com que as strin sejam convertidas pra letras maiusculas
		s = s.toUpperCase();
//para contatenar
		s = s.concat("!!!");

		System.out.println(s);
//pode adicicionar to upper case direto na frase contatenando
		System.out.println("Maria".toUpperCase());
//renomeando com contatenaçao
//pode quebrar linha antes ou depois dos pontos
		String y = "bom dia x".replace("x", "Gui".toUpperCase());
		System.out.println(y);
//tipos primitivos nao tem . (atributos)
		a1 = 3;
		System.out.println(a1);// o .toupper etc aqui nao funciona
	}

}
