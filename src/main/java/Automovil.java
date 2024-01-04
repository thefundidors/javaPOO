public class Automovil {

    String fabricante;
    String modelo;
    String color;
    double cilindrada;


    public void detalle(){
        System.out.println("Los datos del automovil son:");
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Color: " + this.color);
        System.out.println("Modelo: " + this.modelo);
    }
}
