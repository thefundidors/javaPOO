public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();
        auto.setFabricante("Renault");
        auto.setCilindrada(200);
        auto.setColor("Rojo");
        auto.setModelo("Megane");



        auto.detalle();

        System.out.println(auto.acelerar(300));
        System.out.println(auto.frenar());
        System.out.println(auto.acelerarFrenar(500));

        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 0.75f));
        System.out.println("Kilometros por litro " + auto.calcularConsumo(300, 75));
    }
}
