

    public class Cuenta {
	
	private String nombre;
	private double saldo;
	
	//Constructor
	public Cuenta(String nombre, double saldo){
		
		this.nombre = nombre;
		
		if(saldo > 0.0)
			this.saldo = saldo;
		
	}
	
	public void depositar(double montoDeposito){
		if(montoDeposito > 0.0)
			this.saldo = saldo + montoDeposito;
	}
	
	public void retirar(double montoRetiro){
		if(montoRetiro > 0 && montoRetiro <= saldo){
			this.saldo = saldo - montoRetiro;
		}
		else if(montoRetiro > saldo){
			System.out.println("===El monto a retirar excede el saldo de la cuenta===\n");
		}
		else{
			System.out.println("===Valor invalido===\n");
		}
			
	}
	
	public double obtenerSaldo(){
		return saldo;
	}
	
	public void establecerNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String obtenerNombre(){
		return nombre;
	}

}
}
