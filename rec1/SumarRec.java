package ungs.prog2.rec1;

class SumarRec {

    // Versión iterativa de sumar().
    static int sumarIter(int arr[]) {
        int suma = 0;
    
        for (int i=0; i < arr.length; i++)
            suma = suma + arr[i];
    
        return suma;
    }

    // Versión recursiva con índice.
    static int sumarRec1(int arr[]) {
        // Manejar primero el caso de un arreglo vacío.
        if (arr.length == 0) {
            return 0;
        }
        // Llamada a la función auxiliar recursiva.
        return sumarAux1(arr, 0);
    }

    private static int sumarAux1(int arr[], int pos) {
        // Caso base: pos es el último índice del arreglo.
        if (pos == arr.length - 1) {
            return arr[pos];
        }
        // Caso recursivo: incrementar índice en 1.
        return arr[pos] + sumarAux1(arr, pos + 1);
    }

    // Versión recursiva con copia del arreglo.
    //
    // Cuidado: borrarPrimero() es O(n), por lo que
    // la complejidad final de sumarRec() es O(n²)!
    static int sumarRec(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length > 1) {
          return arr[0] + sumarRec(borrarPrimero(arr));
        }
        return 0;  // En caso de que nos pasen un arreglo vacío.
    }

    // TODO: Ejercicio 1: implementar borrarPrimero().
    // Devuelve una copia del arreglo sin su primer elemento.
    static int[] borrarPrimero(int arreglo[]) {
        return null;
    }
}
