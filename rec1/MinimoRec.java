package ungs.prog2.rec1;

class MinimoRec {

    // Versión iterativa con Math.min().
    static int minimoIter2(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        int minimoParcial = arr[0];
    
        for (int i=1; i < arr.length; i++)
            minimoParcial = Math.min(arr[1], minimoParcial);
    
        return minimoParcial;  // Resultado final.
    }

    // Versión con posición.
    static int minimoRec1(int arr[]) {
        // Manejar primero el caso de un arreglo vacío.
        if (arr.length == 0) {
            return -1;
        }
        // Llamada a la función auxiliar recursiva.
        return minimoAux1(arr, 0);
    }
    
    private static int minimoAux1(int arr[], int pos) {
        // Caso base: pos es el último índice del arreglo.
        if (pos == arr.length - 1) {
          return arr[pos];
        }
        // Caso recursivo: incrementar índice en 1.
        return Math.min(arr[pos], minimoAux1(arr, pos + 1));
    }

    // Versión con posición y acumulador (resultado parcial).
    static int minimoRec2(int arr[]) {
        if (arr.length == 0) {
            return -1;
        }
        // El primer "minimoParcial" es el primer elemento.
        return minimoAux2(arr, 1, arr[0]);
    }

    private static int minimoAux2(int arr[], int pos, int minimoParcial)
    {
        int nuevoParcial = Math.min(arr[pos], minimoParcial);
    
        if (pos == arr.length - 1) {
          return nuevoParcial;  // Es el final.
        }
        return minimoAux2(arr, pos + 1, nuevoParcial);
    }

}
