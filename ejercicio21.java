package ejercicios;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		/* 21.	Escriba un programa que lea un número que verifique
		si X es negativo que calcule X^4 en caso contrario que calcule X^2.*/ 
		int x;
		System.out.println("Escriba un valor para X");
		x=tc.nextInt();
		if(x<0) {
			System.out.println("X^4 es: "+Math.pow(x, 4));
		}else {
			System.out.println("X^2 es: "+Math.pow(x, 2));
		}

	}

}
