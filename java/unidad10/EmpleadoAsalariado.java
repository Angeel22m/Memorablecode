
public class EmpleadoAsalariado extends Empleado{
    /**
     * Salario semanal
     */
    private double salarioSemanal;
    /**
     * Constructor de 4 argumentos: inicializa todas las variables de instancia
     * @param primerNombre String
     * @param apellidoPaterno String
     * @param numeroSeguroSocial String
     * @param salarioSemanal double
     */
    public EmpleadoAsalariado(
            String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal){
        
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        
        this.salarioSemanal = salarioSemanal;
    }
    /**
     * Establece el salario
     * @param salarioSemanal double
     */
    public void establecerSalarioSemanal(double salarioSemanal){
        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanl debe ser >= 0.0");
        
        this.salarioSemanal = salarioSemanal;
    }
    /**
     * Devuelve el salario semanal
     * @return double
     */
    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
    /**
     * Devuelve los ingresos de empleado asalariado
     * @return 
     */
    @Override
    public double ingresos(){
        return obtenerSalarioSemanal();
    }
    /**
     * Devuelve representación String del objeto
     * @return String
     */
    @Override
    public String toString(){
        return String.format("empleado asalariado: %s%n%s: $%.2f",
                super.toString(), "salario semanal", obtenerSalarioSemanal());
    }
}