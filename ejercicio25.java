package ejercicios;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		/*Escribir un programa que lea un número cualquiera
		e imprima si el número leído es divisible por tres*/
		Scanner tc=new Scanner(System.in);
		int n;
		System.out.println("Escriba un numero");
		n=tc.nextInt();
		if(n%3==0) {
			System.out.println("Su numero si es divisible por 3");
		}else {
			System.out.println("Su numero no es divisible por 3");
		}

	}

}
