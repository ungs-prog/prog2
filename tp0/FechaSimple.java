package ungs.prog2.tp0;

public class FechaSimple {

    private int dia;
    private int mes;
    private int año;

    // Función de validación: devuelve ‘true’ si dia/mes/año
    // es una fecha válida.
    //
    // FechaSimple es válida si ‘dia’ está entre 1 y 31, ‘mes’
    // entre 1 y 12 y ‘año’ entre 1 y 9999.
    //
    // Es decir, FechaSimple es una variante simplificada del calendario
    // gregoriano en la que todos los meses tienen el mismo número de días.
    private boolean validos(int dia, int mes, int año) {
        return false;
    }

    // Construye un objeto de tipo Fecha, usando la función
    // validos() para validar. Si la fecha no es válida, lanza
    // la excepción RuntimeException, incluyendo el valor de
    // la fecha inválida.
    public FechaSimple(int dia, int mes, int año) {
    }

    // Avanza la fecha un número días (se debe validar que
    // ‘numDias’ es un entero positivo).
    public void avanzarDias(int numDias) {
    }

    // Devuelve el número de días desde una fecha a otra. Devuelve
    // un valor positivo si this >= otra, negativo en caso contrario.
    public int diferencia(FechaSimple otra) {
        return 0;
    }

    @Override
    public String toString() {
        return format(dia, mes, año);
    }

    private String format(int dia, int mes, int año) {
        return dia + "/" + mes + "/" + año;
    }
}
