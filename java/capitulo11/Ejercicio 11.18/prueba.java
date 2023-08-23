package Excepciones;

public class prueba {

    public static void main(String[] args) {
        try {
//Lanza ExcepcionB
            throw new ExcepcionB(" Esto es una ExcepcionB ");
        } catch (ExcepcionA excepcion) {
            System.out.println("Excepcion Capturada " + excepcion.getMessage());
        } catch (ExcepcionB excepcion) {
            System.out.println("Excepcion capturada" + excepcion.getMessage());

        } catch (Exception excepcion) {
            System.out.println(
                    "Excepción capturada: " + excepcion.getMessage());
        }
        try {

// Lanzar IOException
            throw new IOException("¡Esto es una IOException!");
        } catch (IOException excepcion) {
            System.out.println(
                    "Excepción capturada: " + excepcion.getMessage());
        } catch (Exception excepcion) { // Error: Unreachable catch block for IOException
            System.out.println("Excepción capturada: " + excepcion.getMessage());
        }
    }
}
