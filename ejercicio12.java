package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
    	//Obtener el promedio de N notas. 
        double n,s=0,x;
        double p;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos:");
        n=teclado.nextInt();
   
        for(int i=1;i<=n;i++)
        { 
         System.out.println("Nota ["+i+"]=");
         x=teclado.nextInt();
         s=s+x;                
        }   
        p=s/n; 
        
         System.out.println("El Promedio es:" +p);                               
    }   
}
