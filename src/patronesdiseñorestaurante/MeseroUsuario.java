package patronesdiseñorestaurante;

public class MeseroUsuario implements Usuario {
    @Override
    public void realizarAccion() {
        System.out.println("Mesero está entregando un pedido.");
    }
}