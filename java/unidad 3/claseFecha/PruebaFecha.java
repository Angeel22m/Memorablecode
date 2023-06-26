// Importar la clase 'Scanner'
import java.util.Scanner;

public class PruebaFecha
{
    // El método main inicia y finaliza la ejecución de la aplicación
    public static void main( String args[] )
    {
        // Variables receptoras de los valores introducidos por el usuario del programa
        int dia; // Día en formato numérico
        int mes; // Mes en formato numérico
        int annio;
        
        // Instanciamiento de un objeto de clase Fecha con valores iniciales
        Fecha fecha = new Fecha( 5 , 21 , 2009 );
        
        // Ver fecha
        fecha.mostrarFecha();
        
        // Solicitud y obtención de datos por parte del usuario
        // Crea un objeto Scanner para obtener datos desde la entrada estándar
        Scanner entrada = new Scanner( System.in );
        
        // Mes
        System.out.print( "\nEscriba el número del mes: " );
        mes = entrada.nextInt();
        fecha.establecerMes( mes );
        
        // Día
        System.out.print( "\nEscriba el número del día: " );
        dia = entrada.nextInt();
        fecha.establecerDia( dia );
        
        // Año
        System.out.print( "\nEscriba el año: " );
        annio = entrada.nextInt();
        fecha.establecerAnnio( annio );
        
        // Mostrar fecha
        fecha.mostrarFecha();
        
        System.out.println();
        System.out.println();
    } // fin de main
}