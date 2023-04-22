package ejercicios;

import java.util.Scanner;

public class ejercicio19 {
char ñ;
	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
	/*Escriba un programa que lea la edad de una persona e imprima
	es votante dado que tiene 16 o más años de edad*/
		int n;
		System.out.println("Escriba su edad");
		n=tc.nextInt();
		if(n>=16) {
			System.out.println("Es votante dado que tiene 16 o mas años de edad");
		}else {
			System.out.println("No es votante dado a que no tiene 16 o mas años de edad");
		}
		

	}

}
