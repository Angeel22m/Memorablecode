// Importar la clase 'Scanner'
import java.util.Scanner;

public class PruebaFactura
{
    // El método main inicia y finaliza la ejecución de la aplicación
    public static void main( String args[] )
    {
        // Variables
        String cadena; // Número y descripción de la pieza
        int cantidad; // Cantidad del artículo
        double valor; // Valor del artículo
        
        // Constructor personalizado. Creación de un objeto inicializando sus
        // variables de instancia
        Factura factura = new Factura( "0" , "Ninguna" , 0 , 0.0 );
        
        // Mostrar el estado actual de los atributos del objeto 'factura'
        System.out.printf( "\nNúmero de pieza: %s" , factura.obtenerNumDePieza() );
        System.out.printf( "\nDescripción de la pieza: %s" , factura.obtenerDescPieza() );
        System.out.printf( "\nCantidad del artículo: %d" , factura.obtenerQtyArticulo() );
        System.out.printf( "\nValor unitario del artículo: %f" , factura.obtenerVlrArticulo() );
        
        // Solicitud y obtención de los datos
        // Creación de un objeto de tipo 'Scanner'
        Scanner entrada = new Scanner( System.in );
        
        // Número de pieza
        System.out.print( "\nEscriba el número de pieza: " );
        cadena = entrada.nextLine();
        factura.establecerNumDePieza( cadena );
        
        //Descripción de la pieza
        System.out.print( "\nEscriba la descripción de la pieza: " );
        cadena = entrada.nextLine();
        factura.establecerDescPieza( cadena );
        
        // Cantidad del artículo
        System.out.print( "\nEscriba la cantidad del artículo: " );
        cantidad = entrada.nextInt();
        factura.establecerQtyArticulo( cantidad );
        
        // Valor del artículo
        System.out.print( "\nEscriba el valor del artículo: " );
        valor = entrada.nextDouble();
        factura.establecerVlrArticulo( valor );
        
        // Mostrar el monto de la factura
        factura.obtenerMontoFactura();
        
        System.out.println();
        System.out.println();
        
    } // fin de main
} ///:~