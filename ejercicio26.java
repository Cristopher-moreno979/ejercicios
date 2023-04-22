package ejercicios;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
		/*Escriba un programa independiente para cada inciso considerando
		   una lectura de distintos números tal como se detallan a continuación.  
            a) XY    b) XYZ     c) XYZW */ 
		Scanner tc=new Scanner(System.in);
		int n;
		int programa = 0;
		System.out.println("Eliga una de las opciones");
		System.out.println("1) Imprimir un numero de 2 cifras");
		System.out.println("2) Imprimir un numero de 3 cifras");
		System.out.println("3) Imprimir un numero de 4 cifras");
		programa=tc.nextInt();
		switch (programa) {
		case 1:
			System.out.println("Escriba su numero de 2 cifras ");
			n=tc.nextInt();
			if(n>=100) {
				System.out.println("Su numero no es de 2 cifras");
			}else {
				System.out.println("Usted acaba de imprimir el numero: "+n);
			}
			break;
		case 2:
			System.out.println("Escriba su numero de 3 cifras ");
			n=tc.nextInt();
			if(n<=99 || n>=1000) {
				System.out.println("Su numero no es de 3 cifras");
			}else {
				System.out.println("Usted acaba de imprimir el numero: "+n);
			}
			break;
		case 3:
			System.out.println("Escriba su numero de 4 cifras ");
			n=tc.nextInt();
			if(n<=999 || n>10000) {
				System.out.println("Su numero no es de 4 cifras ");
				
			}else {
				System.out.println("Usted acaba de imprimir el numero: "+n);
			}
			break;
		default :
			System.out.println("La opcion que ha elegido no existe");
				
		}

	}

}
