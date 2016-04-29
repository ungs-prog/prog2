package ungs.prog2.abb;

public class ListaInt
{
    class Nodo
    {
        Integer valor;
        Nodo siguiente;

        Nodo(Integer x, Nodo sig) {
            valor = x;
            siguiente = sig;
        }
    }

    private Nodo primero;
    
    // Devuelve el largo de la lista.
    public int largo() {
        return largoAux(primero);
    }
    
    // Inserta un elemento al final de la lista.
    public void agregar(Integer x) {
        if (primero == null)
            primero = new Nodo(x, null);
        else
            agregarAux(primero, x);
    }
    
    // Elimina el último elemento de la lista, y lo devuelve.
    public Integer eliminarUltimo() {
        if (primero == null) {
            return null;
        }
        else if (primero.siguiente == null) {
            Integer x = primero.valor;
            primero = null;
            return x;
        }
        return eliminarUltimoAux(primero, primero.siguiente);
    }

    // Devuelve true si la lista está vacía.
    public boolean vacia() {
        return (primero == null);
    }

    // Funciones auxiliares, implementadas iterativamente.
    
    protected int largoAux(Nodo nodo) {
        return -1;
    }
    
    protected void agregarAux(Nodo nodo, Integer x) {
    }
    
    protected Integer eliminarUltimoAux(Nodo anterior, Nodo actual) {
        return null;
    }
}
