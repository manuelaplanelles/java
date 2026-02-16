package practicas.SistemaPagoECommerce;

/**
 * Clase abstracta que representa un método de pago genérico
 * Define el comportamiento común de todos los métodos de pago
 * @author Manuela Planelles
 * @version 1.0
 * @see TarjetaCredito
 * @see PayPal
 * @see Bizum
 */
public abstract class MetodoPago {

    /**
     * Constructor por defecto de MetodoPago
     */
    public MetodoPago() {
    }

    /**
     * Procesa un pago con el método de pago específico
     * Cada subclase debe implementar su propia lógica de procesamiento
     * @param importe Cantidad en euros a pagar
     */
    public abstract void procesarPago(double importe);
}