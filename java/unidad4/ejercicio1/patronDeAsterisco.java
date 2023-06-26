package unidad4.ejercicio1;

 public class patronDeAsterisco

{ // Abre la clase 
private String cadena;

int x;
/////////////////////////////////////////////////////////////////////////
//METODO IMPRIME
/////////////////////////////////////////////////////////////////////////

public void Imprime()
{ // Abre metodo Imprime

System.out.println("\nSe imprime a continuacion un tablero de damas: ");

// El metodo para imprimir el tablero consiste en dos ciclos while
// uno que controla las columnas, 8, y otro que controla los renglones(8)
// Para especificar si se empieza con un cuadro en blanco o con un *
// se usa el hecho de si el renglon es par o impar

int contadorHorizontal = 1;
int contadorVertical = 1;
int TAMANO = 8;

while ( contadorVertical <= TAMANO )
{ // Abre while
contadorHorizontal = 1;
while (contadorHorizontal <= TAMANO)
{ // Abre while anidado
if( 0 == contadorVertical % 2 )
System.out.print("* ");
else
System.out.print(" *");

contadorHorizontal++;
} // Cierra while anidado
System.out.print("\n");
contadorVertical++;
} // Cierra while

} // Cierra metodo Imprime

} // Cierra la clase 