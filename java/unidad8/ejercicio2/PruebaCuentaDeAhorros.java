package unidad8.ejercicio2;
import java.math.BigDecimal;
import java.text.NumberFormat;

 class PruebaCuentaDeAhorros {
	
	public static void main(String[] args) {
				
		CuentaDeAhorros cuenta_01 = new CuentaDeAhorros(BigDecimal.valueOf(2000));
		CuentaDeAhorros cuenta_02 = new CuentaDeAhorros(BigDecimal.valueOf(3000));
		
		System.out.printf("CUENTA 1: %s%n", NumberFormat.getCurrencyInstance()
				.format(cuenta_01.getAhorro()));
		System.out.printf("%n=== Tasa: %s%s ===%n", CuentaDeAhorros.getTasaInteres(), "%");
					
		for(int i = 1; i <= 12; i++) {
			System.out.printf("%n%s %2d: %s", "Mes", i, NumberFormat.getCurrencyInstance()
					.format(cuenta_01.calcularInteresMensual()));
			cuenta_01.setAhorro(cuenta_01.calcularInteresMensual());
		}
		
		/*System.out.printf("%s", NumberFormat.getCurrencyInstance().format(cuenta_01.calcularInteresMensual()));*/
		System.out.println("\n");
		
		System.out.printf("CUENTA 2: %s%n", NumberFormat.getCurrencyInstance()
				.format(cuenta_02.getAhorro()));
		System.out.printf("%n=== Tasa: %s%s ===%n", CuentaDeAhorros.getTasaInteres(), "%");
		
		for(int i = 1; i <= 12; i++) {
			System.out.printf("%n%s %2d: %s", "Mes", i, NumberFormat.getCurrencyInstance()
					.format(cuenta_02.calcularInteresMensual()));
			cuenta_02.setAhorro(cuenta_02.calcularInteresMensual());
		}
		
		System.out.println("\n\n===  C A M B I O  D E  T A S A  ===\n");
		CuentaDeAhorros.modificarTasaInteres(BigDecimal.valueOf(0.05));
				
		System.out.printf("CUENTA 1: %s%n", NumberFormat.getCurrencyInstance()
				.format(cuenta_01.getAhorro()));
		System.out.printf("%n=== Tasa: %s%s ===%n", CuentaDeAhorros.getTasaInteres(), "%");
		
		System.out.printf("%n%s%s%n", "Mes 13: ", NumberFormat.getCurrencyInstance()
				.format(cuenta_02.calcularInteresMensual()));
		
		System.out.printf("%nCUENTA 2: %s%n", NumberFormat.getCurrencyInstance()
				.format(cuenta_02.getAhorro()));
		System.out.printf("%n=== Tasa: %s%s ===%n", CuentaDeAhorros.getTasaInteres(), "%");
		
		System.out.printf("%n%s%s", "Mes 13: ", NumberFormat.getCurrencyInstance()
				.format(cuenta_02.calcularInteresMensual()));	
		
	}

}