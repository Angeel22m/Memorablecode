
import java.util.Scanner;

public class NumeroMasGrande {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float mayor = 0;
        for(int i = 0; i < 10; i++){
            System.out.printf("Introduce el elemento %d ", i + 1);
            float numero = entrada.nextFloat();
            if(numero > mayor)
                mayor = numero;
        }
        System.out.printf("El numero mas grande es %f%n", mayor);
    }
}
