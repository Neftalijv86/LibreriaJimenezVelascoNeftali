package libreria;
/**
 * <p>Clase que permite crear instancias de libro con el control de stock y el saldo disponible</p>
 * @author Neftalí Jiménez Velasco
 * @version 1.0
 */
public class LibreriaJimenezVelascoNeftali2425T4 {
    /**
     * Atributos de la clase
     */
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom Devuelve el nombre de libro
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return devuelve el stock
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad modifica la cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return devuelve precio del libro
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio modifica el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return obtiene el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo modifica el saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Constructor sin argumentos
     * 
     */
    public LibreriaJimenezVelascoNeftali2425T4() {
    }

    /**
     * constructor con parámetros para inicializar todas las propiedades de la clase
     * @param nom
     * @param cantidad
     * @param precio
     * @param saldo 
     */
    public LibreriaJimenezVelascoNeftali2425T4(String nom, int cantidad, double precio, double saldo) {
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }

    /**
     * Método que devuelve el nombre del libro
     * @return Nombre del libro
     */
    public String obtenerNombre() {
        return getNom();
    }

    /**
     * Método que devuelve el precio del libro
     * @param concepto
     * @return Precio del libro
     */
    public double obtenerPrecio(java.lang.String concepto) {
        return getPrecio();
    }

    /**
     * Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
     * @return Stock
     */
    public int obtenerStock() {
        return getCantidad();
    }

    /**
     * Método para obtener el saldo en la cuenta
     * @return Saldo
     */
    public double obtenerSaldo() {
        return getSaldo();
    }

    /**
     * Método para aumentar el saldo
     * @param saldomas
     * @param concepto
     * @throws Exception Si se añade una cantidad negativa de libros
     */
    public void aumentarSaldo(double saldomas, java.lang.String concepto) throws Exception {
        if (saldomas <= 0) {
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        }
        setSaldo(getSaldo() + saldomas);
    }

    /**
     * Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
     * @param canti
     * @throws Exception Si se quiere retirar una cantidad negativa de libros, no tiene saldo suficiente o comprar por 
     * encima del stock disponible
     * 
     */
    public void comprarLibro(int canti) throws Exception {
        if (canti <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa de libros");
        }
        if (getCantidad() >= canti) {
            if (getSaldo() <= getPrecio()) {
                throw new Exception("No hay suficiente saldo para comprar");
            } else {
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        } else {
            throw new Exception("No se pueden comprar más libros de los que hay disponibles");
        }
/**
 * Mi proyecto JimenezVelascoNeftali2425T4
 */
    }
}
