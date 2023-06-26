package ejercicio7;


public class PruebaPaqueteDeCartas
 {     // Abre clase PruebaDeCartas

 public static void main(String args[])
 {     // Abre main
  PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
  miPaqueteDeCartas.barajar();
  
  ///////////////////////////////////
  // IMPRIME
  //////////////////////////////////

 System.out.println("\n");
 for ( int i = 0; i < 13; i++ )
 { // Abre for
 System.out.printf("%-20s%-20s%-20s%-20s\n", 
 miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta(),
 miPaqueteDeCartas.repartirCarta(), miPaqueteDeCartas.repartirCarta());
 }  // Cierra for

 System.out.println("\n");
 }     // Cierra main
 }     // Cierra clase PruebaDeCartas