package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		
		int num;
		double resultado;
		System.out.println("Calcular la raiz cuadrada de ");
			
		num=tc.nextInt();
		resultado=Math.sqrt(num);
		
		System.out.println("La raiz cuadrada de "+ num +" es: "+ resultado);
		
		
		
		

	}

}
