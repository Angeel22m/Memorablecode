package ejercicio3;

import java.util.Scanner;

class aerolinea {
	
	//Capacidad Avion: 10 Asientos
	//Primera Clase: Asientos 1 a 5
	//Economico: Asiento 6 a 10
	//false: asiento libre
	//true: asiento ocupado
	
	private static boolean[] asientos = new boolean[10];
	private static Scanner input = new Scanner(System.in);
	private static int primera 	= 0;
	private static int economico 	= 5;
	private static boolean avionLleno = false;
	
	public static void main(String[] args) {
		
		while(avionLleno == false) {
			
			System.out.printf("%s%n%s%n%s%n%s",
							  "SISTEMA DE RESERVACIONES",
							  "Por favor escriba 1 para Primera Clase",
							  "Por favor escriba 2 para Economico",
							  "----> ");
			int entrada = input.nextInt();
			
			if(entrada == 1)
				asignarP();
			else if(entrada == 2)
				asignarE();
			else
				System.out.println("¡¡SELECCION INVALIDA!!");
			
		}//Fin de while
	}//Fin de main
	
	public static void asignarP() {
		if(primera < 5) {
			asientos[primera] = true;
			System.out.println("Asiento asignado <--\n");
		}
		else
			primeraFull();
		primera++;
	}
	
	public static void asignarE() {
		if(economico < 10) {
			asientos[economico] = true;
			System.out.println("Asiento asignado <--\n");
		}
		else
			economicoFull();
		economico++;
	}
	
	public static void primeraFull() {
		
		while(true) {
			System.out.printf("%s%n%n%s%n%s%n%s%n%s",
					  "***SECCION PRIMERA LLENA***",
					  "Acepta ser colocado en la seccion Economico?",
					  "1) Si",
					  "2) No",
					  "-----> ");
			int entrada = input.nextInt();
			
			if(entrada == 1) {
				
				if(evLugaresE() == false)
					asignarE();
				else {
					System.out.println("***SECCION ECONOMICO LLENA****\n\n"
									 + "* * * A V I O N - L L E N O * * *\n\n"
									 + "Proximo vuelo en 3 horas");
					avionLleno = true;
				}
				break;
			}
			
			if(entrada == 2) {
				System.out.println("El proximo vuelo sale en 3 horas\n");
				break;
			}
			
		}//Fin de while
	}//Fin de metodo primeraFull
	
	public static boolean evLugaresE() {
		
		boolean hayLugar = true;
		
		for(int i = 5; i < 10; i++) {
			if(asientos[i] == false) {
				hayLugar = false; //Con que el for detecte un asiento libre, rompe el ciclo
				break;
			}	
		}//Fin de for
		return hayLugar;
	}//Fin de metodo evLugaresE
	
	public static void economicoFull() {
		
		while(true) {
			System.out.printf("%s%n%n%s%n%s%n%s%n%s",
					  "***SECCION ECONOMICO LLENA***",
					  "Acepta ser colocado en la seccion Primera?",
					  "1) Si",
					  "2) No",
					  "-----> ");
			int entrada = input.nextInt();
			
			if(entrada == 1) {
				
				if(evLugaresP() == false)
					asignarP();
				else {
					System.out.println("***SECCION PRIMERA LLENA****\n\n"
									 + "* * * A V I O N - L L E N O * * *\n\n"
									 + "Proximo vuelo en 3 horas");
					avionLleno = true;
				}
				break;
			}
			
			if(entrada == 2) {
				System.out.println("El proximo vuelo sale en 3 horas\n");
				break;
			}
				
		}//Fin de while
	}//Fin de metodo economicoFull
	
	public static boolean evLugaresP() {
		
		boolean hayLugar = true;
	
		for(int i = 0; i < 5; i++) {
			if(asientos[i] == false) {
				hayLugar = false; //Con que el for detecte un asiento libre, rompe el ciclo
				break;
			}	
		}//Fin de for
		return hayLugar;
	}//Fin de metodo evLugaresP

}//Fin de clase