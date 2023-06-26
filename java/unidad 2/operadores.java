import java.util.Scanner;

public class operadores {
    
    public static void main(String [] args){
        int numero1;
        int numero2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba el primer entero");
        numero1 = entrada.nextInt();
        System.out.println("Escriba el segundo entero");
        numero2 = entrada.nextInt();
System.out.println(numero1+numero2);
System.out.println(numero1-numero2);
System.out.println(numero1*numero2);
System.out.println(numero1/numero2);
    }
}