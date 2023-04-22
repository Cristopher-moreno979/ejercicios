package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		// calcular el volumen de un cilindro coniciendo el radio y la altura
		
	double r, h, ab, v ;
	 System.out.println("Escriba el radio del cilindro");
	 r=tc.nextDouble();
	 System.out.println("Escriba la altura del cilindro");
	 h=tc.nextDouble();
	 
	 ab= (double) Math.PI*Math.pow(r,2);
	 v=ab*h;
	 
	 System.out.println("El volumen del cilindro es: "+ v);
	 
	 
	
	
	

	}

}
