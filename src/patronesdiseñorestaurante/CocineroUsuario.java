package patronesdiseñorestaurante;

public class CocineroUsuario implements Usuario {
    @Override
    public void realizarAccion() {
        System.out.println("Cocinero está preparando un pedido.");
    }
}