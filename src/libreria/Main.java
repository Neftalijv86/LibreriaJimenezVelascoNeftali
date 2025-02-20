
package libreria;
/**
 * Crear instancias de LibreriaJimenezVelascoNeftali2425T4
 * @author Neftalí Jiménez Velasco
 * @version 1.0
 */
public class Main {
    /**
     * Método main pra iniciar el programa.
     * @param args Línea de comandos
     */
    public static void main(String[] args) {
        LibreriaJimenezVelascoNeftali2425T4 miLibreriaJimenezVelascoNeftali2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaJimenezVelascoNeftali2425T4 = new LibreriaJimenezVelascoNeftali2425T4("Don Quijote de la Mancha", 10, 45, 120);
        
        compraQuijoteJimenezVelascoNeftali2425T4(miLibreriaJimenezVelascoNeftali2425T4);
        
        saldoActual = miLibreriaJimenezVelascoNeftali2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaJimenezVelascoNeftali2425T4.obtenerNombre();
        stock = miLibreriaJimenezVelascoNeftali2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        añadeIngresoJimenezVelascoNeftali2425T4(miLibreriaJimenezVelascoNeftali2425T4);
    }
    /**
     * Método que añade un ingreso a la cuenta de la librería.
     * @param miLibreriaJimenezVelascoNeftali2425T4 Instancia de la librería.
     */
    public static void añadeIngresoJimenezVelascoNeftali2425T4(LibreriaJimenezVelascoNeftali2425T4 miLibreriaJimenezVelascoNeftali2425T4) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaJimenezVelascoNeftali2425T4.aumentarSaldo(ingreso, "Libro vendido");
            saldoActual = miLibreriaJimenezVelascoNeftali2425T4.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
    /**
     * Método que gestiona la compra de una instancia. (En este caso Don Quijote de la Mancha)
     * @param miLibreriaJimenezVelascoNeftali2425T4 Instancia de la librería.
     */
    private static void compraQuijoteJimenezVelascoNeftali2425T4(LibreriaJimenezVelascoNeftali2425T4 miLibreriaJimenezVelascoNeftali2425T4) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaJimenezVelascoNeftali2425T4.obtenerPrecio(null);
            saldoActual = miLibreriaJimenezVelascoNeftali2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaJimenezVelascoNeftali2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
    /**
 * Mi proyecto JimenezVelascoNeftali2425T4
 */
}
