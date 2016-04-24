package ungs.prog2.tp0;

import ungs.prog2.tda.ColaInt;
import ungs.prog2.tda.PilaInt;

public class Ejercicio2
{
    // Devuelve la posición del entero buscado, o -1 si no se encontró.
    public static int indiceElemento(int arr[], int elemento) {
        return indiceElementoRec(arr, elemento, 0, arr.length - 1);
    }
    
    // Función recursiva auxiliar.
    private static int indiceElementoRec(int arr[], int elemento, int idx0, int idx1) {
        return -1;
    }
    
    public static void invertirCola(ColaInt cola) {
    }
    
    public static PilaInt mezclarPilas(PilaInt p1, PilaInt p2) {
        return null;
    }
}
