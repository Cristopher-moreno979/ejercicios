package ejercicios;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/*Escriba un programa que lea dos números enteros como entrada
		 *  y escriba el mensaje signos opuestos si y solo si uno de los 
		 *  enteros es positivo y el otro negativo. */
		int x, y;
		System.out.println("Escriba 2 numeros enteros");
		System.out.println("Primer numero: ");
		x=tc.nextInt();
	    System.out.println("Segundo numero: ");
		y=tc.nextInt();
		if(x<0 || y<0) {
			if(x<0 && y<0){
				System.out.println("Signos iguales");
			}else {
			System.out.println("Signos opuestos");
			}
		}else {
			System.out.println("Signos iguales");
		}

	}

}
