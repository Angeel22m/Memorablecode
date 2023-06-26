public class triangulo
{              // Abre clase 

private int Tamano = 10;

public void Imprime()
{       // Abre metodo Imprime

System.out.println("\n");

for ( int i = 1; i <= Tamano; i++ )
{           // Abre for
for ( int j = 1; j <= i; j++ )
System.out.print("*");

for ( int k = i + 1; k <= Tamano; k++)
System.out.print(" ");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int l = 1; l <= Tamano + 1 - i; l++ )
System.out.print("*");

for ( int m = Tamano - 1 -i; m <= Tamano; m++)
System.out.print(" ");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int n = 1; n < i; n++ )
System.out.print(" ");
   
for ( int p = i; p <= Tamano; p++ )
System.out.print("*");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int q = 1; q <= Tamano - i; q++ )
System.out.print(" ");

for ( int r = Tamano - i; r < Tamano; r++ )
System.out.print("*");

System.out.println();
}           // Cierra for

System.out.println("\n");
}       // Cierra metodo Imprime

}              // Cierra clase 