
public class Redondeo {
    public static void main(String[] args){
        double numero = 1.21325;
        System.out.printf("El número a redondear es: %f%n", numero);
        redondearAInteger(numero);
        redondearADecimas(numero);
        redondearACentesimas(numero);
        redondearAMilesimas(numero);
    }
    public static void redondearAInteger(double numero){
        System.out.printf("El numero redondeado a entero es: %f%n", Math.floor(numero));
    }
    public static void redondearADecimas(double numero){
        System.out.printf("El número redondeado a decimas es: %f%n", Math.floor(numero * 10) / 10);
    }
    public static void redondearACentesimas(double numero){
        System.out.printf("El número redondeado a decimas es: %f%n", Math.floor(numero * 100) / 100);
    }
    public static void redondearAMilesimas(double numero){
        System.out.printf("El número redondeado a decimas es: %f%n", Math.floor(numero * 1000) / 1000);
    }
}
