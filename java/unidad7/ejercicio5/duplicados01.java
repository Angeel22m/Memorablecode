package ejercicio5;

import java.util.Scanner;

  class duplicados01
 {  // Abre clase duplicados01

 /*+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
  *                                                                  *
  * Declaracion de variables globales                                *
  *                                                                  *
  ****************************************************************** */

 Scanner entrada = new Scanner(System.in);
 enum Estado {SI, NO};
 private int Tamano = 5;
 private int numero;
 private int numeros_recibidos = 0;
 Estado almacenar;
 Estado imprimir;
 int Arreglo[] = new int[Tamano];

 //////////////////////////////////////////////////////////////////////
 // Metodo Recibe
 //////////////////////////////////////////////////////////////////////

 public void Recibe()
 {  // Abre metodo Recibe

 for ( int n = 0; n <  Tamano; n++ )
 { // Abre for 

 numero = 0;
 while ( (10 > numero) || ( 100 < numero) )
 {
 System.out.println("\nPor favor introduzca un numero entre 10 y 100 inclusive\n");
 numero = entrada.nextInt();
 }

 Arreglo[n] = numero;
 numeros_recibidos++;
 Imprime();
 }   // Cierra for

 System.out.println("\n");

 }  // Cierra metodo Recibe


 /* El metodo Imprime pone en la pantalla los numeros recibidos hasta el momento */
 
 //////////////////////////////////////////////////////////////////////////////////
 // METODO IMPRIME                                                                 
 //////////////////////////////////////////////////////////////////////////////////
 
 public void Imprime()
 {     // Abre metodo Imprime
 System.out.printf("\nLos numeros recibidos: %d", numeros_recibidos);
 imprimir = Estado.SI;

 System.out.printf("\n%d", Arreglo[0]);

 for ( int j = 1; j < numeros_recibidos; j++ )
 {  // Abre for
 imprimir = Estado.SI;

 for ( int k = 0; k < j; k++)
 {
 if ( Arreglo[j] == Arreglo[k] )
 imprimir = Estado.NO;
 }

 if ( Estado.SI == imprimir )
 {
 System.out.printf("\n%d", Arreglo[j]);
 }
 }  // Cierra for
 }     // Cierra metodo Imprime

 }  // Cierra clase duplicados01