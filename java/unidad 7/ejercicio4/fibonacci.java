package ejercicio4;
  
 import java.util.Scanner;

  class fibonacci
 {           // Abre clase Fibonacci
 public static void main(String args[])
 {   // Abre main
 int numero;
 Scanner entrada = new Scanner(System.in);

 fibonacci01 miObjeto = new fibonacci01();
 System.out.println("\nEste programa calcula numeros de Fibonacci.");
 do
 {
 System.out.println("Que numero de Fibonacci quiere?");
 System.out.println("\nEl numero debe ser positivo.");
 numero = entrada.nextInt(); 
 } while ( 0 > numero );
 if ( 1 == numero )
 
 System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, 0);
 else
 {
 if ( 2 == numero )
 System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, 1);
 if ( 2 != numero)
 System.out.printf("\nEl numero de Fibonacci %d es %d\n", numero, miObjeto.Principal(numero)); 
 }
 }   // Cierra main
 }           // Cierra clase Fibonacci