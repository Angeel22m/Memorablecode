  import java.util.Scanner;


  public class valorMenor

         {                  // Abre clase 

         public static void main(String[] args)
         {          // Abre metodo recibe

          int x;
      int y;
      int menor;

      Scanner entrada = new Scanner(System.in);
      System.out.println("\nEste programa le dira cual es el menor ");
          System.out.println(" de unos enteros. Introduzca cuantos numeros");

          System.out.println(" quiere comparar: ");
      x = entrada.nextInt();

        
      System.out.println("\nPor favor introduzca el primer numero: ");
      menor = entrada.nextInt();



      for( int i = 2; i <= x; i++ )
      {     // Abre for

      System.out.printf("\nPor favor introduzca el entero numero: %d\n", i);
          y = entrada.nextInt();
            
      if ( y < menor )
          menor = y;

      }       // Cierra for


      System.out.printf("\nEl menor de los %d numeros es: %d\n", x, menor);
                  }         // Cierra metodo recibe



     } 