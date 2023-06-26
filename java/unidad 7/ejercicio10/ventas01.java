package ejercicio10;

 class ventas01 {
    private final int cantidadProductos = 5;
    private final int cantidaDeVendedores = 4;
    private int [][] datos = new int[cantidadProductos][cantidaDeVendedores];
    private int ventas[][] = new int[cantidadProductos][2];
    private final int []precios = {10, 20, 30, 40, 50};
    public void cargarDatos(){
        datos[0][0]= 5 ;
        datos[0][1]= 6 ;
        datos[0][2]= 7 ;
        datos[0][3]= 8 ;

        datos[1][0]= 2 ;
        datos[1][1]= 0 ;
        datos[1][2]= 9 ;
        datos[1][3]= 1 ;

        datos[2][0]= 7 ;
        datos[2][1]= 3 ;
        datos[2][2]= 8 ;
        datos[3][3]= 1 ;

        datos[3][0]= 2 ;
        datos[3][1]= 8 ;
        datos[3][2]= 7 ;
        datos[3][3]= 1 ;

        datos[4][0]= 0 ;
        datos[4][1]= 0 ;
        datos[4][2]= 0 ;
        datos[4][3]= 0 ;
    }
    public void calcularVentas(){
        int sumaVendedor=0;
        for(int i=0;i<cantidadProductos;i++){
            for(int j=0;j<cantidaDeVendedores;j++){
                if(datos[i][j]>0)
                {
                    ventas[i][0]+=datos[i][j]*precios[i];
                }
            }
        }
    
for( int columna=0;columna<cantidaDeVendedores;columna++){
    for(int fila=0;fila<cantidadProductos;fila++)
    {
        if (datos[fila][columna]>0) {
            ventas[columna][1]+=datos[fila][columna]*precios[fila];
            
        }
    }

}}
public void mostrarTotales()
{
    System.out.printf("%25s\n", "Vendedores");
    System.out.printf("%10s%10s%10s%10s%23s","1","2","3","4","TOTAL PRODUCTO\n\n");
    for(int i=0;i<cantidadProductos;i++)
    {
        System.out.printf("%d",(i+1));
        for(int j=0;j<cantidaDeVendedores;j++){
            System.out.printf("%10d",datos[i][j]);
            if(j==3){
                System.out.printf("%15d",ventas[i][0]);
            }
        }
        System.out.println();
    }
    
    for(int i=0;i<cantidaDeVendedores;i++)
    {
        System.out.printf("%10d",ventas[i][1]);
    }
}
}
