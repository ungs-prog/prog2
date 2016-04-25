package ungs.prog2.tp0.opcional;

public class PilaArr
{
    // Ejercicio OPCIONAL. Cambiar RESUELTO a ‘true’ en caso de
    // implementarlo.
    public static final boolean RESUELTO = false;

    public static final int TAM_INICIAL = 8;
    public static final int FACTOR_REDIM = 2;

    private int[] elems;
    // ...

    public PilaArr() {
        elems = new int[TAM_INICIAL];
        // ...
    }

    public void apilar(int x) {
        // Duplicar el tamaño del arreglo si no queda espacio.
    }

    public int desapilar() {
        // Dividir por ‘FACTOR_REDIM’ el tamaño del arreglo si hay
        // un 75% de espacio, pero sin bajar de ‘TAM_INICIAL’.
        return -1;
    }

    public int tope() {
        return -1;
    }

    public boolean vacia() {
        return false;
    }
}
