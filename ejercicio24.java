package ejercicios;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		/* Escriba un programa que lea un numero A, si A
		es un número positivo calcule Y=2^A, si es negativo calcule
				Y=A+5 imprimir el resultado de Y*/
            Scanner tc=new Scanner(System.in);
      int A, y;
      System.out.println("Escriba un numero");
      A=tc.nextInt();
      if(A>0) {
    	  System.out.println("Si su numero es positivo se imprimira la siguiente ecuacion: ");
    	  System.out.println("Y=2^A");
    	  y=(int )Math.pow(2, A);
    	  System.out.println("El valor de Y es: "+y);
      }else {
    	  System.out.println("Si su numero es negativo se imprimira la siguiente ecuacion: ");
    	  System.out.println("Y=A+5");
    	  y=A+5;
    	  System.out.println("El valor de Y es: "+y);
      }
      

	}

}
