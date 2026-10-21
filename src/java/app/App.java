package app;

public class App {

    public static EstrategiaTarifa elegirTarifa(String tipo) {
        EstrategiaTarifa estrategia = null;
        switch (tipo) {
            case "ESTUDIANTE":
                estrategia = new TarifaEstudiante();
                break;
            case "DOCENTE":
                estrategia = new TarifaDocente();
                break;
            case "VISITANTE":
                estrategia = new TarifaVisitante();
                break;
            default:
                System.out.println("Tipo de usuario no válido");
                break;
        }
        return estrategia;
    }

    public static void main(String[] args) {

        Ticket ticket1 = new Ticket("ABC123", 5, elegirTarifa("ESTUDIANTE"));
        Ticket ticket2 = new Ticket("XYZ789", 5, elegirTarifa("DOCENTE"));
        Ticket ticket3 = new Ticket("JKL456", 5, elegirTarifa("VISITANTE"));

        ticket1.mostrarResumen();
        ticket2.mostrarResumen();
        ticket3.mostrarResumen();


        System.out.println("El visitante presenta carné de estudiante");
        ticket3.setEstrategia(new TarifaEstudiante());
        ticket3.mostrarResumen();
    }
}