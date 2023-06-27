package unidad8.ejercicio2;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CuentaDeAhorros {
	
	private static BigDecimal tasaInteresAnual = BigDecimal.valueOf(0.04);
	
	private BigDecimal saldoAhorros = BigDecimal.valueOf(0);
	
	//Constructor
	public CuentaDeAhorros(BigDecimal saldoAhorros) {
		
		this.saldoAhorros = saldoAhorros;
		
	}
	
	public BigDecimal calcularInteresMensual() {
				
		return saldoAhorros.multiply(BigDecimal.ONE.add(tasaInteresAnual.divide
				(BigDecimal.valueOf(12), 10, RoundingMode.CEILING)));
	
	}
	
	public void setAhorro(BigDecimal interes) {
		
		this.saldoAhorros = interes;
		
	}
	
	public BigDecimal getAhorro() {
		return saldoAhorros;
	}
	
	public static void modificarTasaInteres(BigDecimal modTasa) {
		
		tasaInteresAnual = modTasa;
		
	}
	
	public static BigDecimal getTasaInteres() {
		return tasaInteresAnual.multiply(BigDecimal.valueOf(100));
	}

}