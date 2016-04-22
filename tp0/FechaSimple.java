package ungs.prog2.tp0;

// TODO: write docs.

public class FechaSimple {

    private int dia;
    private int mes;
    private int año;

    public FechaSimple(int dia, int mes, int año) {
    }

    public void avanzarDias(int numDias) {
    }

    public int diferencia(FechaSimple otra) {
        return 0;
    }

    private boolean validos(int dia, int mes, int año) {
        return false;
    }

    @Override
    public String toString() {
        return format(dia, mes, año);
    }

    private String format(int dia, int mes, int año) {
        return dia + "/" + mes + "/" + año;
    }
}
