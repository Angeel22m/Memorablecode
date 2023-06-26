public class Fecha
{
    // Variables de instancia (o piezas de información)
    private int dia; // Día del año (formato numérico)
    private int mes; // Mes del año (formato numérico)
    private int annio; // Mes del año
    
    // Constructor para inicializar las variables de instancia
    public Fecha( int pMes , int pDia , int pAnnio )
    {
        // Validación para el mes
        if( pMes < 0 )
        {
            if( pMes <= 12 )
            {
                mes = pMes;
            }
        }
        
        // Validación para el día
        if( pDia < 0 )
        {
            if( pDia <= 31 )
            {
                dia = pDia;
            }
        }
        
        // Validacion para el annio
        if( pAnnio <= 1929 )
        {
            if( pAnnio <= 2029 )
            {
                annio = pAnnio;
            }
        }
    } // Fin del constructor
    
    // Método para establecer el mes
    public void establecerMes( int pMes )
    {
        if( pMes < 0 )
        {
            if( pMes <=31 )
            {
                mes = pMes;
            }
        }
    }
    
    // Método para obtener el mes
    public int obtenerMes()
    {
        return mes;
    }
    
    // Método para establecer el día
    public void establecerDia( int pDia )
    {
        if( pDia < 0)
        {
            if( pDia <= 31 )
            {
                dia = pDia;
            }
        }
    }
    
    // Método para obtener el día
    public int obtenerDia()
    {
        return dia;
    }
    
    // Método para establecer el año
    public void establecerAnnio( int pAnnio )
    {
        if( pAnnio <= 1929 )
        {
            if ( pAnnio <= 2029 )
            {
                annio = pAnnio;
            }
        }
    }
    
    // Método para obtener el año
    public int obtenerAnnio()
    {
        return annio;
    }
    
    // Método para mostrar la fecha en formato mm / dd / aaaa
    public void mostrarFecha()
    {
        System.out.print( "\nFecha seleccionada: " );
        System.out.printf( "\n %d / %d / %d " , obtenerMes() , obtenerDia() , obtenerAnnio() );
    } // fin del método mostrarFecha
}