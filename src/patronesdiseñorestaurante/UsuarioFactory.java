package patronesdiseñorestaurante;

public class UsuarioFactory {
    public static Usuario crearUsuario(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cliente":
                return new Cliente();
            case "mesero":
                return new MeseroUsuario();
            case "cocinero":
                return new CocineroUsuario();
            case "encargado":
                return new EncargadoUsuario();
            default:
                throw new IllegalArgumentException("Tipo de usuario no válido.");
        }
    }
}