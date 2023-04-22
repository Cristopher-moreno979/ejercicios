package ejercicios;

import java.util.Scanner;

public class ejercicio32 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/*	Las calificaciones de los alumnos en un instituto
		 *  son consideradas de la siguiente forma:
		 *  a) A es 90 o más
		 *  b)	B es al menos 80 pero menos de 90. 
            c)	C es al menos 70 pero menos de 80. 
            d)	D es al menos 65 pero menos de 70. 
            e)	E es menos de 65 */
		int nota;
		System.out.println("Escriba la nota del estudiante");
		nota=tc.nextInt();
		if(nota>=90) {
			System.out.println("La clalificacion del estudiante es de clase A ");
		}
		if(nota>=80 && nota<90) {
			System.out.println("La clalificacion del estudiante es de clase B ");
		}
		if(nota>=70 && nota<80) {
			System.out.println("La clalificacion del estudiante es de clase C ");
		}
		if(nota>=65 && nota<70) {
			System.out.println("La clalificacion del estudiante es de clase D ");
		}
		if(nota<65) {
			System.out.println("La clalificacion del estudiante es de clase E ");
		}

	}

}
