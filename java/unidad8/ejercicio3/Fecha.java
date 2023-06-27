package unidad8.ejercicio3;

public class Fecha {
	
	private int mes; // 1 - 12
	private int dia; // 1 - 31 con base en el mes
	private int anio; // cualquier anio
	
	private static final int[] diasPorMes = 
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// constructor: confirma el valor apropiado para el mes y el dia, dado el año
	public Fecha(int mes, int dia, int anio) {
		
		//Revisa si el mes esta en el rango
		if(mes <= 0 || mes > 12)
			throw new IllegalArgumentException(
					"mes (" + mes + ") debe ser 1 - 12");
		
		//Revisa si el dia esta en rango
		if(dia <= 0 ||
				(dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
			throw new IllegalArgumentException("dia (" + dia + 
					") fuera de rango para el mes y anio especificados");
		
		//Revisa si es año bisiesto cuando mes es 2 y dia es 29
		if(mes == 2 && dia == 29 && !(anio % 400 == 0 ||
				(anio % 4 == 0 && anio % 100 != 0)))
			throw new IllegalArgumentException("dia (" + dia  + 
					") fuera de rango para el mes y anio especificados");
		
		//Revisa si el año es valido
		if(anio < 1920 || anio > 2020)
			throw new IllegalArgumentException("anio (" + anio + 
					") fuera de rango");
		
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
		
		// this hace una llamada implicita al metodo toString()
		System.out.printf(
				"Constructor de objeto Fecha para la fecha %s%n", this);
	}
	
	// Devuelve un objeto String de la forma dia/mes/anio
	public String toString() {
		return String.format("%d/%d/%d", mes, dia, anio);
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public void incrementarDia() {
		if((getDia() == 30 && getDia() == diasPorMes[getMes()]) 
				|| 
				(getDia() == 31 && getDia() == diasPorMes[getMes()])
				||
				(getDia() == 29 && getMes() == 2)) {
			setDia(1);
			incrementarMes();
		}
		else
			setDia(getDia() + 1);
	}
	
	public void incrementarMes() {
		if(getMes() == 12) {
			setMes(1);
			incrementarAnio();
		}
		else
			setMes(getMes() + 1);
	}
	
	public void incrementarAnio() {
		setAnio(getAnio() + 1);
	}

}// Fin de clase