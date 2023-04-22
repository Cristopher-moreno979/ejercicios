package ejercicios;

import java.util.Scanner;
//Deeterminar el perimetro de una circunferencia y el area

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		double radio, perimetro, area;
		
		System.out.println("Ingrese el radio de la circunferencia");
		radio=tc.nextInt();
		
		System.out.println("El area de la circunferencia es: ");
		area=(double) (Math.PI*(radio*radio));
		System.out.println(area);
		System.out.println("El perimetro de la circunferencia es: ");
		perimetro=2*Math.PI*radio;
		System.out.println(perimetro);

	}

}
