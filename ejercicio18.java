package ejercicios;

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
    	Scanner tc=new Scanner(System.in);
     int a, c1, c2, c3;
     System.out.println("Escriba un numero de tres cifras");
     a=tc.nextInt();
     if(a<=99 || a>=1000) {
    	 System.out.println("intentelo de nuevo");
     }else {
    	 System.out.println("El inverso de su numero es: ");
     c3=a%10;
     c2=a%100/10;
     c1=a%1000/100;
     System.out.println(c3+""+c2+""+c1);
     }
     
       
        
       
    }
}