package ejercicios;

import java.util.Scanner;

public class ejercicio34 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		// Escriba un programa que lea “n” números enteros y que los imprima
		int n;
		System.out.println("Imprimir n numeros enteros");
		n=tc.nextInt();
		for(int x=1; x<=n;x++)
		System.out.println("["+x+"]");

	}

}
