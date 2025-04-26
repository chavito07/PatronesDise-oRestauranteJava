package patronesdiseñorestaurante;

public class PatronesDiseñoRestaurante {
    public static void main(String[] args) {
        // Singleton
        Restaurante restaurante = Restaurante.getInstancia();
        restaurante.generarCodigoQR("Mesa 1");

        // Observer
        Pedido pedido = new Pedido();
        Cocinero cocinero = new Cocinero();
        Mesero mesero = new Mesero();
        Encargado encargado = new Encargado();

        pedido.agregarObserver(cocinero);
        pedido.agregarObserver(mesero);
        pedido.agregarObserver(encargado);

        pedido.setEstado("En preparación");
        pedido.setEstado("Preparado");
        pedido.setEstado("Entregado");

        // Factory Method
        Usuario cliente = UsuarioFactory.crearUsuario("cliente");
        cliente.realizarAccion();

        Usuario meseroUsuario = UsuarioFactory.crearUsuario("mesero");
        meseroUsuario.realizarAccion();
    }
}