import java.util.Scanner;



  public class UsaDeitel_6_19

  {       // Abre clase UsaDeitel_6_19
  
  public static void main( String args[])

  {      // Abre main
  System.out.print("\nEste programa recibe un entero y un caracter e imprime ");
  System.out.println("un cuadrado con ese caracter y con ese numero de lado.");

  int lado;
  String caracter;

  Scanner entrada = new Scanner(System.in);
  Deitel_6_19 miObjeto = new Deitel_6_19();


  System.out.println("\nPor favor introduzca un caracter: ");
  caracter = entrada.nextLine();

  System.out.println("\nPor favor introduzca un entero: ");
  lado = entrada.nextInt();

  miObjeto.Cuadrado(lado, caracter);
  
  }      // Cierra main

  }       // Cierra clase UsaDeitel_6_19
