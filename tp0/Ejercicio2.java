package ungs.prog2.tp0;

import ungs.prog2.tda.ColaInt;
import ungs.prog2.tda.PilaInt;

class Ejercicio2
{
    // Devuelve la posición del entero buscado, o -1 si no se encontró.
    int indiceElemento(int arr[], int elemento) {
        return indiceElementoRec(arr, elemento, 0, arr.length - 1);
    }
    
    // Función recursiva auxiliar.
    private int indiceElementoRec(int arr[], int elemento, int idx0, int idx1) {
        return -1;
    }
    
    static void invertirCola(ColaInt cola) {
    }
    
    static PilaInt mezclarPilas(PilaInt p1, PilaInt p2) {
        return null;
    }
}
