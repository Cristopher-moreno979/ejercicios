package ejercicios;

import java.util.Scanner;

public class ejercicio31 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/*  UN triángulo es equilátero si posee sus tres lados iguales
		 * , es Isósceles si tiene solamente dos lados iguales y es escaleno
		 *  cuando todos sus lados son desiguales. Escribir un programa que lea
		 *   las dimensiones de los lados del triángulo y presente como salida
		 *    el mensaje de su clasificación de triangulo. */
		int L1, L2, L3;
		System.out.println("Escriba los lados del triangulo");
		System.out.println("Lado 1: ");
		L1=tc.nextInt();
		System.out.println("Lado 2: ");
		L2=tc.nextInt();
		System.out.println("Lado 3: ");
		L3=tc.nextInt();
		if(L1==L2 && L2==L3) {
			System.out.println("Su triangulo es Equilatero");
		}
		if(L1==L2 && L1!=L3 || L1==L3 && L1!= L2 || L2==L3 && L2!=L1) {
			System.out.println("Su triangulo es Isoseceles");
		
		}
		if(L1!=L2 && L2!=L3 && L1!=L3) {
			System.out.println("Su triandulo es Escaleno");
		}

	}

}
