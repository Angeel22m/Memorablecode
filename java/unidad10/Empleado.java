
public abstract class Empleado implements PorPagar{
    /**
     * Primer nombre
     */
    private final String primerNombre;
    /**
     * Apellido paterno
     */
    private final String apellidoPaterno;
    /**
     * Número seguro social
     */
    private final String numeroSeguroSocial;
    /**
     * Constructor de 3 parametros
     * @param primerNombre String
     * @param apellidoPaterno String
     * @param numeroSeguroSocial String
     */
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    /**
     * Devuelve el primer nombre
     * @return String
     */
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    /**
     * Devuelve el apellido paterno
     * @return String
     */
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    /**
     * Devuelve el número de seguro social
     * @return String
     */
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    /**
     * Devuelve representación String del objeto
     * @return String
     */
    @Override
    public String toString(){
        return String.format("%s %s%nnúmero de seguro social: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }
    /**
     * Implementación de la interfaz PorPagar, esto es para no hacer ninguna modificación al código, simplemente
     * se llama al método ingresos
     * @return double
     */
    @Override
    public double obtenerMontoPago(){
        return ingresos();
    }
    //metodo abstracto sobreescrito por las clases concretas
    public abstract double ingresos();
}