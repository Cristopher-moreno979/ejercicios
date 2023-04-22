package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		//Convertir Y yardas, F pies y I pulgadas a Centímetros
double Y, F, P, C;
System.out.println("Convertir Yardas a Centimetros");
Y=tc.nextDouble();                
          Y=Y*91.44;
          System.out.println("En centimetros es: "+Y);
          System.out.println("Convertir Pies a centimetros");
          F=tc.nextDouble();
          F=F*30.48;
          System.out.println("En centimetros es: "+F);
          System.out.println("Convertir Pulgadas a centimetros");
          P=tc.nextDouble();
          P=P*2.54;
          System.out.println("En centimetros es: "+P);
          
	}

}
