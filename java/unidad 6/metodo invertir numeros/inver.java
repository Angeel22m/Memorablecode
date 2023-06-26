public class inver

 {        // Abre clase 

 public int Cuenta( int x )

 {         /* Abre metodo Cuenta 
 Lo primero que se hace es averiguar cuantos digitos tiene 
 el numero. Para esto se hace lo siguiente:
 se divide el numero sucesivamente entre 1, 10, 100,....
 mientras el resultado sea distinto de cero.
 Al mismo tiempo se incrementa una variable contador
 que cuenta el numero de digitos.
 Cuando finalmente se alcanza un cero quiere decir que 
 se ha dividido entre un multiplo de 10 mayor al numero
 y por lo tanto se deja de contar. Sin embargo, se ha contado
 de mas una vez, por lo cual se resta una unidad.
 El siguiente segmento realiza esta tarea.*/
  
 int divisor = 1;
 int contador = 0; 
 int digito = 1;

 while ( 0 != digito )
 {      // Abre while
  
 digito = x / divisor;
 divisor *= 10;
 contador++;

 }      // Cierra while 

 return --contador;

 }         // Cierra metodo Cuenta


 //////////////////////////////////////////////////////////
 //METODO INVIERTE
 /////////////////////////////////////////////////////////

 public void Invierte (int y ) 

 {         // Abre metodo Invierte

 // Par dar una idea de la forma en que se obtienen los
 // digitos, es bueno poner el siguiente ejemplo
 //
 // sea y = 37401
 //
 // Digito1 = 37401 % 10
 // Digito2 = ((37401)/10) % 10 
 // Digito3 = (((37401)/10)/10) % 10
 // Digito4 = ((((37401)/10)/10)/10) %10
 // Digito5 = ((((37401)/10/)10)/10)/10
 
 int digitos = Cuenta(y);

 for (int i = 1; i < digitos; i++)
 {       // Abre for
 System.out.printf("\t%d", y % 10);     
 y /= 10;
          
 }       // Cierra for 

 System.out.printf("\t%3d", y);
 System.out.println("\n");

 }         // Cierra metodo Invierte
 }        // Cierra clase 