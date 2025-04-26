package patronesdiseñorestaurante;



public class Cliente implements Usuario {
    @Override
    public void realizarAccion() {
        System.out.println("Cliente está realizando un pedido.");
    }
}
