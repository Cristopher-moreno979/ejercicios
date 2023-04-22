package ejercicios;
//determinar el area de un rectangulo

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
         int base, altura, area;
          System.out.println("Escriba la base del rectangulo");
          base=tc.nextInt();
          if(base<0) {
        	  System.out.println("Las logitudes no pueden ser negativas");
          }else {
          System.out.println("Escriba la altura del rectangulo");
          altura=tc.nextInt();
          if(altura<0) {
        	  System.out.println("Las logitudes no pueden ser negativas");
          }else {
        	  area=base*altura;
              System.out.println("El area del rectangulo es: "+ area);
              
          }
          
         
          }
	}

}
