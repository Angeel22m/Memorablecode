package excepciones;

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

class ExcepcionC extends ExcepcionB {

    public ExcepcionC(String mensaje) {

        super(mensaje);

    }
}



