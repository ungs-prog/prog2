package ungs.prog2.tp0;

import ungs.prog2.tda.ColaInt;
import ungs.prog2.tda.PilaInt;

public class Ejercicio2
{
    // Devuelve la posición del entero buscado, o -1 si no se encontró.
    public static int buscarElemento(int elemento, int arr[]) {
        return buscarRec(elemento, arr, 0, arr.length - 1);
    }
    
    // Función recursiva auxiliar.
    private static int buscarRec(int elemento, int arr[], int idx0, int idx1) {
        return -1;
    }
    
    public static void invertirCola(ColaInt cola) {
    }
    
    public static PilaInt mezclarPilas(PilaInt p1, PilaInt p2) {
        return null;
    }
}
