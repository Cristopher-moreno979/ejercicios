package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/* Determine el valor de Y=X*C-2 donde C es una constante con valor C=2.5
		a) Sabiendo que X=2
		b)Considerando a X un valor cualquiera*/
		
		double y, x, c=2.5;
		
		System.out.println("Funcion y=x*c-2 cuando x=2 y sabiendo que c=2.5");
		y=(2*2.5)-2;
		System.out.println("El resultado de y es: "+y);
		System.out.println("Funcion y=x*c-2 cuando x=cualquier valor y sabiendo que c=2.5");
		System.out.println("Escriba el valor de x ");
		x=tc.nextInt();
		y=(x*c)-2;
	    System.out.println("El valor de y es: "+ y);
		
		
	}

}
