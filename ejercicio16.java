package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
    	/*16.	Determinar las soluciones de N sistema de ecuaciones lineales con dos 
    	 * incógnitas aplicando el método de Cramer.  ax + by = c dx + ey = f 
    			Donde a,b,c,e,f son números reales. */
        Scanner tc = new Scanner(System.in);
        int a, b, c, d, e, f;
        double Dx, Dy, Ds, x, y;
        System.out.println("Soluciones lineales de la ecuacion");
        System.out.println("ax+by=c");
        System.out.println("dx+ey=f");
        System.out.println("Ingrese el valor de a");
        a=tc.nextInt();
        System.out.println("Ingrese el valor de b");
        b=tc.nextInt();
        System.out.println("Ingrese el valor de c");
        c=tc.nextInt();
        System.out.println("Ingrese el valor de d");
        d=tc.nextInt();
        System.out.println("Ingrese el valor de e");
        e=tc.nextInt();
        System.out.println("Ingrese el valor de f");
        f=tc.nextInt();
        Ds=(a*e)-(d*b);
        Dx=(c*e)-(f*b);
        Dy=(a*f)-(d*c);
       x=Dx/Ds;
       y=Dy/Ds;
       System.out.println("El valor de x es: "+x);
       System.out.println(" El valor de y es: "+y);
       
    }
}