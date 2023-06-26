package ejercicio7;

import java.util.Random;

  class PaqueteDeCartas

 {  // Abre clase PaqueteDeCartas
 private Carta paquete[];
 private int cartaActual;
 private final int NUMERO_DE_CARTAS = 52;
 private Random numerosAleatorios;

 /////////////////////////////////////////////////////////////////
 // CONSTRUCTOR
 /////////////////////////////////////////////////////////////////

 public PaqueteDeCartas()
 {   // ABre constructor PaqueteDeCartas

 String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
 "OCHO", "NUEVE", "DIEZ", "JOTO", "QUINA", "REY"};
 String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};

 paquete = new Carta[ NUMERO_DE_CARTAS ];
 cartaActual = 0;
 numerosAleatorios = new Random();

 for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
 paquete[ cuenta ] = new Carta( caras[cuenta % 13], palos[cuenta/13]); 
 }   // Cierra constructor PaqueteDeCartas


 /////////////////////////////////////////////////////////////////
 // METODO BARAJAR
 /////////////////////////////////////////////////////////////////

 public void barajar()
 {   // Abre metodo barajar
        cartaActual = 0;
 
 for ( int primera = 0; primera < paquete.length; primera++ )
 { // Abre for
 int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
 
 Carta temp = paquete[primera];

 paquete[primera] = paquete[segunda];
 paquete[segunda] = temp;
 
 }  // Cierra for
 }   // Cierra metodo barajar 

 public Carta repartirCarta()
 {  // Abre metodo repartirCarta
 if (cartaActual < paquete.length )
 return paquete[cartaActual++];
 else return null;
 }  // Cierra metodo repartirCarta
 }  // Cierra clase PaqueteDeCartas