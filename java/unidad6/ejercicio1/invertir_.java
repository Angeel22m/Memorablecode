import java.util.Scanner;

 public class invertir_

 {      // Abre clase UsaDeitel_6_26
 
 public static void main(String args[])
 {           // Abre main

 Scanner entrada = new Scanner(System.in);
 int numero;
 Deitel_6_26 miObjeto = new Deitel_6_26();


 System.out.println("\nEste programa recibe un entero y lo presenta con los ");
 System.out.println("digitos invertidos. ");
 System.out.println("\nPor favor introduzca un numero: ");
 numero = entrada.nextInt();

 System.out.println("\nEste es el numero invertido:\n ");
 miObjeto.Invierte( numero );

 
 }           // Cierra main 
 }      // Cierra clase UsaDeitel_6_26
