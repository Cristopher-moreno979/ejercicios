package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		/* convertir kilogramos a libras 
		1K=2.2libras*/
		Scanner tc= new Scanner(System.in);
		double kilos, libras=2.2046;
		
		System.out.println("Cantidad de kilos a convertir ");
		kilos=tc.nextDouble();
		kilos=kilos*libras;
		System.out.println("La cantidad en libras es: "+kilos+"lb");

	}

}
