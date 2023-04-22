package ejercicios;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/*Determinar la energía total que almacena un cuerpo si su 
		energía cinética es 1/2 de la masa por su velocidad al cuadrado y la energía potencial es el 
		producto de la masa, altura y la constante de gravedad. Recuerde que ET = EC +EP. */
		
		
		Double m, v, h, Ep, Ec, Et, g=9.81;
		System.out.println("Energia cinetica de un cuerpo");
		System.out.println("Escriba la masa del cuerpo en Kg");
		m=tc.nextDouble();
		System.out.println("Escriba la velocidad del cuerpo en m/s");
		v=tc.nextDouble();
		Ec=(m*Math.pow(v, 2))/2;
		System.out.println("La energia cinetica es de: "+Ec+" J");
		System.out.println("Energia potencial");
		
		System.out.println("Escriba su altura en m");
		h=tc.nextDouble();
		Ep=m*h*g;
		System.out.println("La energia potencial es de: "+Ep+" J");
		Et=Ec+Ep;
		System.out.println("Y su energia total es de: "+Et+" J");
		

	}

}
