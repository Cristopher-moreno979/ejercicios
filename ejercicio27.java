package ejercicios;

import java.util.Scanner;

public class ejercicio27 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/*Unos pantalones se venden a 10 dólares cada uno si se compran más 
		 * de tres, 12 dólares en los demás casos, estructure un programa que lea un
		 *  número de entrada de pantalones comprados e imprima el costo total. */
		int x;
		System.out.println("¿Cuantos pantalones desea comprar?");
		x=tc.nextInt();
		if(x>3) {
			System.out.println("El precio de sus pantalones es: ");
			x=x*10;
			System.out.println(x);
		}else {
			System.out.println("El precio de sus pantalones es: ");
			x=x*12;
			System.out.println(x);
		}
		

	}

}
