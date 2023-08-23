package Excepciones;

public class ExcepcionA extends Exception {

    public ExcepcionA(String mensaje) {

        super(mensaje);

    }
}

class ExcepcionB extends ExcepcionA {

    public ExcepcionB(String mensaje) {

        super(mensaje);
    }

}
