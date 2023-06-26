import java.util.Scanner;

public class PruebaCuenta {
	
	public static void main(String[] args){
		
		double deposito;
		
		//Se instancia objetos Cuenta
		Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
		Cuenta cuenta2 = new Cuenta("Jhon Blue", -7.53);
		Scanner input = new Scanner(System.in);
		
		PruebaCuenta.mostrarCuenta(cuenta1);
		PruebaCuenta.mostrarCuenta(cuenta2);
		
		System.out.print("\nIngrese cantidad a depositar para cuenta 1: ");
		deposito = input.nextDouble();
		System.out.printf("%nSumado %.2f al saldo de cuenta 1%n%n", deposito);
		cuenta1.depositar(deposito);
		
		PruebaCuenta.mostrarCuenta(cuenta1);
		PruebaCuenta.mostrarCuenta(cuenta2);
		
		System.out.print("\nIngrese cantidad a depositar para cuenta 2: ");
		deposito = input.nextDouble();
		System.out.printf("%nSumado %.2f al saldo de cuenta 2%n%n", deposito);
		cuenta2.depositar(deposito);
		
		PruebaCuenta.mostrarCuenta(cuenta1);
		PruebaCuenta.mostrarCuenta(cuenta2);
		
		System.out.print("\nIngrese la cantidad a retirar de la cuenta 1: ");
		double montoRetiro = input.nextDouble();
		System.out.printf("%nRestado %.2f al saldo de cuenta 1%n%n", montoRetiro);
		cuenta1.retirar(montoRetiro);
		
		PruebaCuenta.mostrarCuenta(cuenta1);
		PruebaCuenta.mostrarCuenta(cuenta2);
		
		System.out.print("\nIngrese la cantidad a retirar de la cuenta 2: ");
		montoRetiro = input.nextDouble();
		System.out.printf("%nRestado %.2f al saldo de cuenta 2%n%n", montoRetiro);
		cuenta2.retirar(montoRetiro);
		
		PruebaCuenta.mostrarCuenta(cuenta1);
		PruebaCuenta.mostrarCuenta(cuenta2);
		
	}
	
	public static void mostrarCuenta(Cuenta cuentaAMostrar){
		
		System.out.printf("Saldo de %s: $%.2f%n", 
				cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
                 }   }