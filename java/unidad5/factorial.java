public class factorial {
	
	public static void main(String[] args) {
		
		System.out.println("Aplicacion que calcula los factoriales del 1 al 20 y los muestra tabularmente\n");
		
		long fac;
		
		System.out.printf("%s%30s%n", "!", "Resultado");
		
		for(int n = 1; n <= 20; n++) {
			
			int i = 0;
			int j = 1;
			fac = n;
			
			while(i != (n - 1)) {
				
				fac *= (n - j);
				i++;
				j++;
				
			}
			
			System.out.printf("%d%s%,30d%n", n, "!", fac);
			
		}//Fin de for
		
	}//Fin metodo main

}//Fin declaracion de clase