public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.fabricante="Renault";
        auto.cilindrada=200;
        auto.color="Rojo";
        auto.modelo="Megane";


        auto.detalle();

        System.out.println(auto.acelerar(300));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(500));
    }
}
