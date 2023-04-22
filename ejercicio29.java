package ejercicios;

import java.util.Scanner;

public class ejercicio29 {

	public static void main(String[] args) {
	    Scanner tc=new Scanner(System.in);
		/*Escriba un programa que lea dos números enteros positivos
		 *  distintos y escriba la diferencia entre el mayor y el menor.
		 *   Asegúrese que su programa escriba por ejemplo 8 si los números son 10 y 2 o bien 2 y 10. */
	    int a, b;
	    System.out.println("Escriba 2 numeros enteros ");
	    System.out.println("numero 1: ");
	    a=tc.nextInt();
	    System.out.println("numero 2: ");
	    b=tc.nextInt();
	    if(a>b) {
	    	a=a-b;
	    	System.out.println("La resta del mayor con el menor es: "+a);
	    
	    }else {
	    	b=b-a;
	    	System.out.println("La resta del mayor con el menor es: "+b);
	    }

	}

}
