package patronesdiseñorestaurante;

public class Restaurante {
    private static Restaurante instancia;

    private Restaurante() {
        // Constructor privado para evitar instanciación externa
    }

    public static Restaurante getInstancia() {
        if (instancia == null) {
            instancia = new Restaurante();
        }
        return instancia;
    }

    public void generarCodigoQR(String mesa) {
        System.out.println("Generando código QR para la mesa: " + mesa);
    }

    public void procesarPedido(String pedido) {
        System.out.println("Procesando pedido: " + pedido);
    }

    public void generarFactura(String pedido) {
        System.out.println("Generando factura para el pedido: " + pedido);
    }
}