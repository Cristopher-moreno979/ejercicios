package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/*Determinar la solución lineal
		que tiene la forma ax + b =0 donde a y b son números reales*/
		double a, b, x;
		System.out.println("Soluciones lineales de la ecuacion ax + b =0");
		System.out.println("Escriba el valor de a: ");
		a=tc.nextDouble();
		System.out.println("Escriba el valos de b: ");
		b=tc.nextDouble();
		x=(-b)/a;
		System.out.println("El valos de x es: "+x);
		

	}

}
