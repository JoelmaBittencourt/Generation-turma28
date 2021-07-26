package Fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		// soma 2+3
		// System.out.println(2+3);
		double raio = 3.4;
		final double pi = 3.14159;

		double area = pi * raio * raio;
		System.out.println(area);
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Area=" + area);
	}

}
