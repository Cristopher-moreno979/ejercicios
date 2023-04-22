package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		// Determine el valor de la fuerza de un cuerpo que tiene por masa “M” y aceleración “A”
		double F, M, A;
		System.out.println("Escriba la masa del cuerpo");
		M=tc.nextDouble();
		System.out.println("Escriba la aceleracion del cuerpo");
		A=tc.nextDouble();
		F=M*A;
		System.out.println("La fuerza que lleva este cuerpo es de: "+ F);

	}

}
