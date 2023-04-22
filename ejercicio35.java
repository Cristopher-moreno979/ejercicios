package ejercicios;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		//Escriba un programa que lea tres números cualesquiera y que calcule la suma de ellos y su promedio. 
		double a, b, c, p, sum;
		System.out.println("Suma y promedio de 3 notas");
		System.out.println("nota1: ");
		a=tc.nextInt();
		System.out.println("nota2: ");
		b=tc.nextInt();
		System.out.println("nota3: ");
		c=tc.nextInt();
		sum=a+b+c;
		p=(a+b+c)/3;
		System.out.println("La suma de las notas es: "+sum);
		System.out.println("El promedio de las notas es: "+p);

	}

}
