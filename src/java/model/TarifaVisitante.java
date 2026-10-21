package model;

public class TarifaVisitante implements EstrategiaTarifa {

    private static final double VALOR_HORA = 3000;
    private static final double VALOR_MINIMO = 6000;

    @Override
    public double calcularCosto(int horas) {
        double total = horas * VALOR_HORA;
        if (total < VALOR_MINIMO) {
            total = VALOR_MINIMO;
        }
        return total;
    }

    @Override
    public String getNombre() {
        return "Visitante";
    }
}
