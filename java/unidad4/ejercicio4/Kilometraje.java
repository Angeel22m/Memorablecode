

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kilometraje {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        boolean continuarCiclo = true;
        int litrosTotales = 0;
        int kilometrosTotales = 0;
        int kilometros = 0;
        
        do{
            try{
                System.out.print("\nIntroduce los kilometros recorridos (-1 para terminar): ");
                kilometros = entrada.nextInt();
                while(kilometros != -1){
                    System.out.print("Introduce los litros usados: ");
                    int litros = entrada.nextInt();

                    litrosTotales += litros;
                    kilometrosTotales += kilometros;

                    System.out.printf("El rendimiento es de %f kilometros por litro%n", (float)kilometros / litros);
                    System.out.printf("El rendimiento total es de %f kilometros por litro%n", (float)kilometrosTotales / litrosTotales);
                    System.out.print("\nIntroduce los kilometros recorridos (-1 para terminar): ");
                    kilometros = entrada.nextInt();
                }
                
                continuarCiclo = false;
            }
            catch(InputMismatchException e){
                System.err.printf("%s: Se deben introducir números enteros unicamente... prueba de nuevo%n", e);
                entrada.nextLine();
                System.gc();
            }
        }while(continuarCiclo);
    }
}
