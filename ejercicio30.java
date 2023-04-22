package ejercicios;

import java.util.Scanner;

public class ejercicio30 {

	public static void main(String[] args) {
		Scanner tc=new Scanner(System.in);
		/*Escriba un programa que tenga como entrada la lectura de dos
		 *  números llamados “X” y “Y” y que imprima una salida que corresponda a cada uno de los pares. 
 
a)	(-X, -Y) Entonces sumar los cuadrados de cada componente. 
b)	(-X, Y) Entonces restar al valor Y el valor de X. 
c)	(X, -Y) Entonces dividir X entre Y 
d)	(X, Y) Entonces verificar si X es mayor que Y, si es así sumarle a X el valor de Y, 
si no obtener la raíz cuadrada de X. */
		int x, y, powx, powy, sum, res, div, sum2 ;
		System.out.println("Escriba un valor para x: ");
		x=tc.nextInt();
		System.out.println("Escriba un valor para y: ");
		y=tc.nextInt();
		if(x<0 && y<0) {
			powx=(int)Math.pow(x, 2);
			powy=(int)Math.pow(y, 2);
			sum=powx+powy;
			System.out.println("La suma de los cuadrados de cada componente es: "+sum);
		}
		if(x<0 && y>0) {
			res=y+x;
			System.out.println("La resta entre y & x es: "+res);
		}
		if(x>0 && y<0) {
			div=x/y;
			System.out.println("La division entre x & y es: "+div);
		}
		if(x>0 && y>0) {
			if(x>y) {
				sum2=x+y;
				System.out.println("La suma entre x & y es: "+sum2);
			}else {
				System.out.println("la raiz cuadrada de x es: "+Math.sqrt(x));
			}
			
		}


	}

}
