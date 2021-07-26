package Fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		//BYTE
		Scanner leia=new Scanner(System.in);
		Byte b = 100;
		Short s = 1000;
		Integer i =Integer.parseInt("10000"); //int
		Long l = 10000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f=123.0F;
		System.out.println(f);
		Boolean bo=Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
		
	}

}
