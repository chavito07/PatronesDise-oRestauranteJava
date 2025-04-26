package patronesdiseñorestaurante;

import java.util.ArrayList;
import java.util.List;

// Interfaz Observer
interface Observer {
    void update(String mensaje);
}

// Clase Sujeto (Publicador)
public class Pedido {
    private List<Observer> observers = new ArrayList<>();
    private String estado;

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    public void eliminarObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.update("El pedido está ahora en estado: " + estado);
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservers();
    }
}

// Clases Observadores
class Cocinero implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Cocinero notificado: " + mensaje);
    }
}

class Mesero implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Mesero notificado: " + mensaje);
    }
}

class Encargado implements Observer {
    @Override
    public void update(String mensaje) {
        System.out.println("Encargado notificado: " + mensaje);
    }
}