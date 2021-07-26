package Fundamentos;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		double a=1;// conversao implicita
		System.out.println(a);
		
		float b=1.4558878855F;//valor sera truncado por ser muito grande conversao explicita
		System.out.println(b);
		
		int c=128;
		Byte d=(byte)c;
		System.out.println(d);
		
		double e=1.9999;
		int f= (int) e;//explicita
		System.out.println(f);

	}

}
