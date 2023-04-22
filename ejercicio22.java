package ejercicios;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
	/* Escribir un programa para calcular el interés de una capital
		conforme a la siguiente condición. Si el capital prestado es mayor que
		10,000 dólares entonces la tasa es del 7% en caso contrario del 6%, debe
		imprimir el capital y su interés. */
		double capital;
		System.out.println("Escriba su capital en dolares");
		capital=tc.nextDouble();
		if(capital>10000) {
			capital=capital-(capital*0.07);
			System.out.println("Su capital es de: "+capital+" debido a que la taza de interes del 7%");
		
		}else {
			capital=capital-(capital*0.06);
			System.out.println("Su capital es de: "+capital+" debido a que la taza de interes del 6%");
		}

	}

}
