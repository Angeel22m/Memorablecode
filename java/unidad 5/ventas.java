import java.util.Scanner;

  public class ventas

  {        // Abre clase ventas

  private float costo;
  private float monto_total = 0;
  private int numero_producto;
  private int cantidad_vendida;



  // Abre metodo Recibe()
  public void Recibe()
  {          // Abre metodo recibe
 
  Scanner entrada = new Scanner(System.in); 

  System.out.print("\nEste almacen vende cinco productos con los siguientes");
  System.out.println("\nprecios:");
  System.out.println("\nProducto 1: $2.98");
  System.out.println("\nProducto 2: $4.50");
  System.out.println("\nProducto 3: $9.98");
  System.out.println("\nProducto 4: $4.49");
  System.out.println("\nProducto 5: $6.87\n");

  System.out.println("\nPor favor introduzca el numero del primer producto:");
  System.out.println("( -1 para terminar).");
  numero_producto = entrada.nextInt(); 

  while ( -1 != numero_producto )
  {        // Abre while
   
  switch ( numero_producto )
  {   // Abre switch

  case 1:
  {    // Cierra case 1

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*2.98);
  monto_total += cantidad_vendida*2.98;
  break;
  }  // Cierra case 1

  case 2:
  {    // Cierra case 2

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*4.50);
  monto_total += cantidad_vendida*4.50;
  break;
  }  // Cierra case 2

  case 3:
  {    // Cierra case 3

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*9.98);
  monto_total += cantidad_vendida*9.98;
  break;
  }  // Cierra case 3

   
  case 4:
  {    // Cierra case 4

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*4.49);
  monto_total += cantidad_vendida*4.49;
  break;
  }  // Cierra case 4

  case 5:
  {    // Cierra case 5

  System.out.print("\nIntroduzca la cantidad vendida de este producto:");
  cantidad_vendida = entrada.nextInt();
  System.out.printf("\nPrecio de esta venta: %f", cantidad_vendida*6.87);
  monto_total += cantidad_vendida*6.87;
  break;
  }  // Cierra case 5


  default :
  {    // Cierra default 

  System.out.print("\nINTRODUZCA NUMERO DE PRODUCTO VALIDO!");
  break;
  }  // Cierra default 

  }   // Cierra switch 

  System.out.println("\nPor favor introduzca el numero del siguiente producto:");
  System.out.println("( -1 para terminar).");
  numero_producto = entrada.nextInt(); 


  }        // Cierra while

  System.out.printf("\nLas ventas totales fueron: %f\n\n", monto_total);
  }          // Cierra metodo recibe

  }        // Cierra clase ventas