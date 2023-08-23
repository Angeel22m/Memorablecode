
public class Estacionamiento {
    public static void main(String[] args){
        float horasF = 3.2f;//3.5
        float horasC = (float)Math.ceil(horasF);//<redondea al entero mas pequeño mayor que horasF
        System.out.printf("El cargo por %f horas es %f%n", horasF, cargos(horasC));
    }
    public static float cargos(float horas){
        float costo = 0f;
        if(horas <= 3){
            costo = 2.0f;
        }
        else{
            costo += (0.5 * (horas - 3)) + 2;
        }
        return costo;
    }
}
