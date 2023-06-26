package ejercicio1;

import java.util.Scanner;
public class trabajadores01
{  // Abre clase
private int Trabajadores = 10;  
float ArregloA[] = new float[Trabajadores + 1];
int ArregloB[] = new int[Trabajadores + 1];
int ArregloC[] = new int[11];

public void Recibe()
{  // Abre metodo Recibe
Scanner entrada = new Scanner(System.in);
System.out.printf("\nEste programa recibe los rangos en los que estan");
System.out.printf("\nlos salarios de los %d empleados.\n", Trabajadores);
float ventas;
  
for ( int j = 0; j < Trabajadores; j++ )
{  // Abre for
ArregloC[j] = 0;
}  // Cierra for
for ( int i = 1; i <= Trabajadores; i++ )
{  // Abre for
System.out.printf("\n\n\nIntroduzca las ventas del empleado numero %d  ", i);
ventas = entrada.nextFloat();
ArregloA[i] = ((float)(9)/100)*ventas + 200;
System.out.printf("\nEl salario del empleado %d es: %.2f\n ", i, ArregloA[i]);
ArregloB[i] = (int)(ArregloA[i])/100;
} 
  
for (int k = 1; k <= Trabajadores; k++ )
{
if (ArregloB[k] < 10)
ArregloC[ArregloB[k]]++;
else
ArregloC[Trabajadores]++;
}
for (int j = 2; j < Trabajadores; j++ )
{
System.out.printf("\nHay %d empleados que cobran entre %d", ArregloC[j], (j * 100));
System.out.printf(" y %d pesos.\n", (( j + 1 ) * 100 ) - 1 );
}

System.out.printf("Hay %d empleados que cobran 1000 o mas.\n\n", ArregloC[Trabajadores]);
  
}   // Cierra metodo Recibe

}   // Cierra clase