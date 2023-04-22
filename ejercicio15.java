package ejercicios;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		//Determinar el valor del determinante de segundo orden
		Scanner tc=new Scanner(System.in);
		int a, b, c, d, det;
		System.out.println("Escriba los valores de la matriz");
		System.out.println("[a,d]");
		System.out.println("[c,b]");
		System.out.println("Escriba el valor de a");
		a=tc.nextInt();
		System.out.println("Escriba el valor de b");
		b=tc.nextInt();
		System.out.println("Escriba el valor de c");
		c=tc.nextInt();
		System.out.println("Escriba el valor de d");
		d=tc.nextInt();
		det=(a*b)-(c*d);
		System.out.println("El determinante es de: "+det);
	}
}