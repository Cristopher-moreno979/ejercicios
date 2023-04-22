package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		//Convertir X grados Fahrenheit a grados Celsius. Celsius= 5/9 (Fahrenheit -323)
		
		double fahrenheit, celsius;
		
		System.out.println("Escriba los grados Fahrenheit");
		fahrenheit=tc.nextDouble();
		celsius=(fahrenheit-32)*5/9;
		System.out.println("Su conversion a celsius es: "+ celsius+"celsius");
		

	}

}
