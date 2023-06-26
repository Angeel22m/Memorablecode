public class Factura
{
    // Variables de instancia
    private String numDePieza; // Número de la pieza
    private String descPieza; // Descripción de la pieza
    private int qtyArticulo; // Cantidad del artículo
    private double vlrArticulo; // Valor del artículo
    
    // Constructur personalizado
    public Factura( String pNumDePieza , String pDescPieza , int pQtyArticulo , double pVlrArticulo )
    {
        // Asignación de los valores de los parámetros a las vars. de inst.
        numDePieza = pNumDePieza;
        descPieza = pDescPieza;
        if( pQtyArticulo &gt; 0 )
        {
            qtyArticulo = pQtyArticulo;
        }
        if( pVlrArticulo &gt; 0.0 )
        {
            vlrArticulo = pVlrArticulo;
        }
    } // Fin del constructor de la clase
    
    // Método establecer para número de la pieza
    public void establecerNumDePieza( String pNumDePieza )
    {
        numDePieza = pNumDePieza;
    }
    
    // Método obtener para número de la pieza
    public String obtenerNumDePieza()
    {
        return numDePieza;
    }
    
    // Método para establecer la descripción de la pieza
    public void establecerDescPieza( String pDescPieza )
    {
        descPieza = pDescPieza;
    }
    
    // Método para obtener la descripción de la pieza
    public String obtenerDescPieza()
    {
        return descPieza;
    }
    
    // Método para establecer la cantidad de artículo
    public void establecerQtyArticulo( int pQtyArticulo )
    {
        qtyArticulo = pQtyArticulo;
    }
    
    // Método para obtener la cantidad de artículo
    public int obtenerQtyArticulo()
    {
        return qtyArticulo;
    }
    
    // Método para establecer valor del artículo
    public void establecerVlrArticulo( double pVlrArticulo )
    {
        vlrArticulo = pVlrArticulo;
    }
    
    // Método para obtener el valor del artículo
    public double obtenerVlrArticulo()
    {
        return vlrArticulo;
    }
    
    // Método Obtener Monto Factura
    public void obtenerMontoFactura()
    {
        // Comprobación de que no hayan cantidad negativas
        if( obtenerQtyArticulo() &lt; 0 )
        {
            qtyArticulo = 0;
        }
        
        if( obtenerVlrArticulo() &lt; 0.0 )
        {
            vlrArticulo = 0.0;
        }
        
        System.out.printf( "\n ********** FERRETERÍA **********" );
        System.out.printf( "\n ***** Factura *****\n\n" );
        System.out.printf( "Número de pieza: %s" , obtenerNumDePieza() );
        System.out.printf( "\nDescripción de la pieza: %s" , obtenerDescPieza() );
        System.out.printf( "\nCantidad del artículo: %d" , obtenerQtyArticulo() );
        System.out.printf( "\nValor unitario del artículo: %f" , obtenerVlrArticulo() );
        
        //Totalizar el monto de la compra
        System.out.printf( "\n\nEl total a pagar es: %f" , ( obtenerQtyArticulo() * obtenerVlrArticulo() ) );
    } // fin de main
} ///:~