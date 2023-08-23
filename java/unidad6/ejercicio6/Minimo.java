
public class Minimo {
    public static void main(String[] args){
        double numero1 = 2.2121f;
        double numero2 = 3.123f;
        double numero3 = 1.155f;
        
        System.out.printf("El número menor es %f%n", minimo3(numero1, numero2, numero3));
    }
    public static double minimo3(double numero1, double numero2, double numero3){
        return Math.min(Math.min(numero1, numero2), numero3);
    }
}
