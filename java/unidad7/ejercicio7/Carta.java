package ejercicio7;


class Carta
 
 { // Abre clase Carta

 private String cara;
 private String palo;
 public Carta( String caraCarta, String paloCarta)
 {   // Abre constructor
 cara = caraCarta;
 palo = paloCarta;

 }   // Cierra constructor

 public String toString()
 {   // Abre metodo toString
 return cara + " de " + palo;
 }   // Cierra metodo toString
 } // Cierra clase Carta