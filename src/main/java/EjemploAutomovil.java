public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.fabricante="Renault";
        auto.cilindrada=200;
        auto.color="Rojo";
        auto.modelo="Megane";

        System.out.println("Los datos del automovil son:");
        System.out.println("Fabricante: " + auto.fabricante);
        System.out.println("Cilindrada: " + auto.cilindrada);
        System.out.println("Color: " + auto.color);
        System.out.println("Modelo: " + auto.modelo);
    }
}
