package unidad8.ejercicio1;

public class prueba {
    public static void main(String[] args)  {
  /* Constructor sin Parametros , atributos igual a 1 */
  Rectangulo rect = new Rectangulo();
  rect.setAnchura(12.2);/*Exception menor a 0*/
  rect.setLongitud(12.2);/* Valor aceptado */
  System.out.println(rect.getAnchura()*rect.getLongitud()); /* Obtener Area*/
  System.out.println(rect.getLongitud()*2+rect.getAnchura()*2);/* Obtener Perimetro*/
}
}
