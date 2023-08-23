
public class Primo {
    public static void main(String[] args){
//        int numero = 7;
        for(int numero = 2; numero < 100000; numero++){
            System.out.printf("%s", primos(numero) ? numero + " es primo\n" : "");//<15 segundos con 100,000
            System.out.printf("%s", primos2(numero) ? numero + " es primo\n" : "");//<8 segundos con 100,000
            System.out.printf("%s", primos3(numero) ? numero + " es primo\n" : "");//< menos de 1 segundo con 100,000
        }
    }
    public static boolean primos(int numero){
        boolean primo = true;
        for(int i = 2; i < numero - 1; i++){
            if(numero % i == 0)
                primo = false;
        }
        return primo;
    }
    public static boolean primos2(int numero){
        boolean primo = true;
        for(int i = 2; i <= numero / 2; i++){
            if(numero % i == 0)
                primo = false;
        }
        return primo;
    }
    public static boolean primos3(int numero){
        boolean primo = true;
        for(int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0)
                primo = false;
        }
        return primo;
    }
}
