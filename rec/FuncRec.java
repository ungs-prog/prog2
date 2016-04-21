class FuncRec {

    // Versión iterativa de sumar().
    static int sumarIter(int arr[]) {
        int suma = 0;
    
        for (int i=0; i < arr.length; i++)
            suma = suma + arr[i];
    
        return suma;
    }

    static int sumarRec2(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        return sumarAux(arr, 0);
    }
    
    private static int sumarAux(int arr[], int pos) {
        if (pos == arr.length - 1) {
            return arr[pos];
        }
        return arr[pos] + sumarAux(arr, pos + 1);
    }

    /*******/

    static int minimoRec2(int arr[]) {
        if (arr.length == 0) {
            return -1;  // ¿Qué valor usar?
        }
        return minimoAux2(arr, 1, arr[0]);
    }
    
    private static int minimoAux2(int arr[], int pos, int minimoParcial) {
        int nuevoParcial = Math.min(arr[pos], minimoParcial);
        if (pos == arr.length - 1) {
          return nuevoParcial;  // Es el final.
        }
        return minimoAux2(arr, pos + 1, nuevoParcial);
    }

    static int minimoRec1(int arr[]) {
        if (arr.length == 0) {
            return -1;  // ¿Qué valor usar?
        }
        return minimoAux1(arr, 0);
    }
    
    private static int minimoAux1(int arr[], int pos) {
        if (pos == arr.length - 1) {
          return arr[pos];
        }
        return Math.min(arr[pos], minimoAux1(arr, pos + 1));
    }

    /*******/

    static int sumarRec1(int arr[]) {
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length > 1) {
          return arr[0] + sumarRec1(borrarPrimero(arr));
        }
        return 0;  // En caso de que nos pasen un arreglo vacío.
    }

    // TODO: implementar borrarPrimero().
    // Devuelve una copia del arreglo sin su primer elemento.
    static int[] borrarPrimero(int[] arreglo) {
        return null;
    }
}
