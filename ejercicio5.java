package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		/*	Evaluar la Función Y= 5X^4 + 2X^3 + 3X^2 + 7 para el valor de:
		a)	X=1; 
		b)	X un número cualquiera*/

		Scanner tc=new Scanner(System.in);
		int  y, x; 
		
		
		System.out.println("Evaluar la Función Y= 5X^4 + 2X^3 + 3X^2 + 7 ");
		
		 System.out.println("Para x=1, 1 elevado a cualquie exponente sigue siendo 1");
		 y=5+2+3+7;
		 System.out.println("por tanto el valor de y es: "+ y);
		 System.out.println("para x=un numero cualquiera ");
		x=tc.nextInt();
		y=(5*x*x*x*x)+(2*x*x*x)+(3*x*x)+7;
		System.out.println("El valor de y es: "+y);
		

	}

}
