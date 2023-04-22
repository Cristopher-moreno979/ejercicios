package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		// hayar el area de un triangulo conociendo sus tres lados 
		double a, b, c, perimetro, area, s;
		
		System.out.println("Ingrese el lado 1");
		a=tc.nextDouble();
		System.out.println("Ingrese el lado 2");
		b=tc.nextDouble();
		System.out.println("Ingrese el lado 3");
		c=tc.nextDouble();
		perimetro=a+b+c;
		s=perimetro/2;
		area=(double) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("El area del triangulo es: "+area);
		

	}

}
