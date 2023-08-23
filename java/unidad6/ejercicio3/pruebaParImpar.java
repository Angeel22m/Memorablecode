import java.util.Scanner;

 public class ParImpar

 {       // Abre clase
 
 public static void main(String args[])

 {       // Abre main

 int numero;
 int par;
 Scanner entrada = new Scanner(System.in);
 ParImpar miObjeto = new ParImpar();


 System.out.println("\nEste programa recibe un entero e imprime si es par o no: ");
 System.out.println("\nPor favor introduzca un entero: ");
 numero = entrada.nextInt();

 par = miObjeto.Par(numero);

 System.out.printf((1 ==  par)? "El numero %d es par \n" : "El numero %d es impar\n", numero); 

 }       // Cierra main 
 }       // Cierra Deitel_6_17