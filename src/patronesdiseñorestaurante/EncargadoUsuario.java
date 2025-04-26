package patronesdiseñorestaurante;

public class EncargadoUsuario implements Usuario {
    @Override
    public void realizarAccion() {
        System.out.println("Encargado está gestionando el restaurante.");
    }
}