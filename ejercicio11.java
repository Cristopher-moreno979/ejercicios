package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		// Obtener el valor del Coseno de un número cualquiera. 
		Double a;
	
		System.out.println("Escriba un numero");
		a=tc.nextDouble();
		
		
		
		System.out.println("El coseno de "+ a + " es: "+Math.cos(a)+ " En radianes");
		

	}

}
