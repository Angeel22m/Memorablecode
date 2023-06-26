package unidad8.ejercicio1;

    public class Rectangulo {
private double longitud;
private double anchura;

public Rectangulo(double longitud, double anchura) {
    this.longitud = longitud;
    this.anchura = anchura;
}

public Rectangulo() {
    this.longitud=1;
    this.anchura=1;
}

 /* Aquí van los Métodos calcular Area y Perimetro*/

public double getLongitud() {
    return longitud;
}
 public double getAnchura() {
    return anchura;
} 
/* Métodos Set incluida su Verificación */
public void setLongitud(double longitud) {
    if ( longitud > 0.0 && longitud < 20.0 )
        this.longitud = longitud;
    else
        throw new RuntimeException(
        "la longitud debe debe de ser > 0 < 20.0");
}

public void setAnchura(double anchura) {
    if (anchura > 0.0 && anchura < 20.0 )
        this.anchura = anchura;
    else
        throw new RuntimeException(
        "la Anchura debe debe de ser > 0 < 20.0");

}


public String toString() {
    return "Rectangulo{" + "longitud=" + longitud + ", anchura=" + anchura + '}';
 }
}

