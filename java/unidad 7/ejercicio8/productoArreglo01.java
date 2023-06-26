package ejercicio8;

import java.util.Scanner;

  public class productoArreglo01
  {  // Abre clase 
 
  Scanner entrada = new Scanner(System.in);
  int Tamano_Arreglo = 10;
  // Modifique la variable Tamano_Arreglo para recibir una cantidad diferente
  // de enteros.

  //////////////////////////////////////////////////////////////////////
  // METODO RECIBE
  //////////////////////////////////////////////////////////////////////
 
  public void Recibe()
  {          // Abre metodo Recibe
  int Arreglo[] = new int[Tamano_Arreglo];

  for (int i = 0; i < Tamano_Arreglo; i++ )
  {      // Abre for
  System.out.printf("\nPor favor introduzca el numero %d\n", i + 1);
  Arreglo[i] = entrada.nextInt();
  }      // Cierra for 

  System.out.printf("\nEl producto es %d\n",  Multiplica( Arreglo ));

  }          // Cierra metodo Recibe
 
  ///////////////////////////////////////////////////////////////////////
  // METODO MULTIPLICA
  ///////////////////////////////////////////////////////////////////////
 
  public int Multiplica( int A[])
  {  // Abre metodo Multiplica
  int producto = 1;
 
  for ( int j = 0; j < A.length; j++ )
  {      // Abre for
  producto *= A[j];
  }      // Cierra for 

  return producto;
  }  // Cierra metodo Multiplica
  }    // Cierra clase