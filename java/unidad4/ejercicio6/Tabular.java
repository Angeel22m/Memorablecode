
public class Tabular {
    public static void main(String[] args){
        System.out.println("N \t10*N\t100*N\t1000*N");
        for(int i = 0; i < 5; i++){
            System.out.printf("%3d\t%4d\t%5d\t%6d%n", i + 1, 10 * (i + 1), 100 * (i + 1), 1000 * (i +1));
        }
    }
}
