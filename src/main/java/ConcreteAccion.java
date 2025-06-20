import parrotti.framework.Accion;

public class ConcreteAccion implements Accion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando ConcreteAccion...");
    }

    @Override
    public String nombreItemMenu() {
        return "ConcreteAccion";
    }

    @Override
    public String descripcionItemMenu() {
        return "Esto es para traer los twitts de José...";
    }
}
