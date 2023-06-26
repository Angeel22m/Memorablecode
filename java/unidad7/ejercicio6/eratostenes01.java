package ejercicio6;

 class eratostenes01
 {   // Abre clase eratostenes01
 private int Tamano_Arreglo = 1000;
 //Basta cambiar este numero para obtener
 // los primos hasta ese limite

 /////////////////////////////////////////////
 // METODO PRINCIPAL
 /////////////////////////////////////////////

 public void Principal()

 { //ABRE PRINCIPAL 
 boolean Arreglo[];
 Arreglo = new boolean[Tamano_Arreglo + 1];
 for ( int i = 1; i < Tamano_Arreglo; i++ )
 Arreglo[i] = true; //EN PRINCIPIO TODOS LOS NUMEROS SE CONSIDERAN PRIMOS

 for ( int j = 2; j <= Tamano_Arreglo; j++ )
 if ( true == Arreglo[j] ) // Para numeros grandes este if hace una 
                           // diferencia de tiempo importante
 for ( int k = 2; k <= (Tamano_Arreglo)/j; k++ )
 Arreglo[k*j] = false;

 // Se llama al metodo Imprime
 Imprime( Arreglo, Tamano_Arreglo );

 } //CIERRA PRINCIPAL 

 //////////////////////////////////////////////
 // IMPRIME
 //////////////////////////////////////////////

 public void Imprime( boolean A[], int Tamano )

 { //ABRE IMPRIME
 int contador = 0;

 for ( int m = 2; m <= Tamano; m++ )
 { //ABRE FOR
 if ( true == A[m] )
 contador++;
 } //CIERRA FOR


 System.out.printf("\n\nEstos son los %d numeros primos que hay ", contador);
 System.out.printf("entre 1 y %d\n\n", Tamano_Arreglo);

 int salto = 1; 
 for ( int n = 1; n <= Tamano; n++ )
 { //ABRE FOR
 
 if ( true == A[n] )
 {
 System.out.printf("%4d\t", n);
 salto++;
 }
 if ( 10 == salto )
 {
 System.out.println();
 salto = 1;
 }
 } //CIERRA FOR

 System.out.printf("\n");
 } //CIERRA IMPRIME  

 }   // Cierra clase eratostenes
