package model;

public class Ticket {

    private String placa;
    private int horas;
    private EstrategiaTarifa estrategia;

    public Ticket(String placa, int horas, EstrategiaTarifa estrategia) {
        this.placa = placa;
        this.horas = horas;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal() {
        return estrategia.calcularCosto(horas);
    }

    public void mostrarResumen() {
        System.out.println("Placa: " + placa);
        System.out.println("Tipo de usuario: " + estrategia.getNombre());
        System.out.println("Horas: " + horas);
        System.out.println("Total a pagar: $" + calcularTotal());
        System.out.println("-------------------------");
    }
}
