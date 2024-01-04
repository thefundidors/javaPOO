public class Automovil {

    private String fabricante;
    private String modelo;
    private String color;
    private double cilindrada;
    private int capacidadEstanque = 40;


    public void detalle(){
        System.out.println("Los datos del automovil son:");
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Color: " + this.color);
        System.out.println("Modelo: " + this.modelo);
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return fabricante + " " + modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(capacidadEstanque*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(capacidadEstanque*(porcentajeBencina/100f));
    }
}
