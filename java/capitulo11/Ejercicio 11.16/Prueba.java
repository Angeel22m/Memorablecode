package excepciones;

public class Prueba {

    public static void main(String[] args) {

        try {
            throw new ExcepcionB(" Esto es una ExcepcionB ");
        } catch (ExcepcionA e) {
            System.out.println("Excepcion Capturada " + e.getMessage());

        }

        try {
            throw new ExcepcionC(" Esto es una ExcepcionC ");
        } catch (ExcepcionA e) {
            System.out.println("Excepcion Capturada " + e.getMessage());

        }

    }
}
