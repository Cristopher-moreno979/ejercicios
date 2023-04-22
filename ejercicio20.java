package ejercicios;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		/*Escriba un programa que lea un número cualquiera e imprima 
		si es par o impar.*/
		int n;
		System.out.println("Adivinar si un numero es par o impar");
		System.out.println("Escriba un numero");
		n=tc.nextInt();
		if(n%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}

	}

}
