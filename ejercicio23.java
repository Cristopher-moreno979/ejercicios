package ejercicios;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		
		Scanner tc=new Scanner(System.in);
		/*Escribir un programa que lea la calificación de un alumno
		   e imprima el mensaje de aprobado si su calificación es mayor
		    o igual a 60, en caso contrario imprima reprobado*/ 
		int n;
		System.out.println("Escriba la nota del alumno");
		n=tc.nextInt();
		if(n<=60) {
			System.out.println("El alumno a reprobado");
		}else {
			System.out.println("El alumno aprovo");
		}

	}

}
