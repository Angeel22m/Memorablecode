package excepciones;

import java.io.IOException;

public class Prueba {

    public static void main(String[] args) {

        try {
//Lanza ExcepcionA
            throw new ExcepcionA(" Esto es una ExcepcionA ");
        } catch (Exception excepcion) {
            System.out.println("Excepcion Capturada " + excepcion.getMessage());

        }

        try {
//Lanza ExcepcionB
            throw new ExcepcionB(" Esto es una ExcepcionB ");
        } catch (Exception excepcion) {
            System.out.println("Excepcion Capturada " + excepcion.getMessage());

        }
        try {
//Lanza NullPointerException
            String cadena = null;
            int longitud = cadena.length();
            System.out.println("La longitud de la cadena es: " + longitud);
        } catch (Exception excepcion) {
            System.out.println("Excepcion Capturada " + excepcion.getMessage());

        }
        try {
//Lanza IOException
            throw new IOException(" Esto es una IOException ");
        } catch (Exception excepcion) {
            System.out.println("Excepcion Capturada " + excepcion.getMessage());

        }

    }
}
